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
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity462();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1106();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition587();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1750();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity868();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter9 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter9.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter9.deserializeObjectExecutionEntity849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior418();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter9.deserializeObjectExecutionEntity1211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter9.deserializeObjectExecutionEntity964();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior234();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = serializedObjectSupporter9.deserializeObjectTaskDefinition501();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = executionEntity7.setVariableLocal("hi!", (java.lang.Object) serializedObjectSupporter9);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1431();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1227();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter6 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter6.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter6.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior518();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter6.deserializeObjectTaskDefinition27();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter6.deserializeObjectExecutionEntity792();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter6.deserializeObjectUserTaskActivityBehavior1218();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter6.deserializeObjectExecutionEntity31();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter14 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter14.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter14.deserializeObjectExecutionEntity849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = serializedObjectSupporter14.deserializeObjectUserTaskActivityBehavior1141();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = serializedObjectSupporter14.deserializeObjectTaskDefinition175();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = serializedObjectSupporter14.deserializeObjectExecutionEntity698();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior20 = serializedObjectSupporter14.deserializeObjectUserTaskActivityBehavior493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = serializedObjectSupporter14.deserializeObjectExecutionEntity778();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity variableInstanceEntity22 = executionEntity4.createVariableInstance("hi!", (java.lang.Object) executionEntity13, executionEntity21);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior418();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity825();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.destroyScope("6085");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity281();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1055();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity224();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = executionEntity4.getTransitionBeingTaken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.insert();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity121();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1010();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity862();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity536();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1629();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity369();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList9 = executionEntity8.getEventSubscriptions();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity242();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1726();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter7.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter7.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter7.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter7.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1029();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior863();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1622();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = serializedObjectSupporter7.deserializeObjectTaskDefinition653();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter7.deserializeObjectExecutionEntity1207();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.createVariableLocal("", (java.lang.Object) serializedObjectSupporter7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity281();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity437();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = executionEntity3.getTasksInternal();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1204();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1426();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity927();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("6085");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1095();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = executionEntity2.getProcessBusinessKey();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity391();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity5.ensureTasksInitialized();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity462();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1469();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1726();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter7.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter7.deserializeObjectTaskDefinition355();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior815();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior415();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter7.deserializeObjectExecutionEntity391();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter7.deserializeObjectExecutionEntity900();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter7.deserializeObjectTaskDefinition123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter16 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter16.deserializeObjectExecutionEntity872();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = executionEntity5.setVariableLocal("hi!", (java.lang.Object) userTaskActivityBehavior15, executionEntity17);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity462();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity60();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity13();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity787();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior503();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition514();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity880();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = executionEntity9.isActive("3452");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1430();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1669();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1441();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity241();
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList8 = executionEntity7.tasks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity7.involveUser("hi!", "myTenantId");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1029();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1512();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity10 = executionEntity7.involveUser("", "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1029();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior863();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition866();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior315();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.removeIdentityLinks();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition484();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1066();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1048();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition601();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1146();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1412();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter10 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter10.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter10.deserializeObjectExecutionEntity849();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior1141();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter10.deserializeObjectTaskDefinition175();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter10.deserializeObjectExecutionEntity698();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = serializedObjectSupporter10.deserializeObjectExecutionEntity778();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior486();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = serializedObjectSupporter10.deserializeObjectExecutionEntity701();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = serializedObjectSupporter10.deserializeObjectTaskDefinition545();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = serializedObjectSupporter10.deserializeObjectExecutionEntity500();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter23 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = serializedObjectSupporter23.deserializeObjectExecutionEntity817();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = serializedObjectSupporter23.deserializeObjectExecutionEntity72();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior26 = serializedObjectSupporter23.deserializeObjectUserTaskActivityBehavior1705();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior9.signal((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity21, "", (java.lang.Object) userTaskActivityBehavior26);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1230();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1106();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior277();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior99();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity227();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter10 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter10.deserializeObjectExecutionEntity462();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter10.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter10.deserializeObjectExecutionEntity722();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter10.deserializeObjectExecutionEntity60();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = executionEntity14.getVariablesLocal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.setVariables(strMap15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity462();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition382();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1472();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior377();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition238();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition839();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity66();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity7.removeIdentityLinks();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity981();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior496();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1137();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition40();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1256();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior862();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior33();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity653();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList10 = executionEntity9.loadVariableInstances();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity596();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1350();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior234();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity86();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1735();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("oneTaskProcess:2:5531");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior110();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior84();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1024();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1558();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = serializedObjectSupporter0.deserializeObjectTaskDefinition577();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1035();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter9 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter9.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter9.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter9.deserializeObjectExecutionEntity978();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior549();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter9.deserializeObjectExecutionEntity745();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior1047();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior762();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity7.createVariableLocal("hi!", (java.lang.Object) serializedObjectSupporter9);
    }
}

