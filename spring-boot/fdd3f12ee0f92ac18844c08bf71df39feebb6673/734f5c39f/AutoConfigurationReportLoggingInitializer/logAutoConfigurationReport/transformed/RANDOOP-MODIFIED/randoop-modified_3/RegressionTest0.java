import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer$AutoConfigurationReportListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.springframework.core.Ordered.LOWEST_PRECEDENCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = autoConfigurationReportLoggingInitializer0.orderByName(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder3 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder3, "hi!", conditionAndOutcomes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder4 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder4, "hi!", conditionAndOutcomes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder3 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder3, "hi!", conditionAndOutcomes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder2 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder2, "", conditionAndOutcomes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder4 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = autoConfigurationReportListener3.supportsEventType(resolvableType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = autoConfigurationReportListener1.supportsEventType(resolvableType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder3 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder3 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder2 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.springframework.core.Ordered.HIGHEST_PRECEDENCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = autoConfigurationReportLoggingInitializer0.orderByName(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder2 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder2, "", conditionAndOutcomes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportListener2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = autoConfigurationReportLoggingInitializer0.orderByName(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = autoConfigurationReportLoggingInitializer0.orderByName(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportListener4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder2 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder2, "hi!", conditionAndOutcomes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener4.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = autoConfigurationReportListener10.supportsEventType(resolvableType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = autoConfigurationReportLoggingInitializer0.orderByName(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener4.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int2 = autoConfigurationReportListener1.getOrder();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = autoConfigurationReportListener1.supportsEventType(resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass4 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder3 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder3, "hi!", conditionAndOutcomes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = autoConfigurationReportListener2.supportsEventType(resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent7);
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener4.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = autoConfigurationReportLoggingInitializer0.orderByName(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener4.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportListener8.onApplicationEvent(applicationEvent9);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportListener8.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener4.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder4 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder4, "", conditionAndOutcomes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder4 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder4, "", conditionAndOutcomes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = autoConfigurationReportListener10.supportsEventType(resolvableType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.StringBuilder stringBuilder4 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder4, "", conditionAndOutcomes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = conditionEvaluationReport3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportListener7.onApplicationEvent(applicationEvent8);
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener7.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener6.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = configurableApplicationContext4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = autoConfigurationReportLoggingInitializer0.orderByName(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int6 = autoConfigurationReportListener5.getOrder();
        int int7 = autoConfigurationReportListener5.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.Class<?> wildcardClass12 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "hi!", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass4 = autoConfigurationReportListener3.getClass();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder3 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder3, "", conditionAndOutcomes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        int int7 = autoConfigurationReportListener4.getOrder();
        org.springframework.core.ResolvableType resolvableType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = autoConfigurationReportListener4.supportsEventType(resolvableType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportListener6.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = autoConfigurationReportListener11.supportsEventType(resolvableType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportListener10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport2);
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int3 = autoConfigurationReportListener2.getOrder();
        int int4 = autoConfigurationReportListener2.getOrder();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener2.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = autoConfigurationReportListener2.supportsEventType(resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder13 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        int int7 = autoConfigurationReportListener4.getOrder();
        int int8 = autoConfigurationReportListener4.getOrder();
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener4.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportListener2.onApplicationEvent(applicationEvent3);
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener2.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        int int7 = autoConfigurationReportListener4.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent8);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = autoConfigurationReportListener10.supportsEventType(resolvableType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = autoConfigurationReportLoggingInitializer0.orderByName(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent7);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportListener4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = autoConfigurationReportLoggingInitializer0.orderByName(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "hi!", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder4 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder4, "hi!", conditionAndOutcomes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder13 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        java.lang.Class<?> wildcardClass4 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "hi!", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener5.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = autoConfigurationReportLoggingInitializer0.orderByName(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportListener3.onApplicationEvent(applicationEvent4);
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener3.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener5.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener6.onApplicationEvent(applicationEvent7);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass4 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass3 = autoConfigurationReportListener2.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener5.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "hi!", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int6 = autoConfigurationReportListener5.getOrder();
        int int7 = autoConfigurationReportListener5.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = autoConfigurationReportListener5.supportsEventType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        int int6 = autoConfigurationReportListener4.getOrder();
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportListener4.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder15 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "hi!", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        java.lang.Class<?> wildcardClass11 = log10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder4 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass4 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener9.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportListener9.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder12 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes14 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder12, "", conditionAndOutcomes14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportListener5.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder15 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder13 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent7);
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener4.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport2);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener9.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener4.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportListener13.onApplicationEvent(applicationEvent14);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int8 = autoConfigurationReportListener7.getOrder();
        int int9 = autoConfigurationReportListener7.getOrder();
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener7.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = configurableApplicationContext8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = autoConfigurationReportLoggingInitializer0.orderByName(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = configurableApplicationContext2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int7 = autoConfigurationReportListener6.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportListener6.onApplicationEvent(applicationEvent8);
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener6.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = autoConfigurationReportLoggingInitializer0.orderByName(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent7);
        int int9 = autoConfigurationReportListener4.getOrder();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int11 = autoConfigurationReportListener10.getOrder();
        int int12 = autoConfigurationReportListener10.getOrder();
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportListener10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = conditionEvaluationReport8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener8.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.Class<?> wildcardClass15 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener4.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        int int6 = autoConfigurationReportListener4.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener4.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        java.lang.Class<?> wildcardClass14 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder13 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportListener9.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = conditionEvaluationReport4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportListener10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "hi!", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int8 = autoConfigurationReportListener7.getOrder();
        int int9 = autoConfigurationReportListener7.getOrder();
        int int10 = autoConfigurationReportListener7.getOrder();
        org.springframework.core.ResolvableType resolvableType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = autoConfigurationReportListener7.supportsEventType(resolvableType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportListener9.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder13 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder13, "", conditionAndOutcomes15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = autoConfigurationReportLoggingInitializer0.orderByName(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int6 = autoConfigurationReportListener5.getOrder();
        int int7 = autoConfigurationReportListener5.getOrder();
        org.springframework.core.ResolvableType resolvableType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = autoConfigurationReportListener5.supportsEventType(resolvableType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportListener5.onApplicationEvent(applicationEvent6);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "hi!", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        java.lang.StringBuilder stringBuilder5 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder5, "hi!", conditionAndOutcomes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = configurableApplicationContext5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int4 = autoConfigurationReportListener3.getOrder();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener3.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = autoConfigurationReportListener9.supportsEventType(resolvableType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "hi!", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener4.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "hi!", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener4.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder6 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder6, "", conditionAndOutcomes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass9 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int8 = autoConfigurationReportListener7.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportListener7.onApplicationEvent(applicationEvent9);
        org.springframework.core.ResolvableType resolvableType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = autoConfigurationReportListener7.supportsEventType(resolvableType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int7 = autoConfigurationReportListener6.getOrder();
        org.springframework.core.ResolvableType resolvableType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = autoConfigurationReportListener6.supportsEventType(resolvableType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener8.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = autoConfigurationReportListener4.supportsEventType(resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass16 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        int int6 = autoConfigurationReportListener4.getOrder();
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener4.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder14 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes16 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder14, "hi!", conditionAndOutcomes16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent5);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder13 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder13, "hi!", conditionAndOutcomes15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = autoConfigurationReportListener11.supportsEventType(resolvableType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportListener7.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = autoConfigurationReportLoggingInitializer0.orderByName(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes14 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder12, "hi!", conditionAndOutcomes14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder8 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportListener7.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = autoConfigurationReportLoggingInitializer0.orderByName(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        java.lang.Class<?> wildcardClass14 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportListener7.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        java.lang.Class<?> wildcardClass7 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass14 = log13.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.StringBuilder stringBuilder8 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder8, "hi!", conditionAndOutcomes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        int int6 = autoConfigurationReportListener4.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = conditionEvaluationReport1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        java.lang.StringBuilder stringBuilder10 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder10, "hi!", conditionAndOutcomes12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass13 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap17 = autoConfigurationReportLoggingInitializer0.orderByName(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportListener9.onApplicationEvent(applicationEvent10);
        org.springframework.core.ResolvableType resolvableType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = autoConfigurationReportListener9.supportsEventType(resolvableType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        java.lang.StringBuilder stringBuilder7 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder7, "hi!", conditionAndOutcomes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass12 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = configurableApplicationContext11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap8 = autoConfigurationReportLoggingInitializer0.orderByName(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.Class<?> wildcardClass10 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportListener5.onApplicationEvent(applicationEvent6);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportListener5.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap16 = autoConfigurationReportLoggingInitializer0.orderByName(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes14 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder12, "", conditionAndOutcomes14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int5 = autoConfigurationReportListener4.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportListener4.onApplicationEvent(applicationEvent6);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = autoConfigurationReportLoggingInitializer0.orderByName(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.core.ResolvableType resolvableType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = autoConfigurationReportListener8.supportsEventType(resolvableType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = autoConfigurationReportLoggingInitializer0.orderByName(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = autoConfigurationReportLoggingInitializer0.orderByName(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder14 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.StringBuilder stringBuilder3 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder3, "hi!", conditionAndOutcomes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int6 = autoConfigurationReportListener5.getOrder();
        org.springframework.core.ResolvableType resolvableType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = autoConfigurationReportListener5.supportsEventType(resolvableType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass5 = autoConfigurationReportListener4.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder4 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap7 = autoConfigurationReportLoggingInitializer0.orderByName(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(configurableApplicationContext2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportListener6.onApplicationEvent(applicationEvent7);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = configurableApplicationContext8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportListener3.onApplicationEvent(applicationEvent4);
        java.lang.Class<?> wildcardClass6 = autoConfigurationReportListener3.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap5 = autoConfigurationReportLoggingInitializer0.orderByName(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.Class<?> wildcardClass12 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(conditionEvaluationReport10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int7 = autoConfigurationReportListener6.getOrder();
        org.springframework.core.ResolvableType resolvableType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = autoConfigurationReportListener6.supportsEventType(resolvableType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }
}

