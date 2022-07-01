import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition392();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1121();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition611();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior866();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition264();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior982();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1021();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity609();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1473();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior325();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity239();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior115();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior910();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior18();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity234();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior846();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior889();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition710();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior716();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1059();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition522();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity908();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity892();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity208();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition28();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior95();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition225();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity88();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1102();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity91();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1211();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition351();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1562();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1706();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity66();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition656();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1727();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1260();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition567();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition418();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity654();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior778();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition305();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1691();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior362();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1712();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior276();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior542();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition336();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior132();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1572();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1370();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1361();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior339();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition686();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior113();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1313();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1265();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity836();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1622();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1133();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity991();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1177();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior781();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior387();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1361();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1566();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior339();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition686();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior113();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1146();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition742();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition589();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior386();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity726();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior197();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition647();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity481();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1459();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior570();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition15();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior886();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior962();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1361();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior565();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior773();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior487();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity927();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity977();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1054();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior672();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition687();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior541();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1602();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition515();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior78();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior253();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1564();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1103();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior367();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1532();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity763();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity888();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity429();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior374();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior910();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity936();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior438();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1126();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1130();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1616();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1432();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition584();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition69();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1644();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1034();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1673();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition457();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity738();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition809();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity38();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity85();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition660();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior60();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1691();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1660();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition541();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1025();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior777();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity125();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior812();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior678();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity729();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition858();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity349();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity609();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1282();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior867();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition198();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1213();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior809();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior633();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior181();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity282();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1379();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition595();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition849();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity403();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition2();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter0.deserializeObjectExecutionEntity830();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior838();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter0.deserializeObjectExecutionEntity305();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = serializedObjectSupporter0.deserializeObjectTaskDefinition321();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(taskDefinition14);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(executionEntity17);
        org.junit.Assert.assertNotNull(taskDefinition18);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior881();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior43();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1661();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior49();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        executionEntity5.setisEnded(true);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior982();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition114();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity317();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1592();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity305();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1561();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition656();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition830();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior881();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity658();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity768();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1044();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior901();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior150();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition484();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1587();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity319();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition68();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity307();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition755();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior316();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity29();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity765();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1023();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior18();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior63();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity234();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition693();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior592();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity879();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition270();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1011();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity206();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition24();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1160();
        executionEntity6.setTenantId("oneTaskProcess:2:3194");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1511();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity496();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition380();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition401();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity307();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity796();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity648();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior588();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1430();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1137();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior102();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition694();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition245();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity967();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1334();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1477();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1671();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity94();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition770();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1436();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition13();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition624();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior592();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1402();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition294();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior678();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1629();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior998();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition689();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition197();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity718();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition392();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity234();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1536();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity782();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity351();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1285();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior344();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity790();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1747();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior169();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1329();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition698();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1400();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior694();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity609();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1473();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition587();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1396();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1037();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1249();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity197();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior630();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition471();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior328();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity695();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior120();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition341();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1026();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1035();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity241();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity13.eventSource;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNull(pvmProcessElement14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity406();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1349();
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition69();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition219();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1207();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1442();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1627();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1415();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity231();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1203();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1287();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity686();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition586();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1294();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior788();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior913();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity856();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl2 = executionEntity1.processDefinition;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(processDefinitionImpl2);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity204();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition788();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1168();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior437();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1567();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior842();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity94();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior976();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior276();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition571();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior342();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior312();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1536();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior32();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior79();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1248();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition698();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity717();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity615();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior453();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition595();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1167();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior687();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.javax.el.ELContext eLContext14 = null;
        executionEntity13.setCachedElContext(eLContext14);
        java.util.List<org.activiti.engine.impl.persistence.entity.JobEntity> jobEntityList16 = executionEntity13.jobs;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(jobEntityList16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1515();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity816();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior977();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1528();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1575();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1000();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity255();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition795();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter0.deserializeObjectExecutionEntity1747();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(taskDefinition14);
        org.junit.Assert.assertNotNull(executionEntity15);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity305();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1561();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition656();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition135();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition455();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1506();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity123();
        executionEntity10.forceUpdate();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1564();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity254();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition15();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1246();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1250();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition632();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1264();
        boolean boolean9 = executionEntity8.isActive;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity834();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition823();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior689();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1413();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition484();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1077();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior239();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior644();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1320();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1078();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior366();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity103();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition441();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1243();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition648();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior943();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior94();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior999();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1138();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1690();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior164();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity633();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition829();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior371();
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1318();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior327();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity713();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1383();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior702();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior908();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity823();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition459();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity272();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1100();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity736();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1153();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior885();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition93();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1346();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior359();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition520();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition430();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity1266();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior959();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition589();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior74();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1103();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior565();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior773();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter7.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter7.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter7.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter7.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter7.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior362();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter7.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter7.deserializeObjectExecutionEntity1712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = serializedObjectSupporter7.deserializeObjectExecutionEntity1334();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionEntity18.getVariablesLocal();
        executionEntity6.setVariables(strMap19);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(executionEntity17);
        org.junit.Assert.assertNotNull(executionEntity18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition289();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior709();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1042();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1715();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition705();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition89();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior120();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior881();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition427();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition567();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition433();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition836();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(taskDefinition13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior362();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity37();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity655();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition820();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1634();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition4();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1150();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1063();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition803();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1469();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition682();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity876();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior309();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1014();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior268();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity738();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition809();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity125();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition8();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior394();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1318();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior418();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition590();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior5();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1616();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition67();
        java.lang.Class<?> wildcardClass12 = taskDefinition11.getClass();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1361();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity854();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity621();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior847();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior819();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior574();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior592();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity879();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1717();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior479();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1509();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity455();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1186();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1248();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior881();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior657();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1074();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior499();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1008();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1133();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior347();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1721();
        executionEntity7.ensureExecutionsInitialized();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior635();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1336();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition198();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1001();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition392();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity744();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior234();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition123();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity848();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior95();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior75();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1247();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity662();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1028();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior493();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1220();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity829();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity234();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity765();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity662();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior177();
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1025();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity335();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1731();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1642();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition251();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1322();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1068();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition776();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior489();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior457();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition95();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior983();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1002();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition392();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1569();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior772();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity655();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1593();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity210();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity892();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity208();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity623();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity813();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1368();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity7.getVariablesLocal();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1517();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition618();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity894();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1173();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1192();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1021();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition139();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior541();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition703();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1435();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1160();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1299();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior358();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1698();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior886();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1035();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity241();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter0.deserializeObjectExecutionEntity109();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1202();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = serializedObjectSupporter0.deserializeObjectTaskDefinition81();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(executionEntity14);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior15);
        org.junit.Assert.assertNotNull(taskDefinition16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1428();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition455();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1506();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity123();
        boolean boolean11 = executionEntity10.getisScope();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior612();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior288();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition470();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1235();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity59();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior612();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity24();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior130();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity654();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior778();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1383();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity775();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition240();
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1661();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition264();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1335();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior329();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior866();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition225();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition259();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(taskDefinition13);
        org.junit.Assert.assertNotNull(taskDefinition14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior494();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition319();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity358();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior812();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior632();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition357();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1367();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity665();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity876();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior187();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior613();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior220();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior540();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition69();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior155();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity295();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition411();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior809();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition369();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1607();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity64();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition467();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition692();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1142();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1134();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior335();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior565();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior773();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition238();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior565();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior773();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1237();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1211();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition69();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition407();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior652();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1243();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior262();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior822();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior908();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity823();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition459();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition94();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity292();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1102();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior152();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1124();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior616();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition660();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1065();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1231();
        boolean boolean12 = executionEntity11.isEnded();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1255();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior278();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition54();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1541();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1244();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior49();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition710();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior716();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity18();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior272();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1661();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior760();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1158();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity790();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity770();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1616();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior428();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior153();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior41();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition381();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior290();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1264();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior689();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition295();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1341();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior138();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1696();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity738();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition809();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity125();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior724();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1374();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1375();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition118();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior153();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity846();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior102();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1144();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity815();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity292();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior670();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity485();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior850();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition199();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity77();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1291();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1025();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity7.remove();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1126();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1130();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior208();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1706();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity204();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity946();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1320();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity464();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1671();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior315();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1225();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity955();
        org.slf4j.Logger logger7 = executionEntity6.getlog();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior850();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition199();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity798();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity729();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1063();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1255();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1362();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1534();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior982();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1078();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity24();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity449();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition434();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior531();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1446();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1564();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1665();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior262();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior678();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1629();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior998();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity940();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity840();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior143();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior56();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior531();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity41();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition464();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity37();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity468();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity909();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1307();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity545();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition27();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior96();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1706();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity66();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior283();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior409();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity922();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition832();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity412();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter0.deserializeObjectExecutionEntity710();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(executionEntity14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior120();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity687();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity13();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1590();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity389();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition654();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity13();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1074();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition336();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior132();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1154();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = executionEntity7.getVariable("");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition242();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1528();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition600();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1710();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior220();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1001();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1231();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity85();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior908();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1137();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition341();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition457();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1198();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity436();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity756();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity9.replacedBy;
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition242();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1528();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition600();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1212();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1636();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1083();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior612();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity24();
        boolean boolean10 = executionEntity9.isScope;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition15();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior581();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior886();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior962();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity425();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity862();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1325();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity290();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity681();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1090();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1575();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition452();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition140();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior144();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1167();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition529();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior488();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition96();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition28();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1094();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1261();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior565();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior773();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior367();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior774();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior871();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1035();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity769();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition783();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1011();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior105();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity319();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1050();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior601();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition523();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(taskDefinition11);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1616();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior328();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior707();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition461();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1334();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1477();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior675();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior60();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1540();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1735();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior981();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition870();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior813();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior982();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity232();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity922();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition832();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity412();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1540();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior955();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1407();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior18();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior158();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior454();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity834();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior887();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity955();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior850();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition747();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity931();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1317();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity830();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior792();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior435();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1361();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity854();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity621();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity39();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity746();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1696();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity892();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity208();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior134();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1364();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1238();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition176();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior102();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior746();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior788();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity433();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1106();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1731();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition200();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity654();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior778();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition94();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1194();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1711();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1575();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition37();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior755();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1666();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1264();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior633();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1616();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior974();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1368();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1228();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior67();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity300();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1338();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition359();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1364();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition810();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior892();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity284();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1620();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1182();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1367();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity665();
        java.lang.String str10 = executionEntity9.getEventName();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior812();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1265();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1722();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior248();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition466();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition143();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity936();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1653();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior586();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior543();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior780();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity552();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1597();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1187();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior115();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1072();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity490();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity896();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior848();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1375();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior293();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity542();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1007();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior875();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior902();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity689();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior895();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1380();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity727();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1097();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior705();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition217();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity831();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity779();
        org.activiti.engine.EngineServices engineServices7 = executionEntity6.getEngineServices();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNull(engineServices7);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity931();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1579();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition686();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity121();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1102();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1083();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1051();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1462();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1674();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior88();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        java.lang.String str6 = executionEntity5.getProcessBusinessKey();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BUSINESS-KEY-2" + "'", str6, "BUSINESS-KEY-2");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior809();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition369();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1599();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = executionEntity6.getSuperExecution();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior349();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior139();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior712();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition476();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior292();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1138();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior959();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior519();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity730();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity772();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition630();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior492();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1400();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity683();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity101();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity319();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity218();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior488();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity741();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity948();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition676();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1575();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1050();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior998();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition423();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1072();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior780();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1194();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition777();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior457();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition95();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior983();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity712();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior838();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity203();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior262();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity504();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition473();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior660();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior537();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1011();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity206();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1413();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1536();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity782();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior763();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1512();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity589();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1160();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition867();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity763();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity888();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition597();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1025();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition97();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1200();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1654();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity769();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition783();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1011();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity206();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior841();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity264();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior908();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity673();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior49();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1536();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity782();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior763();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity346();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1054();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1165();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1497();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition686();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1748();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity736();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1153();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior885();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1106();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1159();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1117();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior755();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1273();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity753();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity516();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1437();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior127();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity826();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition460();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1191();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity229();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1570();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior959();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition589();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior74();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior605();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition242();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity995();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity380();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter11 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter11.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter11.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter11.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter11.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter11.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = serializedObjectSupporter11.deserializeObjectUserTaskActivityBehavior1314();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter18 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = serializedObjectSupporter18.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = serializedObjectSupporter18.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = serializedObjectSupporter18.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = serializedObjectSupporter18.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = serializedObjectSupporter18.deserializeObjectExecutionEntity626();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = serializedObjectSupporter18.deserializeObjectExecutionEntity1024();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior25 = serializedObjectSupporter18.deserializeObjectUserTaskActivityBehavior362();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = serializedObjectSupporter18.deserializeObjectExecutionEntity1108();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior27 = serializedObjectSupporter18.deserializeObjectUserTaskActivityBehavior1722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = serializedObjectSupporter18.deserializeObjectExecutionEntity1712();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = serializedObjectSupporter18.deserializeObjectExecutionEntity1334();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = executionEntity29.getVariablesLocal();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = executionEntity9.setVariableLocal("receivePayment", (java.lang.Object) userTaskActivityBehavior17, executionEntity29);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(executionEntity14);
        org.junit.Assert.assertNotNull(executionEntity15);
        org.junit.Assert.assertNotNull(executionEntity16);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior17);
        org.junit.Assert.assertNotNull(executionEntity19);
        org.junit.Assert.assertNotNull(executionEntity20);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior21);
        org.junit.Assert.assertNotNull(executionEntity22);
        org.junit.Assert.assertNotNull(executionEntity23);
        org.junit.Assert.assertNotNull(executionEntity24);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior25);
        org.junit.Assert.assertNotNull(executionEntity26);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior27);
        org.junit.Assert.assertNotNull(executionEntity28);
        org.junit.Assert.assertNotNull(executionEntity29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition392();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1121();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition611();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1560();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior999();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1015();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1510();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity75();
        executionEntity9.setConcurrent(true);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior678();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity729();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior703();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1731();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1642();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition313();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition103();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior457();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition95();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior983();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity224();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1369();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition89();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity772();
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation10 = null;
        executionEntity9.nextOperation = atomicOperation10;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition441();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior451();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior967();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior96();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior111();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1192();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition563();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition785();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity380();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition420();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1393();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior908();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity823();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition459();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity272();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1100();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior942();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity706();
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1058();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition561();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior98();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity763();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity888();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior723();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity738();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition809();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity125();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1170();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1517();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior925();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1646();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity366();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1123();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity319();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition68();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1440();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition549();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1619();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior780();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1194();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior109();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity880();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition791();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1002();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1102();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition874();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(taskDefinition6);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity7();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior172();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior354();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior437();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior305();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1661();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior121();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior158();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity699();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior33();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity738();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1085();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition68();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition467();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition692();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1142();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1233();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1386();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity609();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1473();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition587();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1396();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity246();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1323();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition50();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1054();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition580();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity292();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity57();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity696();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior60();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1040();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition507();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition567();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition418();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition273();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition874();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior901();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior944();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1128();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition455();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1506();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition339();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior457();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity431();
        executionEntity7.setforcedUpdate(false);
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity594();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition825();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition246();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(taskDefinition13);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity386();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1432();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition212();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1511();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior417();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition559();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity94();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior976();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1296();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition22();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior434();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1073();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity574();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior871();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1000();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter0.deserializeObjectTaskDefinition252();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition306();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
        org.junit.Assert.assertNotNull(taskDefinition12);
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNotNull(taskDefinition14);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity467();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1230();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior696();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior707();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter0.deserializeObjectExecutionEntity458();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(executionEntity14);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1047();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1346();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1268();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity670();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior370();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1025();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior12();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity245();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior15();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1103();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity7();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity65();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior850();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1068();
        executionEntity7.setactivityName("oneTaskProcess:2:3194");
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior881();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition816();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior43();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior266();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1573();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior14);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior15);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior910();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1095();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity377();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1556();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition59();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1641();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1065();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity695();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity682();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1198();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior961();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1282();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity191();
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior13();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition336();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior132();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1572();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1636();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior165();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition331();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1615();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior937();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition440();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1325();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity927();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition261();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition62();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior793();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior480();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1203();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition337();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity818();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition823();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1345();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1417();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(taskDefinition5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1375();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior293();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1740();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(executionEntity8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition595();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1167();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior687();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter0.deserializeObjectTaskDefinition809();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition234();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = serializedObjectSupporter0.deserializeObjectTaskDefinition467();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1100();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter0.deserializeObjectExecutionEntity1735();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(taskDefinition13);
        org.junit.Assert.assertNotNull(taskDefinition14);
        org.junit.Assert.assertNotNull(taskDefinition15);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior16);
        org.junit.Assert.assertNotNull(executionEntity17);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1320();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity198();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition183();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1089();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1346();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition5();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity441();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(executionEntity10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(executionEntity12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity104();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior120();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior220();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1599();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity408();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior959();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior519();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior428();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1492();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior210();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior150();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition484();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition756();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition408();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(taskDefinition9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(executionEntity11);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior617();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior837();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition69();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior679();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition407();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition169();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition251();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity792();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(taskDefinition8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition737();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior242();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition870();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior813();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1273();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition22();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1098();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity53();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior686();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity881();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior869();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(executionEntity11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior18();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior63();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1402();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1051();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior428();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1522();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1410();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter0.deserializeObjectTaskDefinition134();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior471();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(taskDefinition7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(taskDefinition10);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior11);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1481();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity15();
        executionEntity9.suspensionState = (short) 100;
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1094();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior209();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1731();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1642();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter0.deserializeObjectTaskDefinition313();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1452();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1398();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter0.deserializeObjectTaskDefinition625();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior9);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior10);
        org.junit.Assert.assertNotNull(taskDefinition11);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior12);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior13);
        org.junit.Assert.assertNotNull(taskDefinition14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior778();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity780();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(taskDefinition2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(taskDefinition6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(executionEntity8);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition483();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition710();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior716();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity18();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition775();
        org.junit.Assert.assertNotNull(taskDefinition1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(taskDefinition7);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1160();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1006();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(taskDefinition3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(executionEntity6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior431();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior299();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior4);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior680();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior379();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity205();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1336();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(taskDefinition4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
        org.junit.Assert.assertNotNull(executionEntity9);
        org.junit.Assert.assertNotNull(executionEntity10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity758();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1300();
        org.junit.Assert.assertNotNull(executionEntity1);
        org.junit.Assert.assertNotNull(executionEntity2);
        org.junit.Assert.assertNotNull(executionEntity3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior6);
        org.junit.Assert.assertNotNull(executionEntity7);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior8);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior812();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior632();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity552();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity764();
        org.junit.Assert.assertNotNull(userTaskActivityBehavior1);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior2);
        org.junit.Assert.assertNotNull(userTaskActivityBehavior3);
        org.junit.Assert.assertNotNull(executionEntity4);
        org.junit.Assert.assertNotNull(executionEntity5);
    }
}

