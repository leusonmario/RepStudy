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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition789();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity697();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.end();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1049();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity1469();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity853();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity7.newExecution();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity367();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter12 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter12.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter12.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter12.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = serializedObjectSupporter12.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = serializedObjectSupporter12.deserializeObjectTaskDefinition15();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = serializedObjectSupporter12.deserializeObjectUserTaskActivityBehavior250();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter19 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = serializedObjectSupporter19.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = serializedObjectSupporter19.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior22 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = serializedObjectSupporter19.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = serializedObjectSupporter19.deserializeObjectExecutionEntity329();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior25 = serializedObjectSupporter19.deserializeObjectUserTaskActivityBehavior211();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = serializedObjectSupporter19.deserializeObjectExecutionEntity1066();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = serializedObjectSupporter19.deserializeObjectExecutionEntity669();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity variableInstanceEntity28 = executionEntity10.createVariableInstance("", (java.lang.Object) userTaskActivityBehavior18, executionEntity27);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1016();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition171();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity16();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = serializedObjectSupporter7.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter7.deserializeObjectExecutionEntity669();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter7.deserializeObjectExecutionEntity1183();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter7.deserializeObjectTaskDefinition177();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter7.deserializeObjectTaskDefinition15();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior250();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = executionEntity5.setVariableLocal("", (java.lang.Object) serializedObjectSupporter7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1061();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1588();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition34();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition194();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity244();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior910();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity1610();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity637();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter10 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter10.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter10.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = serializedObjectSupporter10.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter10.deserializeObjectUserTaskActivityBehavior1690();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.signal("receivePayment", (java.lang.Object) serializedObjectSupporter10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = serializedObjectSupporter0.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior982();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity455();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity9.ensureJobsInitialized();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition802();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior864();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1361();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity854();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity621();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter0.deserializeObjectExecutionEntity798();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior179();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter0.deserializeObjectExecutionEntity1539();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.removeIdentityLinks();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition317();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior768();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity66();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity1484();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1184();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter7.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter7.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter7.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1526();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter7.deserializeObjectTaskDefinition567();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = serializedObjectSupporter7.deserializeObjectExecutionEntity934();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userTaskActivityBehavior6.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity13.remove();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1221();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = serializedObjectSupporter0.deserializeObjectTaskDefinition865();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity248();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter7.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter7.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = serializedObjectSupporter7.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = serializedObjectSupporter7.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1667();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter7.deserializeObjectUserTaskActivityBehavior1011();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = serializedObjectSupporter7.deserializeObjectExecutionEntity304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = serializedObjectSupporter7.deserializeObjectExecutionEntity206();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter17 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity18 = serializedObjectSupporter17.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = serializedObjectSupporter17.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = serializedObjectSupporter17.deserializeObjectExecutionEntity872();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = serializedObjectSupporter17.deserializeObjectExecutionEntity1728();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = serializedObjectSupporter17.deserializeObjectExecutionEntity316();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior23 = serializedObjectSupporter17.deserializeObjectUserTaskActivityBehavior1610();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = serializedObjectSupporter17.deserializeObjectTaskDefinition508();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior25 = serializedObjectSupporter17.deserializeObjectUserTaskActivityBehavior1077();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = serializedObjectSupporter17.deserializeObjectExecutionEntity357();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = executionEntity26.activity;
        executionEntity16.eventSource = activityImpl27;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity6.executeActivity((org.activiti.engine.impl.pvm.PvmActivity) activityImpl27);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity847();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1348();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity1709();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity6 = executionEntity3.addIdentityLink("", "ConcurrentExecution[4476]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior2 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior798();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity3 = serializedObjectSupporter0.deserializeObjectExecutionEntity790();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1747();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior349();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity6 = serializedObjectSupporter0.deserializeObjectExecutionEntity852();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter8 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = serializedObjectSupporter8.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter8.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = serializedObjectSupporter8.deserializeObjectTaskDefinition805();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter8.deserializeObjectTaskDefinition740();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior457();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = serializedObjectSupporter8.deserializeObjectTaskDefinition95();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = serializedObjectSupporter8.deserializeObjectTaskDefinition45();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = serializedObjectSupporter8.deserializeObjectUserTaskActivityBehavior1509();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = executionEntity6.setVariableLocal("ProcessInstance[5870]", (java.lang.Object) userTaskActivityBehavior17);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = serializedObjectSupporter0.deserializeObjectTaskDefinition844();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition686();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1493();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity121();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.removeEventSubscriptions();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1474();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = serializedObjectSupporter0.deserializeObjectTaskDefinition675();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = serializedObjectSupporter0.deserializeObjectExecutionEntity196();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1304();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = serializedObjectSupporter0.deserializeObjectExecutionEntity951();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity973();
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter9 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter9.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = serializedObjectSupporter9.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = serializedObjectSupporter9.deserializeObjectTaskDefinition640();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = serializedObjectSupporter9.deserializeObjectExecutionEntity427();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = serializedObjectSupporter9.deserializeObjectUserTaskActivityBehavior1491();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = serializedObjectSupporter9.deserializeObjectTaskDefinition244();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = serializedObjectSupporter9.deserializeObjectTaskDefinition475();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = serializedObjectSupporter9.deserializeObjectTaskDefinition452();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = serializedObjectSupporter9.deserializeObjectExecutionEntity1209();
        boolean boolean20 = executionEntity19.isScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.setReplacedBy((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior456();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = serializedObjectSupporter0.deserializeObjectTaskDefinition530();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = serializedObjectSupporter0.deserializeObjectTaskDefinition323();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior4 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior1111();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior5 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior811();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior6 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior562();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior999();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = serializedObjectSupporter0.deserializeObjectExecutionEntity1247();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity8.deleteCascade("4562");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = serializedObjectSupporter0.deserializeObjectExecutionEntity570();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList11 = executionEntity10.getTasksInternal();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity11.deleteCascade("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.bpmn.behavior.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = serializedObjectSupporter0.deserializeObjectExecutionEntity631();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity2 = serializedObjectSupporter0.deserializeObjectExecutionEntity1694();
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior3 = serializedObjectSupporter0.deserializeObjectUserTaskActivityBehavior279();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = serializedObjectSupporter0.deserializeObjectExecutionEntity389();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        executionEntity4.ensureTasksInitialized();
    }
}

