import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity711();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        executionEntity2.processDefinitionId = "hi!";
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity2.getVariables();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1068();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        executionEntity4.forceUpdate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        long long0 = org.activiti.engine.impl.persistence.entity.ExecutionEntity.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior122();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition379();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity7.tasks;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNull(taskEntityList8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition567();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        executionEntity2.processDefinitionId = "hi!";
        executionEntity2.ensureProcessInstanceInitialized();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity670();
        executionEntity5.setEventScope(true);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        executionEntity4.executionListenerIndex = '4';
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity948();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior16();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity72();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = executionEntity4.processInstance;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNull(executionEntity5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity79();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        executionEntity3.setdeleteRoot(false);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition542();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity275();
        java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList6 = executionEntity5.getAllChildExecutions();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntityList6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior5();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity575();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior187();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        executionEntity1.businessKey = "";
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.superExecution;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1056();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition623();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity670();
        boolean boolean6 = executionEntity5.getdeleteRoot();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        int int2 = executionEntity1.suspensionState;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity429();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1444();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity693();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior883();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1525();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition82();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition680();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1424();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior675();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior7.getTaskDefinition();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior211();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior674();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1228();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity666();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1730();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition515();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1564();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition389();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1725();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1312();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior505();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity918();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1309();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1412();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior211();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior694();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity384();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1220();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1583();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition327();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1056();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition536();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1064();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        executionEntity3.ensureProcessDefinitionInitialized();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity5 = null;
        executionEntity3.addTask(taskEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1322();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity974();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior478();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition465();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity849();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1085();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1605();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity923();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition873();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1072();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity6 = null;
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter7.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter7.deserializeObjectExecutionEntity719();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior5.handleAssignments(taskEntity6, (org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity238();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1450();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1070();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity7.tasks;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNull(taskEntityList8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1291();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition806();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior844();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior702();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity4 = null;
        executionEntity3.removeJob(jobEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior159();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity429();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity209();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity13();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1124();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition519();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior102();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior691();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition71();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1055();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1583();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition193();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity949();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity995();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1477();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1748();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity964();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter5 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter5.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter5.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter5.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter5.deserializeObjectTaskDefinition870();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter5.deserializeObjectExecutionEntity943();
        executionEntity4.setSuperExecution(executionEntity14);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(taskDefinition13);
        org.junit.Assert.assertNotNull(executionEntity14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity342();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition472();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior118();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior927();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior190();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition330();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior333();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior764();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition759();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1309();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity485();
        executionEntity5.ensureExecutionsInitialized();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1263();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition115();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1366();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        executionEntity1.businessKey = "hi!";
        org.junit.Assert.assertNotNull(executionEntity1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = executionEntity5.subProcessInstance;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(executionEntity6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1700();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1024();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior620();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity842();
        executionEntity2.destroy();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior333();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior764();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior832();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition673();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior849();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity298();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity6.performOperation(atomicOperation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition137();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition666();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior757();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior491();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1045();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1118();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1481();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior887();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition292();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1627();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior38();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1417();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity842();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior526();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1370();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = executionEntity5.getVariableNames();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition432();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1173();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1108();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior672();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition119();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior972();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior951();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior976();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity664();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1077();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior39();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1047();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition36();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1697();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity906();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition432();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1173();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition656();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition23();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1594();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity873();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior901();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1096();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1575();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        executionEntity7.inactivate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1597();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior831();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior539();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition374();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity95();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1662();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior691();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity842();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1752();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior761();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior7();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1744();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity953();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior93();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1589();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity720();
        executionEntity3.cachedEntityState = (short) 1;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity57();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1282();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior730();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1057();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity257();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1011();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1710();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        executionEntity7.forceUpdate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1376();
        org.activiti.engine.impl.persistence.entity.TaskEntity[] taskEntityArray4 = new org.activiti.engine.impl.persistence.entity.TaskEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList5 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.TaskEntity>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.TaskEntity>) taskEntityList5, taskEntityArray4);
        executionEntity3.tasks = taskEntityList5;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskEntityArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior333();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior764();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior724();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1189();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity675();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1449();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior317();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter4 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter4.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter4.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter4.deserializeObjectExecutionEntity225();
        boolean boolean9 = executionEntity7.hasVariableLocal("");
        executionEntity3.superExecution = executionEntity7;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition730();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1271();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition432();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity794();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1271();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1006();
        executionEntity7.destroy();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity318();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity619();
        boolean boolean7 = executionEntity6.isConcurrent();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1013();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior503();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1309();
        executionEntity4.isEventScope = true;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1710();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity63();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition447();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition241();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior562();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior15();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior691();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior85();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior596();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior980();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1064();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior959();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior687();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition690();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition635();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior949();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior79();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition866();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior93();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition174();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity945();
        boolean boolean4 = executionEntity3.getisActive();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior25();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1373();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1133();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition870();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition646();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior704();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1573();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity883();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition623();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior505();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity805();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity228();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1456();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity939();
        executionEntity7.superExecutionId = "hi!";
        int int10 = executionEntity7.revision;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1338();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList6 = executionEntity5.queryVariables;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(variableInstanceEntityList6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior951();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition394();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1216();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior33();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior526();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity768();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        executionEntity6.removeJobs();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition19();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity752();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior650();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior563();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior923();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity885();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition429();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition248();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity653();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior751();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1594();
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList4 = executionEntity3.jobs;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNull(jobEntityList4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1318();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1046();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity875();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity225();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity108();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior858();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1485();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity21();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition868();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition873();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior300();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity708();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity102();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition798();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(taskDefinition13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition465();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior9();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1064();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition251();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        executionEntity2.suspensionState = 0;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity984();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity415();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1428();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior951();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition394();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1216();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity79();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior943();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition722();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior725();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1252();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior772();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1169();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior128();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity238();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity843();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity393();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior797();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior667();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1311();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1020();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior204();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1630();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity552();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity824();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity502();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior332();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition823();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition372();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity502();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior757();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity543();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity942();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity496();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1734();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1077();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1399();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior300();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition873();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior300();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition200();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1288();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity542();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.replacedBy;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNull(executionEntity7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1274();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity647();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1040();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior583();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior526();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1370();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior702();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1601();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1597();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1074();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1606();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior144();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1486();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior958();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity298();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior936();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1313();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1070();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity22();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior202();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior557();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior512();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior93();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1589();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition368();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity502();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1120();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition247();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior433();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1254();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition411();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1007();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior333();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity873();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity60();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity928();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition795();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity917();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation7 = executionEntity6.getnextOperation();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNull(atomicOperation7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition698();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior555();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity89();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity678();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition618();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition144();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity109();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior976();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity782();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition374();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity95();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1662();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior59();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior422();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity928();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior634();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1748();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity964();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = executionEntity4.getCachedElContext();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNull(eLContext5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity57();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity583();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition854();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity525();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1573();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1480();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity873();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1255();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1050();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1420();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1077();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior766();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1399();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1014();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition16();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1156();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity7();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity78();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity893();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior471();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1184();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior156();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior125();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1436();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior725();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition487();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1243();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity883();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity971();
        executionEntity5.ensureProcessInstanceInitialized();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1056();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1171();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1116();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1263();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1390();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1249();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition389();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition57();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1547();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition414();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1475();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior682();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1542();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior919();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1318();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1046();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition277();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition432();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1173();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition656();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity233();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition469();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior6();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity801();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior201();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity437();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1124();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1698();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1078();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior524();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity15();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1442();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1167();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior204();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1630();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition284();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior437();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior827();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior427();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition229();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior206();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1324();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition871();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior672();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1719();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity33();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition573();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1045();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1118();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior68();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition691();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition673();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1577();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity213();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition372();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity945();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition326();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior310();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition681();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior355();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity32();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior317();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity89();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1207();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior782();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition218();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity291();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1650();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1456();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1046();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition545();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition281();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1363();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1222();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        executionEntity6.inactivate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1064();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1589();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition595();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior93();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior54();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition119();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior916();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior123();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior505();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity805();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity952();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior900();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1162();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition456();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1324();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1604();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior899();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1582();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1243();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1560();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition548();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior716();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity935();
        int int5 = executionEntity4.getTASKS_STATE_BIT();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition375();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior961();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1056();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition536();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition377();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1457();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1747();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1079();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity763();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity771();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition375();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior685();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1533();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition134();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1274();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity647();
        executionEntity4.ensureProcessDefinitionInitialized();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1421();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior25();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior245();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1569();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity238();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1752();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity57();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1282();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior730();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1470();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition119();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition605();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition368();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1158();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1656();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity564();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior204();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition663();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity882();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition163();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity810();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1519();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity653();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior662();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior873();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior760();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1338();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity447();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity883();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity971();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition319();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior894();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity23();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1039();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior757();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity942();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity384();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity880();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1104();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition660();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1085();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity191();
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList5 = executionEntity4.getEventSubscriptions();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(eventSubscriptionEntityList5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1243();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition27();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior611();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1517();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity878();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior654();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior596();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity643();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior856();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1318();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1046();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior859();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity275();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1613();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior29();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity496();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition638();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior956();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition229();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior310();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity333();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior648();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior6();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity801();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity889();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity935();
        java.lang.String str5 = executionEntity4.businessKey;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1564();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1624();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition645();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1586();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition91();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior757();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition720();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition229();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition815();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity492();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition15();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition46();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1247();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1541();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity609();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1195();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity9.removeVariables((java.util.Collection<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior306();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1613();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1748();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity964();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1720();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior752();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity973();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior25();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity72();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior47();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity657();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity275();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1613();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior14();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        java.util.Set<java.lang.String> strSet2 = executionEntity1.getVariableNames();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = executionEntity1.findExecution("");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(executionEntity4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition666();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition84();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity443();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition578();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition19();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity752();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1556();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1704();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition129();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity102();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition773();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(taskDefinition13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1030();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition590();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior953();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1291();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity498();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior931();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior887();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity812();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1222();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior520();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior892();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1055();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity666();
        java.lang.String str7 = executionEntity6.getBusinessKey();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1573();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior708();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition116();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition868();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1156();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity967();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1618();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1085();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity191();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity764();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior611();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity437();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity321();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement6 = executionEntity5.eventSource;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNull(pvmProcessElement6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior562();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior294();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior814();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition823();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior419();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition7();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition137();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity600();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.slf4j.Logger logger7 = executionEntity6.getlog();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1542();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity60();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1633();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition429();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition248();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior179();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior891();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1494();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity731();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior466();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior900();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1749();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1576();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior688();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity328();
        java.lang.String str5 = executionEntity4.getCurrentActivityName();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "my task" + "'", str5, "my task");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1085();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition801();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity121();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition7();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity373();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1616();
        executionEntity7.inactivate();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity719();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior779();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity445();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior27();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior471();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1184();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition333();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior122();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior538();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1225();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity384();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1454();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1456();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1405();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1051();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity883();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity971();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition319();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1678();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1019();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1338();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity828();
        java.lang.String str7 = executionEntity6.toString();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProcessInstance[6040]" + "'", str7, "ProcessInstance[6040]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity984();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition765();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity692();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity275();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior945();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior482();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition644();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1516();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity261();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSourceActivityExecution();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1573();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1730();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1696();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior396();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1126();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity634();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1045();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity949();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1327();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition730();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity655();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition375();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition539();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition749();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity841();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior808();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity807();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition116();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity812();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition711();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity353();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation6 = null;
        executionEntity5.nextOperation = atomicOperation6;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        executionEntity4.ensureProcessDefinitionInitialized();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition854();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity844();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior967();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition701();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition23();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1097();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition162();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition796();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition300();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition494();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1204();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity942();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity384();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior481();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior202();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior575();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior900();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1749();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior685();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior861();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity636();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior275();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1013();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1515();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1725();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior643();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1475();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior578();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity197();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition366();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity556();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity894();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition398();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1486();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1266();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior388();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition47();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior595();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity15();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution7 = null;
        executionEntity6.startingExecution = startingExecution7;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition374();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior224();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition783();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior814();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition119();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1679();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity735();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1057();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior46();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition429();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition248();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior437();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior827();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition220();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior493();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity945();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity701();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1519();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1624();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior400();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior900();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition118();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior277();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior249();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior607();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        executionEntity7.removeEventScopes();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1583();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity355();
        java.lang.String str9 = executionEntity8.getName();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior74();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity101();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity255();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1212();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity89();
        executionEntity7.isActive = true;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1326();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition683();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1710();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1350();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1055();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1583();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1656();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity79();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity563();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior990();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition254();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity945();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition326();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1710();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity63();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition447();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1238();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1301();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1542();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior105();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition498();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1055();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior204();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition125();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior711();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior322();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior380();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior556();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior499();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1555();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition688();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition684();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior951();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition107();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior585();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1498();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity928();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity4.getTransition();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNull(transitionImpl5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior11();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior581();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1392();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior678();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1113();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior44();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity497();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity869();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior691();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1081();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1267();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1030();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1522();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1285();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1697();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior574();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior495();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior784();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity787();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition64();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior867();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity753();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1429();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1023();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1045();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition146();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity552();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior788();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition796();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior391();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior672();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1141();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior512();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior509();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition644();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1390();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity220();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity6.getProcessVariables();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior111();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior965();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior362();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1269();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition532();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        executionEntity1.businessKey = "hi!";
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter4 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter4.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter4.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior1475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter4.deserializeObjectTaskDefinition90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter4.deserializeObjectUserTaskActivityBehavior1624();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter4.deserializeObjectExecutionEntity104();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition472();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1175();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition646();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity502();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition271();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior359();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity949();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition398();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition375();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior855();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition128();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior372();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition119();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior15();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior980();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity652();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition566();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition352();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition44();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity757();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition374();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition476();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition290();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1324();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1557();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition52();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1443();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior59();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition784();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior769();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity202();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity846();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior145();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity288();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior298();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1240();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity218();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior368();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity882();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior391();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior980();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity101();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity29();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution9 = null;
        executionEntity8.startingExecution = startingExecution9;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior963();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior183();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity399();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1643();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition64();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity602();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition384();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition579();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition833();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition46();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1247();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition402();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1533();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1625();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1080();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity682();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior848();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition243();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition831();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1743();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity429();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior983();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition849();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1156();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity782();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior51();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior106();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1375();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition804();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity942();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior482();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior970();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1583();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity246();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior303();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1225();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition666();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition84();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior200();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1590();
        executionEntity8.forceUpdate();
        boolean boolean10 = executionEntity8.isScope;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior558();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity990();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity620();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1115();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity558();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1732();
        executionEntity7.ensureJobsInitialized();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1404();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1263();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity488();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1343();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior330();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior74();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity466();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity7 = null;
        executionEntity6.removeJob(jobEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1052();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition870();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity943();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity397();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity764();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1450();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition101();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1167();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1070();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity22();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior84();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior584();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity266();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity23();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1444();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition482();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition6();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition470();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity487();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1590();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition330();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1500();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior691();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior85();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity412();
        executionEntity8.setisOperating(true);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior545();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1293();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition344();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition494();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition666();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity549();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1322();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.getProcessInstance();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity984();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior302();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior264();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition510();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior628();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1345();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition659();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior136();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1677();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity928();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1075();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior732();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity760();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1074();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1606();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity882();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1102();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition415();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1632();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior791();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition64();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior867();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition811();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition429();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition248();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity653();
        long long8 = executionEntity7.getserialVersionUID();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior507();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1303();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1089();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1126();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity9.performOperation(atomicOperation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity949();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition140();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1142();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition445();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1291();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity498();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1524();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter7.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1172();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter12 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter12.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter12.deserializeObjectUserTaskActivityBehavior414();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter12.deserializeObjectUserTaskActivityBehavior70();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter12.deserializeObjectUserTaskActivityBehavior331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = serializedObjectSupporter12.deserializeObjectUserTaskActivityBehavior530();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = serializedObjectSupporter12.deserializeObjectExecutionEntity498();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = executionEntity5.setVariableLocal("hi!", (java.lang.Object) serializedObjectSupporter7, executionEntity18);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior17);
        org.junit.Assert.assertNotNull(executionEntity18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition673();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition598();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior628();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior432();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1110();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition117();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity275();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1285();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity76();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity639();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1521();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1164();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1215();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1582();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity950();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition718();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior261();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1053();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity949();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1327();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition837();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior526();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1370();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior702();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition677();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior53();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1262();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition581();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior28();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior384();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1428();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior246();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1345();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity957();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity419();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition61();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }
}

