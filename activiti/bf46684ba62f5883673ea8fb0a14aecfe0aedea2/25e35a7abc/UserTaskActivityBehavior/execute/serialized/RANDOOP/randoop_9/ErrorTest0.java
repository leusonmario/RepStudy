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
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior412();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition852();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1152();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeIdentityLinks();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior957();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition476();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior643();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1347();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior124();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity353();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.end();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior957();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior269();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity382();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter10 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter10.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter10.deserializeObjectExecutionEntity906();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior1116();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter10.deserializeObjectExecutionEntity1254();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior1317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior332();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter19 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = serializedObjectSupporter19.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior22 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = serializedObjectSupporter19.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior24 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior25 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior957();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = serializedObjectSupporter19.deserializeObjectTaskDefinition476();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = serializedObjectSupporter19.deserializeObjectExecutionEntity1094();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = serializedObjectSupporter19.deserializeObjectTaskDefinition713();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior29 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior1518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = serializedObjectSupporter19.deserializeObjectExecutionEntity1097();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = serializedObjectSupporter19.deserializeObjectExecutionEntity786();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = serializedObjectSupporter19.deserializeObjectExecutionEntity1023();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity variableInstanceEntity33 = executionEntity8.createVariableInstance("10897", (java.lang.Object) userTaskActivityBehavior18, executionEntity32);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1148();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior808();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1131();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition714();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity652();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList6 = executionEntity5.getIdentityLinks();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior412();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity821();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition303();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition672();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition123();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior580();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition848();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1195();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1089();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.deleteCascade("Receive Payment");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior966();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity739();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList5 = executionEntity4.getIdentityLinks();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition608();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1364();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1302();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition145();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter0.deserializeObjectTaskDefinition439();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity642();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.createExecution();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity497();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition513();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior62();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior103();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter8 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter8.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior242();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter8.deserializeObjectTaskDefinition378();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior1679();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter8.deserializeObjectExecutionEntity490();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior7.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior687();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1103();
        org.activiti.engine.impl.persistence.entity.TaskEntity[] taskEntityArray3 = new org.activiti.engine.impl.persistence.entity.TaskEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList4 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.TaskEntity>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.TaskEntity>) taskEntityList4, taskEntityArray3);
        executionEntity2.tasks = taskEntityList4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList7 = executionEntity2.getIdentityLinks();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior957();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1135();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior90();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior739();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1455();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity568();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter0.deserializeObjectExecutionEntity1046();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter0.deserializeObjectExecutionEntity533();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity13.start();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1086();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition360();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity453();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition672();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity635();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity100();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter9 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = serializedObjectSupporter9.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter9.deserializeObjectExecutionEntity1086();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter9.deserializeObjectExecutionEntity518();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter9.deserializeObjectExecutionEntity938();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior10();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior526();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity7.setVariable("my task", (java.lang.Object) serializedObjectSupporter9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1685();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity845();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior351();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior957();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition604();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1712();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = serializedObjectSupporter0.deserializeObjectTaskDefinition786();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity1750();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity10.ensureSubProcessInstanceInitialized();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity906();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity900();
        executionEntity6.inactivate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = executionEntity6.updateProcessBusinessKey("oneTaskProcess:1:5400");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition444();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1166();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior258();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity906();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior87();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior416();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior22();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1050();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity1717();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity9.getActivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity9.newExecution();
    }
}

