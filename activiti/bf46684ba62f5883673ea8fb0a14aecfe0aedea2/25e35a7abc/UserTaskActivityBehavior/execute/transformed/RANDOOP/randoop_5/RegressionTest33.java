import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList4);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray6 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7, variableInstanceEntityArray6);
        executionEntity1.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList7);
        java.lang.String str10 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setActive(true);
        boolean boolean15 = executionEntity12.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity12.setCachedElContext(eLContext16);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity12.getQueryVariables();
        executionEntity12.setId("ScopeExecution[null]");
        executionEntity12.setRevision((int) (short) -1);
        executionEntity12.setEventName("hi!");
        java.lang.String str25 = executionEntity12.getProcessDefinitionId();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity12.inactivate();
        java.lang.String str28 = executionEntity12.getBusinessKey();
        executionEntity12.forceUpdate();
        org.junit.Assert.assertNotNull(variableInstanceEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        executionEntity1.setId("ScopeExecution[null]");
        executionEntity1.setEventName("");
        boolean boolean12 = executionEntity1.isScope();
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity16.getStartingExecution();
        executionEntity16.setId("");
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        java.lang.String str23 = executionEntity1.getParentId();
        executionEntity1.setCachedEntityState((int) '#');
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = executionEntity1.getSuperExecution();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList27 = executionEntity26.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(startingExecution19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(executionEntity26);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList4);
        executionEntity1.setName("");
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = null;
        executionEntity1.setCachedElContext(eLContext8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = executionEntity1.getProcessVariables();
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = executionEntity5.getParent();
        executionEntity17.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setActive(true);
        boolean boolean24 = executionEntity21.isScope();
        executionEntity21.setTenantId("hi!");
        java.lang.String str27 = executionEntity21.getEventName();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap29 = executionEntity21.getVariables();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        executionEntity1.setName("ScopeExecution[null]");
        java.lang.String str9 = executionEntity1.getEventName();
        boolean boolean10 = executionEntity1.isEventScope();
        executionEntity1.forceUpdate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        executionEntity1.setRevision(10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        executionEntity1.setActivity(activityImpl10);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList4);
        executionEntity1.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        boolean boolean9 = executionEntity1.isActive();
        executionEntity1.setScope(true);
        org.activiti.engine.impl.pvm.PvmProcessDefinition pvmProcessDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.pvm.PvmProcessInstance pvmProcessInstance13 = executionEntity1.createSubProcessInstance(pvmProcessDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        java.lang.String str5 = executionEntity1.getId();
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        executionEntity1.setSuspensionState((int) (byte) -1);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        java.lang.String str13 = executionEntity12.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        boolean boolean16 = executionEntity15.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity15 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList18, executionEntityArray17);
        executionEntity12.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList18);
        java.lang.String str21 = executionEntity12.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setActive(true);
        boolean boolean26 = executionEntity23.isScope();
        executionEntity23.setTenantId("hi!");
        executionEntity23.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity23.getCachedElContext();
        executionEntity23.setRevision(1);
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        executionEntity1.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement35 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        boolean boolean42 = executionEntity41.isConcurrent();
        executionEntity37.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity41);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl44 = null;
        executionEntity41.setTransitionBeingTaken(transitionImpl44);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = executionEntity41.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        executionEntity48.setActivity(activityImpl49);
        executionEntity41.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity48);
        boolean boolean52 = executionEntity41.isScope();
        boolean boolean53 = executionEntity41.isDeleteRoot();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity41);
        executionEntity1.setConcurrent(true);
        executionEntity1.setActive(false);
        executionEntity1.setBusinessKey("ScopeExecution[]");
        java.lang.String str61 = executionEntity1.getSuperExecutionId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(executionEntityArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(pvmProcessElement35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(activityImpl46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        boolean boolean10 = executionEntity9.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity9.setEventSource(pvmProcessElement11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity9.setTransitionBeingTaken(transitionImpl13);
        executionEntity9.setName("ScopeExecution[null]");
        java.lang.String str17 = executionEntity9.getEventName();
        executionEntity1.setSuperExecution(executionEntity9);
        java.lang.String str19 = executionEntity9.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity9.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity22 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl21);
        java.lang.String str23 = executionEntity22.getActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution24 = executionEntity22.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setBusinessKey("hi!");
        executionEntity26.setBusinessKey("hi!");
        executionEntity26.setName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList37 = null;
        executionEntity34.setQueryVariables(variableInstanceEntityList37);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray39 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList40 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40, variableInstanceEntityArray39);
        executionEntity34.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40);
        executionEntity26.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40);
        executionEntity22.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40);
        executionEntity9.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList40);
        executionEntity9.setParentId("ScopeExecution[null]");
        java.lang.String str48 = executionEntity9.getName();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = executionEntity9.getProcessInstance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(startingExecution24);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ScopeExecution[null]" + "'", str48, "ScopeExecution[null]");
        org.junit.Assert.assertNull(executionEntity49);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isEventScope();
        java.lang.String str5 = executionEntity1.getCurrentActivityId();
        boolean boolean6 = executionEntity1.isEventScope();
        executionEntity1.setScope(false);
        java.lang.String str9 = executionEntity1.getProcessDefinitionId();
        boolean boolean10 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl11 = executionEntity1.getProcessDefinition();
        java.lang.String str12 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition13);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(processDefinitionImpl11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        java.lang.String str8 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl9 = null;
        executionEntity1.setTransition(transitionImpl9);
        org.activiti.engine.EngineServices engineServices11 = executionEntity1.getEngineServices();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = executionEntity1.getProcessInstance();
        executionEntity1.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = executionEntity1.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity15.inactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(engineServices11);
        org.junit.Assert.assertNull(executionEntity12);
        org.junit.Assert.assertNull(executionEntity15);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        executionEntity1.setId("ScopeExecution[null]");
        executionEntity1.setEventName("");
        boolean boolean12 = executionEntity1.isScope();
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity16.getStartingExecution();
        executionEntity16.setId("");
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        boolean boolean23 = executionEntity16.isScope();
        boolean boolean24 = executionEntity16.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        executionEntity16.setActivity(activityImpl25);
        java.lang.String str27 = executionEntity16.getId();
        java.lang.String str28 = executionEntity16.getSuperExecutionId();
        boolean boolean29 = executionEntity16.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(startingExecution19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        java.lang.String str5 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl6 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl6);
        boolean boolean8 = executionEntity1.isConcurrent();
        java.lang.Object obj9 = executionEntity1.getPersistentState();
        executionEntity1.setEventScope(false);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity12 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList13 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity12);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement14 = executionEntity1.getEventSource();
        java.lang.String str15 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setCachedEntityState(5);
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList13);
        org.junit.Assert.assertNull(pvmProcessElement14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList4);
        executionEntity1.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = executionEntity1.getTransition();
        java.lang.String str9 = executionEntity1.getParentId();
        executionEntity1.setEventScope(false);
        java.lang.String str12 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setProcessDefinition(processDefinitionImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transitionImpl8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity1.getProcessVariables();
        executionEntity1.setCachedEntityState(100);
        executionEntity1.setEventScope(true);
        java.lang.String str10 = executionEntity1.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setActive(true);
        boolean boolean15 = executionEntity12.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext16 = null;
        executionEntity12.setCachedElContext(eLContext16);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity12.getQueryVariables();
        executionEntity12.setRevision(10);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity22 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList23 = executionEntity12.findInactiveConcurrentExecutions(pvmActivity22);
        executionEntity12.inactivate();
        java.lang.String str25 = executionEntity12.getProcessInstanceId();
        executionEntity12.setSuspensionState(97);
        java.lang.Class<?> wildcardClass28 = executionEntity12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
        org.junit.Assert.assertNotNull(activityExecutionList23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        boolean boolean8 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setBusinessKey("hi!");
        java.lang.String str13 = executionEntity10.getProcessInstanceId();
        boolean boolean14 = executionEntity10.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity16.getStartingExecution();
        int int20 = executionEntity16.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        executionEntity16.setActivity(activityImpl21);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution23 = executionEntity16.getStartingExecution();
        executionEntity10.setSuperExecution(executionEntity16);
        executionEntity1.setSuperExecution(executionEntity16);
        org.activiti.engine.EngineServices engineServices26 = executionEntity1.getEngineServices();
        int int27 = executionEntity1.getRevision();
        executionEntity1.setId("");
        boolean boolean30 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setBusinessKey("hi!");
        executionEntity33.setBusinessKey("hi!");
        java.lang.String str38 = executionEntity33.getProcessInstanceId();
        int int39 = executionEntity33.getRevision();
        java.lang.String str40 = executionEntity33.getId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        executionEntity42.setActive(true);
        boolean boolean45 = executionEntity42.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext46 = null;
        executionEntity42.setCachedElContext(eLContext46);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity42.getProcessVariables();
        boolean boolean49 = executionEntity42.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        executionEntity51.setBusinessKey("hi!");
        java.lang.String str54 = executionEntity51.getProcessInstanceId();
        boolean boolean55 = executionEntity51.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity57 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl56);
        executionEntity57.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution60 = executionEntity57.getStartingExecution();
        int int61 = executionEntity57.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl62 = null;
        executionEntity57.setActivity(activityImpl62);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution64 = executionEntity57.getStartingExecution();
        executionEntity51.setSuperExecution(executionEntity57);
        executionEntity42.setSuperExecution(executionEntity57);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl67 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity68 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl67);
        executionEntity68.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList71 = null;
        executionEntity68.setQueryVariables(variableInstanceEntityList71);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray73 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList74 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList74, variableInstanceEntityArray73);
        executionEntity68.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList74);
        executionEntity42.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList74);
        executionEntity42.setEventName("hi!");
        executionEntity33.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity42);
        executionEntity42.setEventName("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl83 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity84 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl83);
        executionEntity84.setActive(true);
        boolean boolean87 = executionEntity84.isScope();
        executionEntity84.setTenantId("hi!");
        executionEntity84.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext91 = executionEntity84.getCachedElContext();
        executionEntity84.setRevision(1);
        executionEntity42.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity84);
        java.lang.String str95 = executionEntity42.getCurrentActivityName();
        java.lang.String str96 = executionEntity42.getDeleteReason();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[null]", (java.lang.Object) executionEntity42);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(startingExecution19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(startingExecution23);
        org.junit.Assert.assertNull(engineServices26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(startingExecution60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(startingExecution64);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(eLContext91);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        boolean boolean9 = executionEntity1.isEventScope();
        executionEntity1.setCachedEntityState((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str6 = executionEntity1.getBusinessKey();
        executionEntity1.setParentId("");
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity11 = executionEntity1.involveUser("ProcessInstance[]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition6;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        org.junit.Assert.assertNull(taskDefinition11);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        org.junit.Assert.assertNull(taskDefinition13);
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        java.lang.String str4 = executionEntity1.getProcessInstanceId();
        boolean boolean5 = executionEntity1.isScope();
        java.lang.String str6 = executionEntity1.getId();
        executionEntity1.forceUpdate();
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        java.lang.String str10 = executionEntity1.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext11 = executionEntity1.getCachedElContext();
        executionEntity1.setDeleteReason("ScopeExecution[]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ScopeExecution[null]" + "'", str10, "ScopeExecution[null]");
        org.junit.Assert.assertNull(eLContext11);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        executionEntity1.setActivity(activityImpl2);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        java.lang.String str5 = executionEntity1.getProcessInstanceId();
        executionEntity1.setBusinessKey("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = null;
        executionEntity1.setEventSource(pvmProcessElement8);
        executionEntity1.setName("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransition(transitionImpl10);
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        java.lang.String str14 = executionEntity1.getActivityId();
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity15 = null;
        executionEntity1.addJob(jobEntity15);
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity17 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeEventSubscription(eventSubscriptionEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        executionEntity1.setId("ScopeExecution[null]");
        executionEntity1.setEventName("");
        boolean boolean12 = executionEntity1.isScope();
        executionEntity1.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity16.getStartingExecution();
        executionEntity16.setId("");
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        boolean boolean29 = executionEntity28.isConcurrent();
        executionEntity24.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity28.setTransitionBeingTaken(transitionImpl31);
        int int33 = executionEntity28.getRevision();
        executionEntity28.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl35 = executionEntity28.getTransitionBeingTaken();
        executionEntity28.setParentId("ScopeExecution[null]");
        executionEntity28.setRevision((int) (short) 10);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution41 = executionEntity28.getStartingExecution();
        executionEntity28.setEventName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(startingExecution19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(transitionImpl35);
        org.junit.Assert.assertNull(startingExecution41);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        boolean boolean10 = executionEntity9.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity9.setEventSource(pvmProcessElement11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity9.setTransitionBeingTaken(transitionImpl13);
        executionEntity9.setName("ScopeExecution[null]");
        java.lang.String str17 = executionEntity9.getEventName();
        executionEntity1.setSuperExecution(executionEntity9);
        java.lang.String str19 = executionEntity9.getCurrentActivityId();
        java.lang.String str20 = executionEntity9.getBusinessKey();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = executionEntity9.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution26 = executionEntity23.getStartingExecution();
        java.lang.String str27 = executionEntity23.getActivityId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl28);
        boolean boolean30 = executionEntity23.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        executionEntity23.setActivity(activityImpl31);
        executionEntity9.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setParentId("hi!");
        boolean boolean38 = executionEntity35.isEventScope();
        java.lang.String str39 = executionEntity35.getCurrentActivityId();
        executionEntity35.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        executionEntity43.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        boolean boolean48 = executionEntity47.isConcurrent();
        executionEntity43.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl50 = null;
        executionEntity47.setTransitionBeingTaken(transitionImpl50);
        int int52 = executionEntity47.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = executionEntity47.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl54 = null;
        executionEntity47.setTransition(transitionImpl54);
        executionEntity35.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        executionEntity58.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        boolean boolean63 = executionEntity62.isConcurrent();
        executionEntity58.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity62);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = executionEntity62.getProcessVariables();
        executionEntity47.setVariables(strMap65);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl67 = executionEntity47.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl68 = executionEntity47.getTransition();
        executionEntity23.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity47);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl70 = null;
        executionEntity23.setTransition(transitionImpl70);
        boolean boolean72 = executionEntity23.isEventScope();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution73 = executionEntity23.getStartingExecution();
        java.lang.String str74 = executionEntity23.getCurrentActivityId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(eLContext21);
        org.junit.Assert.assertNotNull(startingExecution26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(executionEntity53);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(transitionImpl67);
        org.junit.Assert.assertNull(transitionImpl68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(startingExecution73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        boolean boolean9 = executionEntity1.isConcurrent();
        executionEntity1.setName("ScopeExecution[null]");
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.String str16 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setConcurrent(false);
        java.lang.String str19 = executionEntity1.getCurrentActivityName();
        int int20 = executionEntity1.getSuspensionState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        int int5 = executionEntity1.getSuspensionState();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        boolean boolean7 = executionEntity1.isEnded();
        executionEntity1.setActive(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList10 = executionEntity1.getExecutions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isEventScope();
        java.lang.String str5 = executionEntity1.getCurrentActivityId();
        executionEntity1.setEventScope(true);
        java.lang.String str8 = executionEntity1.getCurrentActivityName();
        java.lang.String str9 = executionEntity1.getActivityId();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = executionEntity1.getReplacedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity10.getProcessInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(executionEntity10);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity5.getParent();
        executionEntity5.disposeStartingExecution();
        executionEntity5.setName("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution15 = executionEntity5.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        java.lang.String str18 = executionEntity17.getActivityId();
        java.lang.String str19 = executionEntity17.getSuperExecutionId();
        boolean boolean20 = executionEntity17.isEventScope();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setActive(true);
        boolean boolean26 = executionEntity23.isScope();
        executionEntity23.setTenantId("hi!");
        executionEntity23.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity23.getCachedElContext();
        boolean boolean31 = executionEntity23.isConcurrent();
        executionEntity23.setName("ScopeExecution[null]");
        executionEntity23.setDeleteReason("ProcessInstance[null]");
        java.lang.String str36 = executionEntity23.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl37 = executionEntity23.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        java.lang.String str40 = executionEntity39.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl41 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl41);
        boolean boolean43 = executionEntity42.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray44 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity42 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList45 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45, executionEntityArray44);
        executionEntity39.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList45);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity39.getProcessVariables();
        executionEntity23.setVariables(strMap48);
        java.lang.String str50 = executionEntity23.getProcessDefinitionId();
        executionEntity23.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl53 = executionEntity23.getTransitionBeingTaken();
        executionEntity5.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        boolean boolean55 = executionEntity23.isEventScope();
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList56 = executionEntity23.getCompensateEventSubscriptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertNull(startingExecution15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(processDefinitionImpl37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(executionEntityArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(transitionImpl53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList56);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl17 = executionEntity5.getActivity();
        boolean boolean18 = executionEntity5.isConcurrent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity5.setTransition(transitionImpl19);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = executionEntity21.getCurrentActivityName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(activityImpl17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executionEntity21);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = executionEntity1.getProcessVariables();
        executionEntity1.setCachedEntityState(100);
        java.lang.String str8 = executionEntity1.getSuperExecutionId();
        int int9 = executionEntity1.getRevisionNext();
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.setActive(false);
        java.lang.Object obj13 = executionEntity1.getPersistentState();
        executionEntity1.setScope(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution20 = executionEntity17.getStartingExecution();
        int int21 = executionEntity17.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        executionEntity17.setActivity(activityImpl22);
        boolean boolean24 = executionEntity17.isProcessInstanceType();
        executionEntity17.setEventName("hi!");
        org.activiti.engine.impl.javax.el.ELContext eLContext27 = executionEntity17.getCachedElContext();
        java.lang.String str28 = executionEntity17.getCurrentActivityId();
        int int29 = executionEntity17.getCachedEntityState();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution30 = executionEntity17.getStartingExecution();
        executionEntity1.setSuperExecution(executionEntity17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=false, parentId=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=false, parentId=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=100, isConcurrent=false, isActive=false, parentId=hi!}");
        org.junit.Assert.assertNotNull(startingExecution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(eLContext27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(startingExecution30);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = executionEntity1.getActivity();
        executionEntity1.setEventScope(false);
        executionEntity1.setEventName("hi!");
        int int14 = executionEntity1.getRevisionNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertNull(activityImpl9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        executionEntity5.disposeStartingExecution();
        executionEntity5.setActive(false);
        executionEntity5.setBusinessKey("hi!");
        boolean boolean22 = executionEntity5.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransition(transitionImpl10);
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        java.lang.String str14 = executionEntity1.getActivityId();
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        executionEntity1.setParentId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        boolean boolean24 = executionEntity23.isConcurrent();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl26);
        int int28 = executionEntity23.getRevision();
        boolean boolean29 = executionEntity23.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        java.lang.String str32 = executionEntity31.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        boolean boolean35 = executionEntity34.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity34 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList37 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37, executionEntityArray36);
        executionEntity31.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        executionEntity23.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = executionEntity1.getActivity();
        executionEntity1.setCachedEntityState(1);
        executionEntity1.setParentId("Execution[null]");
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList47 = executionEntity1.getQueryVariables();
        executionEntity1.setBusinessKey("Execution[null]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(executionEntityArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(activityImpl42);
        org.junit.Assert.assertNull(variableInstanceEntityList47);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        java.lang.String str5 = executionEntity1.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        boolean boolean8 = executionEntity7.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement9 = null;
        executionEntity7.setEventSource(pvmProcessElement9);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl11 = null;
        executionEntity7.setTransitionBeingTaken(transitionImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setParentId("hi!");
        executionEntity14.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setActive(true);
        boolean boolean23 = executionEntity20.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext24 = null;
        executionEntity20.setCachedElContext(eLContext24);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity20.getProcessVariables();
        executionEntity14.setVariables(strMap26);
        executionEntity7.setVariables(strMap26);
        executionEntity7.setExecutionListenerIndex((java.lang.Integer) 100);
        executionEntity1.setSuperExecution(executionEntity7);
        executionEntity1.setBusinessKey("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl34 = null;
        executionEntity1.setTransition(transitionImpl34);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl40 = null;
        executionEntity37.setTransitionBeingTaken(transitionImpl40);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity37);
        int int43 = executionEntity1.getRevision();
        java.lang.Object obj44 = executionEntity1.getPersistentState();
        executionEntity1.setProcessDefinitionId("ScopeExecution[]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl48 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity49 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl48);
        executionEntity49.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution52 = executionEntity49.getStartingExecution();
        java.lang.String str53 = executionEntity49.getActivityId();
        boolean boolean54 = executionEntity49.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl55 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity56 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl55);
        executionEntity56.setActive(true);
        boolean boolean59 = executionEntity56.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext60 = null;
        executionEntity56.setCachedElContext(eLContext60);
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = executionEntity56.getProcessVariables();
        boolean boolean63 = executionEntity56.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl64 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl64);
        executionEntity65.setBusinessKey("hi!");
        java.lang.String str68 = executionEntity65.getProcessInstanceId();
        boolean boolean69 = executionEntity65.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl70 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity71 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl70);
        executionEntity71.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution74 = executionEntity71.getStartingExecution();
        int int75 = executionEntity71.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl76 = null;
        executionEntity71.setActivity(activityImpl76);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution78 = executionEntity71.getStartingExecution();
        executionEntity65.setSuperExecution(executionEntity71);
        executionEntity56.setSuperExecution(executionEntity71);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl81 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity82 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl81);
        executionEntity82.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList85 = null;
        executionEntity82.setQueryVariables(variableInstanceEntityList85);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray87 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList88 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList88, variableInstanceEntityArray87);
        executionEntity82.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList88);
        executionEntity56.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList88);
        executionEntity49.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList88);
        org.activiti.engine.impl.javax.el.ELContext eLContext93 = executionEntity49.getCachedElContext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.setVariable("ProcessInstance[]", (java.lang.Object) eLContext93);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ScopeExecution[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ScopeExecution[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=ScopeExecution[null], name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(startingExecution52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(startingExecution74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(startingExecution78);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(eLContext93);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        int int12 = executionEntity5.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity5.getProcessInstance();
        java.lang.String str14 = executionEntity5.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = executionEntity5.getActivity();
        executionEntity5.setRevision(35);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeVariablesLocal();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(activityImpl15);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        java.lang.String str4 = executionEntity1.getProcessInstanceId();
        java.lang.String str5 = executionEntity1.getTenantId();
        boolean boolean6 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransition();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = executionEntity1.getProcessInstance();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = executionEntity1.getSuperExecution();
        java.lang.Object obj10 = executionEntity1.getPersistentState();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNull(executionEntity8);
        org.junit.Assert.assertNull(executionEntity9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        boolean boolean11 = executionEntity5.isConcurrent();
        executionEntity5.setScope(true);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.removeJob(jobEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        executionEntity5.disposeStartingExecution();
        executionEntity5.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        boolean boolean26 = executionEntity25.isConcurrent();
        executionEntity21.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity25);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = null;
        executionEntity25.setTransitionBeingTaken(transitionImpl28);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = executionEntity25.getProcessInstance();
        java.lang.String str31 = executionEntity25.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setParentId("hi!");
        boolean boolean36 = executionEntity33.isScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity33.getProcessVariables();
        executionEntity25.createVariablesLocal(strMap37);
        executionEntity5.setVariables(strMap37);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        boolean boolean46 = executionEntity45.isConcurrent();
        executionEntity41.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl48 = null;
        executionEntity45.setTransitionBeingTaken(transitionImpl48);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = executionEntity45.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl51 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl51);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        executionEntity52.setActivity(activityImpl53);
        executionEntity45.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity52);
        boolean boolean56 = executionEntity45.isScope();
        executionEntity45.disposeStartingExecution();
        executionEntity45.setActive(false);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl60 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl60);
        executionEntity61.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl64 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity65 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl64);
        boolean boolean66 = executionEntity65.isConcurrent();
        executionEntity61.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity65);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl68 = null;
        executionEntity65.setTransitionBeingTaken(transitionImpl68);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity70 = executionEntity65.getProcessInstance();
        java.lang.String str71 = executionEntity65.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl72 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity73 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl72);
        executionEntity73.setParentId("hi!");
        boolean boolean76 = executionEntity73.isScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = executionEntity73.getProcessVariables();
        executionEntity65.createVariablesLocal(strMap77);
        executionEntity45.setVariables(strMap77);
        executionEntity5.createVariablesLocal(strMap77);
        java.lang.String str81 = executionEntity5.toString();
        executionEntity5.setConcurrent(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(executionEntity30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(activityImpl50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(executionEntity70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ProcessInstance[null]" + "'", str81, "ProcessInstance[null]");
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        executionEntity1.setActivity(activityImpl2);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = executionEntity1.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = executionEntity1.getActivity();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity1.getStartingExecution();
        boolean boolean11 = executionEntity1.isScope();
        java.lang.String str12 = executionEntity1.getBusinessKey();
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(activityImpl7);
        org.junit.Assert.assertNull(activityImpl8);
        org.junit.Assert.assertNotNull(startingExecution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        boolean boolean5 = executionEntity4.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList7, executionEntityArray6);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList7);
        java.lang.String str10 = executionEntity1.getProcessDefinitionId();
        executionEntity1.setActive(false);
        int int13 = executionEntity1.getRevisionNext();
        int int14 = executionEntity1.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList19 = null;
        executionEntity16.setQueryVariables(variableInstanceEntityList19);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray21 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList22 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList22, variableInstanceEntityArray21);
        executionEntity16.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList22);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        executionEntity26.setActivity(activityImpl27);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution29 = executionEntity26.getStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement30 = executionEntity26.getEventSource();
        java.lang.String str31 = executionEntity26.getCurrentActivityName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = executionEntity26.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl37 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity38 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl37);
        boolean boolean39 = executionEntity38.isConcurrent();
        executionEntity34.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity38);
        java.lang.String str41 = executionEntity34.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity42 = executionEntity34.getProcessInstance();
        int int43 = executionEntity34.getCachedEntityState();
        executionEntity26.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity34);
        org.activiti.engine.impl.javax.el.ELContext eLContext45 = null;
        executionEntity34.setCachedElContext(eLContext45);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution47 = executionEntity34.getStartingExecution();
        executionEntity16.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity34);
        java.lang.String str49 = executionEntity16.getCurrentActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        executionEntity51.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution54 = executionEntity51.getStartingExecution();
        int int55 = executionEntity51.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl56 = null;
        executionEntity51.setActivity(activityImpl56);
        boolean boolean58 = executionEntity51.isProcessInstanceType();
        executionEntity51.setEventName("hi!");
        org.activiti.engine.impl.javax.el.ELContext eLContext61 = executionEntity51.getCachedElContext();
        java.lang.String str62 = executionEntity51.getCurrentActivityId();
        int int63 = executionEntity51.getCachedEntityState();
        executionEntity16.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity51);
        int int65 = executionEntity51.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl66 = null;
        executionEntity51.setActivity(activityImpl66);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement68 = null;
        executionEntity51.setEventSource(pvmProcessElement68);
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity51);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(executionEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startingExecution29);
        org.junit.Assert.assertNull(pvmProcessElement30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(activityImpl32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ScopeExecution[null]" + "'", str41, "ScopeExecution[null]");
        org.junit.Assert.assertNotNull(executionEntity42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
        org.junit.Assert.assertNotNull(startingExecution47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(startingExecution54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(eLContext61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        java.lang.String str10 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        boolean boolean13 = executionEntity12.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity12 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15, executionEntityArray14);
        executionEntity9.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        executionEntity1.setActivity(activityImpl19);
        executionEntity1.setName("ProcessInstance[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.TaskEntity> taskEntityList23 = executionEntity1.getTasks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(executionEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setBusinessKey("hi!");
        java.lang.String str13 = executionEntity10.getSuperExecutionId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity10.getStartingExecution();
        executionEntity10.setScope(true);
        executionEntity10.setScope(true);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity19 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList20 = executionEntity10.findInactiveConcurrentExecutions(pvmActivity19);
        int int21 = executionEntity10.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute((org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        org.junit.Assert.assertNull(taskDefinition8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertNotNull(activityExecutionList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity5.getProcessVariables();
        java.lang.String str9 = executionEntity5.getEventName();
        java.lang.String str10 = executionEntity5.toString();
        executionEntity5.setParentId("ProcessInstance[null]");
        java.lang.String str13 = executionEntity5.getId();
        boolean boolean14 = executionEntity5.isProcessInstanceType();
        executionEntity5.setScope(false);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ProcessInstance[null]" + "'", str10, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity5.getEventSource();
        int int12 = executionEntity5.getRevisionNext();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity5.getProcessInstance();
        java.lang.String str14 = executionEntity5.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement15 = null;
        executionEntity5.setEventSource(pvmProcessElement15);
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity5.getCachedElContext();
        int int18 = executionEntity5.getRevisionNext();
        java.lang.String str19 = executionEntity5.getProcessDefinitionId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(executionEntity13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        executionEntity1.setBusinessKey("hi!");
        java.lang.Object obj6 = executionEntity1.getPersistentState();
        java.lang.String str7 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setActive(true);
        boolean boolean13 = executionEntity10.isScope();
        executionEntity10.setTenantId("hi!");
        executionEntity10.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext17 = executionEntity10.getCachedElContext();
        boolean boolean18 = executionEntity10.isEventScope();
        executionEntity10.setEventScope(false);
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = executionEntity10.getCachedElContext();
        executionEntity10.setDeleteReason("ScopeExecution[null]");
        java.lang.String str24 = executionEntity10.getParentId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution25 = executionEntity10.getStartingExecution();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.signal("ProcessInstance[null]", (java.lang.Object) executionEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(eLContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(eLContext21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(startingExecution25);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState(1);
        executionEntity1.setSuspensionState(2);
        java.lang.String str12 = executionEntity1.getName();
        boolean boolean13 = executionEntity1.isEnded();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl14 = executionEntity1.getProcessDefinition();
        java.lang.String str15 = executionEntity1.getTenantId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(processDefinitionImpl14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        java.lang.String str8 = executionEntity1.getEventName();
        java.lang.String str9 = executionEntity1.getSuperExecutionId();
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        boolean boolean18 = executionEntity17.isConcurrent();
        executionEntity13.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setBusinessKey("hi!");
        java.lang.String str24 = executionEntity21.getProcessInstanceId();
        boolean boolean25 = executionEntity21.isScope();
        boolean boolean26 = executionEntity21.isScope();
        executionEntity17.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl28 = executionEntity17.getTransitionBeingTaken();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity1.getCachedElContext();
        java.lang.String str31 = executionEntity1.getCurrentActivityName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(transitionImpl28);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        boolean boolean5 = executionEntity4.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray6 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity4 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList7 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList7, executionEntityArray6);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList7);
        java.lang.String str10 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setActive(true);
        boolean boolean15 = executionEntity12.isScope();
        executionEntity12.setTenantId("hi!");
        executionEntity12.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity12.getCachedElContext();
        executionEntity12.setRevision(1);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        int int23 = executionEntity1.getRevisionNext();
        int int24 = executionEntity1.getSuspensionState();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = executionEntity1.getReplacedBy();
        executionEntity1.setActive(false);
        boolean boolean28 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl29 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity30 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl29);
        executionEntity30.setParentId("hi!");
        executionEntity30.setExecutionListenerIndex((java.lang.Integer) 0);
        java.lang.String str35 = executionEntity30.getBusinessKey();
        executionEntity30.setParentId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl38 = executionEntity30.getTransition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setActive(true);
        boolean boolean43 = executionEntity40.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext44 = null;
        executionEntity40.setCachedElContext(eLContext44);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = executionEntity40.getProcessVariables();
        java.lang.String str47 = executionEntity40.getEventName();
        java.lang.String str48 = executionEntity40.getSuperExecutionId();
        executionEntity30.setSuperExecution(executionEntity40);
        boolean boolean50 = executionEntity40.isEventScope();
        java.lang.Object obj51 = executionEntity40.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement52 = null;
        executionEntity40.setEventSource(pvmProcessElement52);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl54 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl54);
        executionEntity55.setParentId("hi!");
        boolean boolean58 = executionEntity55.isEventScope();
        java.lang.String str59 = executionEntity55.getCurrentActivityId();
        boolean boolean60 = executionEntity55.isEventScope();
        executionEntity55.setScope(false);
        java.lang.String str63 = executionEntity55.getProcessDefinitionId();
        executionEntity55.setScope(false);
        executionEntity55.setScope(false);
        boolean boolean68 = executionEntity55.isEnded();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl69 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity70 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl69);
        executionEntity70.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl73 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity74 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl73);
        boolean boolean75 = executionEntity74.isConcurrent();
        executionEntity70.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity74);
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = executionEntity74.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity78 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList79 = executionEntity74.findInactiveConcurrentExecutions(pvmActivity78);
        int int80 = executionEntity74.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl81 = executionEntity74.getTransitionBeingTaken();
        executionEntity74.setRevision(0);
        boolean boolean84 = executionEntity74.isDeleteRoot();
        java.util.Map<java.lang.String, java.lang.Object> strMap85 = executionEntity74.getProcessVariables();
        executionEntity55.setVariables(strMap85);
        executionEntity40.createVariablesLocal(strMap85);
        executionEntity1.createVariablesLocal(strMap85);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(executionEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(executionEntity25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(transitionImpl38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(activityExecutionList79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 7 + "'", int80 == 7);
        org.junit.Assert.assertNull(transitionImpl81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strMap85);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.lang.String str8 = executionEntity1.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        boolean boolean15 = executionEntity14.isConcurrent();
        executionEntity10.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity14);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = executionEntity14.getProcessVariables();
        executionEntity1.setVariablesLocal(strMap17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl19);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        executionEntity1.setActivity(activityImpl21);
        java.lang.String str23 = executionEntity1.getParentId();
        boolean boolean24 = executionEntity1.isEventScope();
        boolean boolean25 = executionEntity1.isEnded();
        java.lang.String str26 = executionEntity1.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ScopeExecution[null]" + "'", str8, "ScopeExecution[null]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransition(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        executionEntity11.setBusinessKey("hi!");
        java.lang.String str14 = executionEntity11.getSuperExecutionId();
        java.lang.Object obj15 = executionEntity11.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution16 = null;
        executionEntity11.setSubProcessInstance(interpretableExecution16);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        boolean boolean24 = executionEntity23.isConcurrent();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = executionEntity23.getProcessVariables();
        executionEntity11.setVariablesLocal(strMap26);
        executionEntity1.setVariables(strMap26);
        executionEntity1.setProcessDefinitionId("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution31 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl32 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl32);
        executionEntity33.setBusinessKey("hi!");
        java.lang.String str36 = executionEntity33.getSuperExecutionId();
        java.lang.Object obj37 = executionEntity33.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution38 = null;
        executionEntity33.setSubProcessInstance(interpretableExecution38);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        boolean boolean46 = executionEntity45.isConcurrent();
        executionEntity41.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity45.getProcessVariables();
        executionEntity33.setVariablesLocal(strMap48);
        executionEntity33.setBusinessKey("ScopeExecution[null]");
        executionEntity33.setExecutionListenerIndex((java.lang.Integer) 10);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl54 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl54);
        executionEntity55.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl58 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl58);
        boolean boolean60 = executionEntity59.isConcurrent();
        executionEntity55.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity59);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl62 = null;
        executionEntity59.setTransitionBeingTaken(transitionImpl62);
        int int64 = executionEntity59.getRevision();
        executionEntity59.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl66 = executionEntity59.getTransitionBeingTaken();
        executionEntity59.setCachedEntityState((int) (byte) -1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement69 = null;
        executionEntity59.setEventSource(pvmProcessElement69);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl71 = executionEntity59.getProcessDefinition();
        boolean boolean72 = executionEntity59.isDeleteRoot();
        java.lang.String str73 = executionEntity59.getActivityId();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList74 = executionEntity59.getQueryVariables();
        executionEntity59.setName("ScopeExecution[null]");
        executionEntity33.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity59);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl78 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity79 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl78);
        executionEntity79.setActive(true);
        boolean boolean82 = executionEntity79.isScope();
        executionEntity79.setTenantId("hi!");
        java.lang.String str85 = executionEntity79.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl86 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity87 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl86);
        java.lang.String str88 = executionEntity87.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl89 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity90 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl89);
        boolean boolean91 = executionEntity90.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray92 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity90 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList93 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList93, executionEntityArray92);
        executionEntity87.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList93);
        executionEntity79.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList93);
        executionEntity59.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList93);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList93);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(startingExecution31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(transitionImpl66);
        org.junit.Assert.assertNull(processDefinitionImpl71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(variableInstanceEntityList74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(executionEntityArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        boolean boolean3 = executionEntity1.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl4 = null;
        executionEntity1.setTransition(transitionImpl4);
        java.lang.String str6 = executionEntity1.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl7 = executionEntity1.getTransitionBeingTaken();
        executionEntity1.inactivate();
        java.lang.String str9 = executionEntity1.getBusinessKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transitionImpl7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement7 = executionEntity1.getEventSource();
        java.lang.String str8 = executionEntity1.getName();
        executionEntity1.inactivate();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement10 = null;
        executionEntity1.setEventSource(pvmProcessElement10);
        executionEntity1.setName("ProcessInstance[hi!]");
        org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity eventSubscriptionEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.addEventSubscription(eventSubscriptionEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(pvmProcessElement7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        boolean boolean9 = executionEntity1.isConcurrent();
        executionEntity1.setName("ScopeExecution[null]");
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 7);
        java.lang.String str16 = executionEntity1.getProcessDefinitionId();
        java.lang.String str17 = executionEntity1.getEventName();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList18 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl19 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity20 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl19);
        executionEntity20.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        boolean boolean25 = executionEntity24.isConcurrent();
        executionEntity20.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = null;
        executionEntity24.setTransitionBeingTaken(transitionImpl27);
        int int29 = executionEntity24.getRevision();
        boolean boolean30 = executionEntity24.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        java.lang.String str33 = executionEntity32.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        boolean boolean36 = executionEntity35.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity35 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList38 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList38, executionEntityArray37);
        executionEntity32.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList38);
        executionEntity24.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList38);
        int int42 = executionEntity24.getRevision();
        boolean boolean43 = executionEntity24.isScope();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity24);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl45 = executionEntity1.getTransitionBeingTaken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(variableInstanceEntityList18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(executionEntityArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(transitionImpl45);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = executionEntity5.getParent();
        executionEntity5.disposeStartingExecution();
        executionEntity5.setSuspensionState((int) (byte) 1);
        boolean boolean15 = executionEntity5.isScope();
        executionEntity5.setActive(true);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl18);
        executionEntity5.setName("ProcessInstance[null]");
        executionEntity5.setScope(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList24 = executionEntity5.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(executionEntity11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        java.lang.String str8 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState((int) (byte) 0);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList16 = executionEntity1.getCompensateEventSubscriptions("ScopeExecution[null]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(compensateEventSubscriptionEntityList16);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        executionEntity1.setActivity(activityImpl2);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = executionEntity1.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution11 = executionEntity8.getStartingExecution();
        executionEntity8.setId("");
        executionEntity8.setParentId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        boolean boolean22 = executionEntity21.isConcurrent();
        executionEntity17.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity21.getProcessVariables();
        executionEntity8.setVariables(strMap24);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl26 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity27 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl26);
        executionEntity27.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution30 = executionEntity27.getStartingExecution();
        executionEntity27.setId("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity33 = executionEntity27.getParent();
        executionEntity8.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity33);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        executionEntity36.setParentId("hi!");
        boolean boolean39 = executionEntity36.isScope();
        executionEntity36.setSuspensionState(1);
        executionEntity8.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement43 = executionEntity36.getEventSource();
        executionEntity36.setParentId("ProcessInstance[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity47 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl46);
        executionEntity47.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        boolean boolean52 = executionEntity51.isConcurrent();
        executionEntity47.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity51);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl54 = null;
        executionEntity51.setTransitionBeingTaken(transitionImpl54);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity56 = executionEntity51.getProcessInstance();
        java.lang.String str57 = executionEntity51.getSuperExecutionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl58 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity59 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl58);
        executionEntity59.setParentId("hi!");
        boolean boolean62 = executionEntity59.isScope();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = executionEntity59.getProcessVariables();
        executionEntity51.createVariablesLocal(strMap63);
        executionEntity36.setVariablesLocal(strMap63);
        executionEntity1.createVariablesLocal(strMap63);
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition67 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition67);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(startingExecution11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(startingExecution30);
        org.junit.Assert.assertNull(executionEntity33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(pvmProcessElement43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(executionEntity56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strMap63);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        boolean boolean8 = executionEntity1.isProcessInstanceType();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl9 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity10 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl9);
        executionEntity10.setBusinessKey("hi!");
        java.lang.String str13 = executionEntity10.getProcessInstanceId();
        boolean boolean14 = executionEntity10.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution19 = executionEntity16.getStartingExecution();
        int int20 = executionEntity16.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl21 = null;
        executionEntity16.setActivity(activityImpl21);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution23 = executionEntity16.getStartingExecution();
        executionEntity10.setSuperExecution(executionEntity16);
        executionEntity1.setSuperExecution(executionEntity16);
        java.lang.String str26 = executionEntity16.getParentId();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl27 = null;
        executionEntity16.setTransition(transitionImpl27);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity16.getTransitionBeingTaken();
        boolean boolean30 = executionEntity16.isConcurrent();
        java.lang.String str31 = executionEntity16.getBusinessKey();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement32 = null;
        executionEntity16.setEventSource(pvmProcessElement32);
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity16.getSuperExecution();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = executionEntity16.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList36 = executionEntity35.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(startingExecution19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(startingExecution23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(transitionImpl29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(executionEntity34);
        org.junit.Assert.assertNull(executionEntity35);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isEventScope();
        java.lang.String str5 = executionEntity1.getCurrentActivityId();
        executionEntity1.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        boolean boolean14 = executionEntity13.isConcurrent();
        executionEntity9.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl16 = null;
        executionEntity13.setTransitionBeingTaken(transitionImpl16);
        int int18 = executionEntity13.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity13.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity13.setTransition(transitionImpl20);
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.lang.String str23 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl24 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity25 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl24);
        executionEntity25.setParentId("hi!");
        executionEntity25.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        executionEntity31.setActive(true);
        boolean boolean34 = executionEntity31.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext35 = null;
        executionEntity31.setCachedElContext(eLContext35);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = executionEntity31.getProcessVariables();
        executionEntity25.setVariables(strMap37);
        executionEntity1.createVariablesLocal(strMap37);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        executionEntity41.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        boolean boolean46 = executionEntity45.isConcurrent();
        executionEntity41.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl48 = null;
        executionEntity45.setTransitionBeingTaken(transitionImpl48);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = executionEntity45.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl51 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl51);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        executionEntity52.setActivity(activityImpl53);
        executionEntity45.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity52);
        boolean boolean56 = executionEntity45.isScope();
        boolean boolean57 = executionEntity45.isDeleteRoot();
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity45);
        java.lang.String str59 = executionEntity45.getEventName();
        executionEntity45.setEventName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = executionEntity45.getProcessBusinessKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(activityImpl50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl3 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity4 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl3);
        executionEntity4.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        boolean boolean9 = executionEntity8.isConcurrent();
        executionEntity4.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity8);
        java.lang.String str11 = executionEntity4.toString();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        boolean boolean18 = executionEntity17.isConcurrent();
        executionEntity13.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity17.getProcessVariables();
        executionEntity4.setVariablesLocal(strMap20);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl22 = null;
        executionEntity4.setTransitionBeingTaken(transitionImpl22);
        executionEntity1.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity4);
        boolean boolean25 = executionEntity4.isDeleteRoot();
        int int26 = executionEntity4.getSuspensionState();
        java.lang.String str27 = executionEntity4.getBusinessKey();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl28 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity29 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl28);
        executionEntity29.setActive(true);
        boolean boolean32 = executionEntity29.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext33 = null;
        executionEntity29.setCachedElContext(eLContext33);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList35 = executionEntity29.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        boolean boolean38 = executionEntity37.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement39 = null;
        executionEntity37.setEventSource(pvmProcessElement39);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl41 = null;
        executionEntity37.setTransitionBeingTaken(transitionImpl41);
        executionEntity37.setName("ScopeExecution[null]");
        java.lang.String str45 = executionEntity37.getEventName();
        executionEntity29.setSuperExecution(executionEntity37);
        java.lang.String str47 = executionEntity37.getCurrentActivityId();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = executionEntity37.getProcessVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl49);
        java.lang.String str51 = executionEntity50.getActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution52 = executionEntity50.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity54 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl53);
        executionEntity54.setBusinessKey("hi!");
        executionEntity54.setBusinessKey("hi!");
        executionEntity54.setName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        executionEntity62.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList65 = null;
        executionEntity62.setQueryVariables(variableInstanceEntityList65);
        org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] variableInstanceEntityArray67 = new org.activiti.engine.impl.persistence.entity.VariableInstanceEntity[] {};
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList68 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68, variableInstanceEntityArray67);
        executionEntity62.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity54.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity50.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity37.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        executionEntity4.setQueryVariables((java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity>) variableInstanceEntityList68);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl75 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity76 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl75);
        executionEntity76.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList79 = null;
        executionEntity76.setQueryVariables(variableInstanceEntityList79);
        executionEntity76.setName("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement83 = executionEntity76.getEventSource();
        java.lang.String str84 = executionEntity76.getEventName();
        executionEntity4.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity76);
        org.activiti.engine.impl.pvm.runtime.AtomicOperation atomicOperation86 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity76.performOperation(atomicOperation86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ScopeExecution[null]" + "'", str11, "ScopeExecution[null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(startingExecution52);
        org.junit.Assert.assertNotNull(variableInstanceEntityArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(pvmProcessElement83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = executionEntity1.getProcessVariables();
        java.lang.String str8 = executionEntity1.getEventName();
        java.lang.String str9 = executionEntity1.getSuperExecutionId();
        java.lang.String str10 = executionEntity1.getName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        executionEntity12.setActive(true);
        boolean boolean15 = executionEntity12.isScope();
        executionEntity12.setTenantId("hi!");
        executionEntity12.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext19 = executionEntity12.getCachedElContext();
        boolean boolean20 = executionEntity12.isConcurrent();
        executionEntity12.setName("ScopeExecution[null]");
        executionEntity1.setSuperExecution(executionEntity12);
        java.lang.String str24 = executionEntity1.getId();
        org.activiti.engine.impl.pvm.PvmTransition pvmTransition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.take(pvmTransition25);
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.impl.pvm.PvmException; message: transition is null");
        } catch (org.activiti.engine.impl.pvm.PvmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(eLContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = executionEntity5.getProcessVariables();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity9 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList10 = executionEntity5.findInactiveConcurrentExecutions(pvmActivity9);
        int int11 = executionEntity5.getCachedEntityState();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = executionEntity5.getTransitionBeingTaken();
        executionEntity5.setRevision(0);
        boolean boolean15 = executionEntity5.isSuspended();
        java.lang.String str16 = executionEntity5.getSuperExecutionId();
        executionEntity5.setBusinessKey("");
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity5.getProcessInstance();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity19.setRevision(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(activityExecutionList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNull(transitionImpl12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(executionEntity19);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setActive(true);
        boolean boolean12 = executionEntity9.isScope();
        executionEntity9.setTenantId("hi!");
        java.lang.String str15 = executionEntity9.getEventName();
        executionEntity9.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl18 = null;
        executionEntity9.setTransition(transitionImpl18);
        executionEntity9.setDeleteReason("ScopeExecution[null]");
        java.lang.String str22 = executionEntity9.getActivityId();
        java.lang.Object obj23 = executionEntity9.getPersistentState();
        executionEntity9.setParentId("");
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = null;
        executionEntity1.setEventSource(pvmProcessElement27);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = executionEntity1.getTransition();
        int int30 = executionEntity1.getRevisionNext();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.destroyScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNull(transitionImpl29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        boolean boolean4 = executionEntity1.isEventScope();
        java.lang.String str5 = executionEntity1.getCurrentActivityId();
        executionEntity1.setEventScope(true);
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl8 = executionEntity1.getProcessDefinition();
        boolean boolean9 = executionEntity1.isEventScope();
        boolean boolean10 = executionEntity1.isEventScope();
        java.lang.Class<?> wildcardClass11 = executionEntity1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(processDefinitionImpl8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        executionEntity1.setCachedEntityState(1);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl10 = null;
        executionEntity1.setTransition(transitionImpl10);
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        java.lang.String str14 = executionEntity1.getActivityId();
        java.lang.Object obj15 = executionEntity1.getPersistentState();
        executionEntity1.setParentId("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        boolean boolean24 = executionEntity23.isConcurrent();
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl26 = null;
        executionEntity23.setTransitionBeingTaken(transitionImpl26);
        int int28 = executionEntity23.getRevision();
        boolean boolean29 = executionEntity23.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl30 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity31 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl30);
        java.lang.String str32 = executionEntity31.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        boolean boolean35 = executionEntity34.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity34 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList37 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37, executionEntityArray36);
        executionEntity31.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        executionEntity23.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList37);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity42 = null;
        executionEntity1.removeTask(taskEntity42);
        executionEntity1.setTenantId("ScopeExecution[null]");
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity46 = null;
        executionEntity1.addJob(jobEntity46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.IdentityLinkEntity> identityLinkEntityList48 = executionEntity1.getIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=1, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(executionEntityArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        java.lang.String str4 = executionEntity1.getProcessInstanceId();
        boolean boolean5 = executionEntity1.isScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl6 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity7 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl6);
        executionEntity7.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution10 = executionEntity7.getStartingExecution();
        int int11 = executionEntity7.getSuspensionState();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        executionEntity7.setActivity(activityImpl12);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution14 = executionEntity7.getStartingExecution();
        executionEntity1.setSuperExecution(executionEntity7);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        executionEntity17.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        boolean boolean22 = executionEntity21.isConcurrent();
        executionEntity17.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity21);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = null;
        executionEntity21.setTransitionBeingTaken(transitionImpl24);
        int int26 = executionEntity21.getRevision();
        boolean boolean27 = executionEntity21.isConcurrent();
        executionEntity21.setScope(true);
        executionEntity7.setSuperExecution(executionEntity21);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl31 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity32 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl31);
        executionEntity32.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl35 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity36 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl35);
        boolean boolean37 = executionEntity36.isConcurrent();
        executionEntity32.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl39 = null;
        executionEntity36.setTransitionBeingTaken(transitionImpl39);
        int int41 = executionEntity36.getRevision();
        executionEntity36.setCachedEntityState((int) '#');
        executionEntity36.setEventName("hi!");
        int int46 = executionEntity36.getRevision();
        executionEntity7.setSubProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity36);
        executionEntity7.inactivate();
        java.lang.Object obj49 = executionEntity7.getPersistentState();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement50 = executionEntity7.getEventSource();
        executionEntity7.setBusinessKey("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList54 = executionEntity7.getCompensateEventSubscriptions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(startingExecution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(startingExecution14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=false, parentId=null}");
        org.junit.Assert.assertNull(pvmProcessElement50);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        boolean boolean18 = executionEntity17.isConcurrent();
        executionEntity13.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity17.setTransitionBeingTaken(transitionImpl20);
        int int22 = executionEntity17.getRevision();
        executionEntity17.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl24 = executionEntity17.getTransitionBeingTaken();
        executionEntity17.setCachedEntityState((int) (byte) -1);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement27 = null;
        executionEntity17.setEventSource(pvmProcessElement27);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl29 = null;
        executionEntity17.setTransition(transitionImpl29);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity17.setTransition(transitionImpl31);
        executionEntity17.disposeStartingExecution();
        java.lang.String str34 = executionEntity17.getCurrentActivityName();
        boolean boolean35 = executionEntity17.isEventScope();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setBusinessKey("hi!");
        executionEntity37.setBusinessKey("hi!");
        java.lang.String str42 = executionEntity37.getProcessInstanceId();
        int int43 = executionEntity37.getRevision();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl44 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity45 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl44);
        executionEntity45.setBusinessKey("hi!");
        java.lang.String str48 = executionEntity45.getSuperExecutionId();
        java.lang.Object obj49 = executionEntity45.getPersistentState();
        boolean boolean50 = executionEntity45.isActive();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl51 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity52 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl51);
        boolean boolean53 = executionEntity52.isConcurrent();
        java.lang.String str54 = executionEntity52.toString();
        executionEntity45.setSuperExecution(executionEntity52);
        executionEntity37.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity52);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl57 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity58 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl57);
        java.lang.String str59 = executionEntity58.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl60 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity61 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl60);
        boolean boolean62 = executionEntity61.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray63 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity61 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList64 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList64, executionEntityArray63);
        executionEntity58.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList64);
        executionEntity52.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList64);
        executionEntity17.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList64);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList69 = executionEntity17.getQueryVariables();
        executionEntity17.setTenantId("ScopeExecution[]");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity11, (org.activiti.engine.impl.pvm.delegate.ActivityExecution) executionEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(taskDefinition9);
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(transitionImpl24);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ProcessInstance[null]" + "'", str54, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(executionEntityArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList69);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        executionEntity12.setEventName("ProcessInstance[null]");
        executionEntity12.setConcurrent(true);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement20 = null;
        executionEntity12.setEventSource(pvmProcessElement20);
        executionEntity12.setSuspensionState(100);
        boolean boolean24 = executionEntity12.isEventScope();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl25 = executionEntity12.getTransition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(transitionImpl25);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        java.lang.String str5 = executionEntity1.getId();
        java.lang.String str6 = executionEntity1.getCurrentActivityName();
        executionEntity1.setSuspensionState((int) (byte) -1);
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) 1);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        java.lang.String str13 = executionEntity12.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl14 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity15 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl14);
        boolean boolean16 = executionEntity15.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity15 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList18 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList18, executionEntityArray17);
        executionEntity12.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList18);
        java.lang.String str21 = executionEntity12.getProcessDefinitionId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setActive(true);
        boolean boolean26 = executionEntity23.isScope();
        executionEntity23.setTenantId("hi!");
        executionEntity23.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = executionEntity23.getCachedElContext();
        executionEntity23.setRevision(1);
        executionEntity12.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity23);
        executionEntity1.setSuperExecution(executionEntity12);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement35 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        executionEntity37.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl40 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity41 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl40);
        boolean boolean42 = executionEntity41.isConcurrent();
        executionEntity37.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity41);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl44 = null;
        executionEntity41.setTransitionBeingTaken(transitionImpl44);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl46 = executionEntity41.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl47 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity48 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl47);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        executionEntity48.setActivity(activityImpl49);
        executionEntity41.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity48);
        boolean boolean52 = executionEntity41.isScope();
        boolean boolean53 = executionEntity41.isDeleteRoot();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity41);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList55 = executionEntity41.getQueryVariables();
        executionEntity41.setParentId("Execution[null]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.EventSubscriptionEntity> eventSubscriptionEntityList58 = executionEntity41.getEventSubscriptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(executionEntityArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(eLContext30);
        org.junit.Assert.assertNull(pvmProcessElement35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(activityImpl46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(variableInstanceEntityList55);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        executionEntity1.setName("ScopeExecution[null]");
        org.activiti.engine.impl.javax.el.ELContext eLContext9 = executionEntity1.getCachedElContext();
        executionEntity1.setExecutionListenerIndex((java.lang.Integer) (-1));
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl12 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl12);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity1.getQueryVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.activiti.engine.impl.persistence.entity.IdentityLinkEntity identityLinkEntity17 = executionEntity1.involveUser("ProcessInstance[]", "ScopeExecution[null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(eLContext9);
        org.junit.Assert.assertNull(variableInstanceEntityList14);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        boolean boolean9 = executionEntity1.isConcurrent();
        executionEntity1.setName("ScopeExecution[null]");
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl15 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity16 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl15);
        executionEntity16.setParentId("hi!");
        boolean boolean19 = executionEntity16.isEventScope();
        java.lang.String str20 = executionEntity16.getCurrentActivityId();
        executionEntity16.setScope(true);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl23 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity24 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl23);
        executionEntity24.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity28 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl27);
        boolean boolean29 = executionEntity28.isConcurrent();
        executionEntity24.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl31 = null;
        executionEntity28.setTransitionBeingTaken(transitionImpl31);
        int int33 = executionEntity28.getRevision();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = executionEntity28.getParent();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl35 = null;
        executionEntity28.setTransition(transitionImpl35);
        executionEntity16.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity28);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl38 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl38);
        executionEntity39.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl42 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity43 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl42);
        boolean boolean44 = executionEntity43.isConcurrent();
        executionEntity39.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity43);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = executionEntity43.getProcessVariables();
        executionEntity28.setVariables(strMap46);
        executionEntity1.createVariablesLocal(strMap46);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl49);
        executionEntity50.setBusinessKey("hi!");
        java.lang.String str53 = executionEntity50.getSuperExecutionId();
        java.lang.Object obj54 = executionEntity50.getPersistentState();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity50);
        executionEntity1.setConcurrent(false);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity58 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList59 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity58);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(executionEntity34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList59);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        java.lang.String str2 = executionEntity1.getActivityId();
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution3 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        executionEntity5.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        boolean boolean10 = executionEntity9.isConcurrent();
        executionEntity5.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity9);
        java.lang.String str12 = executionEntity5.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = executionEntity5.getProcessInstance();
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList14 = executionEntity13.getQueryVariables();
        executionEntity1.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity16 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList17 = executionEntity13.findInactiveConcurrentExecutions(pvmActivity16);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity18 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList19 = executionEntity13.findInactiveConcurrentExecutions(pvmActivity18);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList20 = executionEntity13.getQueryVariables();
        org.activiti.engine.impl.javax.el.ELContext eLContext21 = executionEntity13.getCachedElContext();
        executionEntity13.setEventScope(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(startingExecution3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ScopeExecution[null]" + "'", str12, "ScopeExecution[null]");
        org.junit.Assert.assertNotNull(executionEntity13);
        org.junit.Assert.assertNull(variableInstanceEntityList14);
        org.junit.Assert.assertNotNull(activityExecutionList17);
        org.junit.Assert.assertNotNull(activityExecutionList19);
        org.junit.Assert.assertNull(variableInstanceEntityList20);
        org.junit.Assert.assertNull(eLContext21);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        boolean boolean17 = executionEntity5.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setBusinessKey("hi!");
        boolean boolean22 = executionEntity19.isSuspended();
        executionEntity19.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl25 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity26 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl25);
        executionEntity26.setActive(true);
        boolean boolean29 = executionEntity26.isScope();
        executionEntity26.setTenantId("hi!");
        java.lang.String str32 = executionEntity26.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        java.lang.String str35 = executionEntity34.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl36 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity37 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl36);
        boolean boolean38 = executionEntity37.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray39 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity37 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList40 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList40, executionEntityArray39);
        executionEntity34.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList40);
        executionEntity26.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList40);
        executionEntity19.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity26.setConcurrent(false);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity26);
        executionEntity26.setDeleteReason("");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl50 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity51 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl50);
        executionEntity51.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl54 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl54);
        boolean boolean56 = executionEntity55.isConcurrent();
        executionEntity51.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity55);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl58 = null;
        executionEntity55.setTransitionBeingTaken(transitionImpl58);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl60 = executionEntity55.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl61 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity62 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl61);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl63 = null;
        executionEntity62.setActivity(activityImpl63);
        executionEntity55.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity62);
        boolean boolean66 = executionEntity55.isScope();
        executionEntity55.disposeStartingExecution();
        executionEntity55.setEventName("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl70 = null;
        executionEntity55.setTransitionBeingTaken(transitionImpl70);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl72 = executionEntity55.getTransitionBeingTaken();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement73 = null;
        executionEntity55.setEventSource(pvmProcessElement73);
        executionEntity26.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity55);
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement76 = executionEntity26.getEventSource();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(executionEntityArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(activityImpl60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(transitionImpl72);
        org.junit.Assert.assertNull(pvmProcessElement76);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(taskDefinition9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList4 = null;
        executionEntity1.setQueryVariables(variableInstanceEntityList4);
        executionEntity1.setName("");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement8 = executionEntity1.getEventSource();
        java.lang.String str9 = executionEntity1.getEventName();
        java.lang.String str10 = executionEntity1.getBusinessKey();
        java.lang.String str11 = executionEntity1.getTenantId();
        executionEntity1.setRevision((int) '#');
        int int14 = executionEntity1.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = executionEntity1.hasVariableLocal("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(pvmProcessElement8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        executionEntity1.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext8 = executionEntity1.getCachedElContext();
        boolean boolean9 = executionEntity1.isConcurrent();
        executionEntity1.setName("ScopeExecution[null]");
        executionEntity1.setDeleteReason("ProcessInstance[null]");
        java.lang.String str14 = executionEntity1.getProcessInstanceId();
        java.lang.String str15 = executionEntity1.getActivityId();
        executionEntity1.setActive(true);
        executionEntity1.setBusinessKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(eLContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("ScopeExecution[null]");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        org.junit.Assert.assertNull(taskDefinition2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = executionEntity5.getActivity();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        executionEntity12.setActivity(activityImpl13);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity12);
        boolean boolean16 = executionEntity5.isScope();
        executionEntity5.disposeStartingExecution();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl18 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl18);
        executionEntity19.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList22 = null;
        executionEntity19.setQueryVariables(variableInstanceEntityList22);
        executionEntity5.setParent((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity19);
        boolean boolean25 = executionEntity19.isEventScope();
        int int26 = executionEntity19.getRevisionNext();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl27 = null;
        executionEntity19.setActivity(activityImpl27);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution29 = executionEntity19.getStartingExecution();
        java.lang.String str30 = executionEntity19.getProcessInstanceId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(activityImpl10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(startingExecution29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        boolean boolean10 = executionEntity9.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = null;
        executionEntity9.setEventSource(pvmProcessElement11);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = null;
        executionEntity9.setTransitionBeingTaken(transitionImpl13);
        executionEntity9.setName("ScopeExecution[null]");
        java.lang.String str17 = executionEntity9.getEventName();
        executionEntity1.setSuperExecution(executionEntity9);
        java.lang.String str19 = executionEntity9.toString();
        java.lang.String str20 = executionEntity9.getDeleteReason();
        java.lang.String str21 = executionEntity9.getProcessDefinitionId();
        int int22 = executionEntity9.getSuspensionState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.impl.persistence.entity.CompensateEventSubscriptionEntity> compensateEventSubscriptionEntityList24 = executionEntity9.getCompensateEventSubscriptions("ProcessInstance[ProcessInstance[ScopeExecution[null]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ProcessInstance[null]" + "'", str19, "ProcessInstance[null]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext5 = null;
        executionEntity1.setCachedElContext(eLContext5);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList7 = executionEntity1.getQueryVariables();
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity1.setTransition(transitionImpl8);
        boolean boolean10 = executionEntity1.isActive();
        executionEntity1.disposeStartingExecution();
        executionEntity1.setParentId("ProcessInstance[null]");
        boolean boolean14 = executionEntity1.isScope();
        boolean boolean15 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        executionEntity1.setActivity(activityImpl16);
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeIdentityLinks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        java.lang.String str4 = executionEntity1.getSuperExecutionId();
        java.lang.Object obj5 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.runtime.InterpretableExecution interpretableExecution6 = null;
        executionEntity1.setSubProcessInstance(interpretableExecution6);
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl10 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity11 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl10);
        boolean boolean12 = executionEntity11.isConcurrent();
        boolean boolean13 = executionEntity11.isEventScope();
        executionEntity11.setDeleteReason("hi!");
        executionEntity1.setSuperExecution(executionEntity11);
        executionEntity1.setTenantId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl19 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl19);
        boolean boolean21 = executionEntity1.isDeleteRoot();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl22 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity23 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl22);
        executionEntity23.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList26 = null;
        executionEntity23.setQueryVariables(variableInstanceEntityList26);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity28 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList29 = executionEntity23.findInactiveConcurrentExecutions(pvmActivity28);
        org.activiti.engine.impl.javax.el.ELContext eLContext30 = null;
        executionEntity23.setCachedElContext(eLContext30);
        java.lang.String str32 = executionEntity23.getTenantId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl33 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity34 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl33);
        executionEntity34.setActive(true);
        boolean boolean37 = executionEntity34.isScope();
        executionEntity34.setTenantId("hi!");
        executionEntity34.disposeStartingExecution();
        org.activiti.engine.impl.javax.el.ELContext eLContext41 = executionEntity34.getCachedElContext();
        boolean boolean42 = executionEntity34.isConcurrent();
        executionEntity34.setName("ScopeExecution[null]");
        executionEntity34.setDeleteReason("ProcessInstance[null]");
        java.lang.String str47 = executionEntity34.getProcessInstanceId();
        org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl processDefinitionImpl48 = executionEntity34.getProcessDefinition();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl49 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity50 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl49);
        java.lang.String str51 = executionEntity50.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl52 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity53 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl52);
        boolean boolean54 = executionEntity53.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray55 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity53 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList56 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList56, executionEntityArray55);
        executionEntity50.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList56);
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = executionEntity50.getProcessVariables();
        executionEntity34.setVariables(strMap59);
        executionEntity23.setVariables(strMap59);
        executionEntity1.setSuperExecution(executionEntity23);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl63 = executionEntity1.getActivity();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity64 = executionEntity1.getReplacedBy();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=hi!, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(activityExecutionList29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(eLContext41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(processDefinitionImpl48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(executionEntityArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(activityImpl63);
        org.junit.Assert.assertNull(executionEntity64);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl4 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity5 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl4);
        boolean boolean6 = executionEntity5.isConcurrent();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity5);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl8 = null;
        executionEntity5.setTransitionBeingTaken(transitionImpl8);
        int int10 = executionEntity5.getRevision();
        executionEntity5.setSuspensionState((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        int int5 = executionEntity1.getSuspensionState();
        executionEntity1.setId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        executionEntity9.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        boolean boolean14 = executionEntity13.isConcurrent();
        executionEntity9.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = executionEntity13.getProcessVariables();
        java.lang.String str17 = executionEntity13.getEventName();
        java.lang.String str18 = executionEntity13.toString();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity19 = executionEntity13.getReplacedBy();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl20 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity21 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl20);
        executionEntity21.setActive(true);
        boolean boolean24 = executionEntity21.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext25 = null;
        executionEntity21.setCachedElContext(eLContext25);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList27 = executionEntity21.getQueryVariables();
        executionEntity21.setId("ScopeExecution[null]");
        executionEntity21.setRevision((int) (short) -1);
        executionEntity21.setEventName("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl34 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity35 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl34);
        executionEntity35.setBusinessKey("hi!");
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement38 = executionEntity35.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl39 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity40 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl39);
        executionEntity40.setActive(true);
        java.util.List<org.activiti.engine.impl.persistence.entity.VariableInstanceEntity> variableInstanceEntityList43 = null;
        executionEntity40.setQueryVariables(variableInstanceEntityList43);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity45 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList46 = executionEntity40.findInactiveConcurrentExecutions(pvmActivity45);
        org.activiti.engine.impl.javax.el.ELContext eLContext47 = null;
        executionEntity40.setCachedElContext(eLContext47);
        executionEntity35.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity40);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = executionEntity35.getProcessVariables();
        executionEntity21.setVariables(strMap50);
        executionEntity13.setVariablesLocal(strMap50);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl53 = executionEntity13.getActivity();
        executionEntity1.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity13);
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ProcessInstance[null]" + "'", str18, "ProcessInstance[null]");
        org.junit.Assert.assertNull(executionEntity19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(variableInstanceEntityList27);
        org.junit.Assert.assertNull(pvmProcessElement38);
        org.junit.Assert.assertNotNull(activityExecutionList46);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(activityImpl53);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl7 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity8 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl7);
        executionEntity8.setParentId("hi!");
        executionEntity8.setExecutionListenerIndex((java.lang.Integer) 0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl13 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl13);
        executionEntity14.setActive(true);
        boolean boolean17 = executionEntity14.isScope();
        org.activiti.engine.impl.javax.el.ELContext eLContext18 = null;
        executionEntity14.setCachedElContext(eLContext18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = executionEntity14.getProcessVariables();
        executionEntity8.setVariables(strMap20);
        executionEntity1.setVariables(strMap20);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = executionEntity1.getProcessVariables();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionEntity1.getProcessVariables();
        executionEntity1.setDeleteReason("ScopeExecution[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl2 = null;
        executionEntity1.setActivity(activityImpl2);
        org.activiti.engine.impl.pvm.runtime.StartingExecution startingExecution4 = executionEntity1.getStartingExecution();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement5 = executionEntity1.getEventSource();
        boolean boolean6 = executionEntity1.isEventScope();
        java.lang.Object obj7 = executionEntity1.getPersistentState();
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity8 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList9 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity8);
        java.lang.String str10 = executionEntity1.getBusinessKey();
        executionEntity1.setDeleteReason("ScopeExecution[null]");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl13 = executionEntity1.getTransitionBeingTaken();
        boolean boolean14 = executionEntity1.isEventScope();
        org.junit.Assert.assertNotNull(startingExecution4);
        org.junit.Assert.assertNull(pvmProcessElement5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{processDefinitionId=null, activityId=null, isScope=true, suspensionState=1, isEventScope=false, businessKey=null, name=null, superExecution=null, cachedEntityState=0, isConcurrent=false, isActive=true, parentId=null}");
        org.junit.Assert.assertNotNull(activityExecutionList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(transitionImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        executionEntity1.setActive(true);
        boolean boolean4 = executionEntity1.isScope();
        executionEntity1.setTenantId("hi!");
        java.lang.String str7 = executionEntity1.getEventName();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl8 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity9 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl8);
        java.lang.String str10 = executionEntity9.getActivityId();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl11 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity12 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl11);
        boolean boolean13 = executionEntity12.isConcurrent();
        org.activiti.engine.impl.persistence.entity.ExecutionEntity[] executionEntityArray14 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity[] { executionEntity12 };
        java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity> executionEntityList15 = new java.util.ArrayList<org.activiti.engine.impl.persistence.entity.ExecutionEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15, executionEntityArray14);
        executionEntity9.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15);
        executionEntity1.setExecutions((java.util.List<org.activiti.engine.impl.persistence.entity.ExecutionEntity>) executionEntityList15);
        org.activiti.engine.impl.pvm.PvmActivity pvmActivity19 = null;
        java.util.List<org.activiti.engine.impl.pvm.delegate.ActivityExecution> activityExecutionList20 = executionEntity1.findInactiveConcurrentExecutions(pvmActivity19);
        executionEntity1.setParentId("");
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl23 = executionEntity1.getTransition();
        executionEntity1.setEventName("ScopeExecution[]");
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.deleteVariablesInstanceForLeavingScope();
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(executionEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(activityExecutionList20);
        org.junit.Assert.assertNull(transitionImpl23);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl0 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity1 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl0);
        boolean boolean2 = executionEntity1.isConcurrent();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement3 = null;
        executionEntity1.setEventSource(pvmProcessElement3);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl5 = null;
        executionEntity1.setTransitionBeingTaken(transitionImpl5);
        executionEntity1.setName("ScopeExecution[null]");
        java.lang.String str9 = executionEntity1.getCurrentActivityName();
        boolean boolean10 = executionEntity1.isSuspended();
        org.activiti.engine.impl.pvm.PvmProcessElement pvmProcessElement11 = executionEntity1.getEventSource();
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl12 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity13 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl12);
        executionEntity13.setParentId("hi!");
        org.activiti.engine.impl.pvm.process.ActivityImpl activityImpl16 = null;
        org.activiti.engine.impl.persistence.entity.ExecutionEntity executionEntity17 = new org.activiti.engine.impl.persistence.entity.ExecutionEntity(activityImpl16);
        boolean boolean18 = executionEntity17.isConcurrent();
        executionEntity13.setProcessInstance((org.activiti.engine.impl.pvm.runtime.InterpretableExecution) executionEntity17);
        org.activiti.engine.impl.pvm.process.TransitionImpl transitionImpl20 = null;
        executionEntity17.setTransitionBeingTaken(transitionImpl20);
        executionEntity17.setCachedEntityState((int) (short) 10);
        org.activiti.engine.impl.persistence.entity.JobEntity jobEntity24 = null;
        executionEntity17.removeJob(jobEntity24);
        java.lang.String str26 = executionEntity17.getEventName();
        java.lang.String str27 = executionEntity17.getActivityId();
        java.lang.String str28 = executionEntity17.getSuperExecutionId();
        executionEntity1.setSuperExecution(executionEntity17);
        java.lang.String str30 = executionEntity1.toString();
        // The following exception was thrown during execution in test generation
        try {
            executionEntity1.removeVariableLocal("Execution[null]");
            org.junit.Assert.fail("Expected exception of type org.activiti.engine.ActivitiException; message: lazy loading outside command context");
        } catch (org.activiti.engine.ActivitiException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pvmProcessElement11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ProcessInstance[null]" + "'", str30, "ProcessInstance[null]");
    }
}

