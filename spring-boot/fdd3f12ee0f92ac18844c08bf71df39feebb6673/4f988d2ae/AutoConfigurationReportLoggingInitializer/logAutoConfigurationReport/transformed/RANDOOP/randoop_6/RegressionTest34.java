import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportListener14.onApplicationEvent(applicationEvent15);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        java.lang.StringBuilder stringBuilder19 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder19, "hi!", conditionAndOutcomes21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext20);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport23 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport19);
        org.junit.Assert.assertNull(conditionEvaluationReport22);
        org.junit.Assert.assertNull(conditionEvaluationReport23);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext20);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
        org.junit.Assert.assertNull(configurableApplicationContext22);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
        org.junit.Assert.assertNull(conditionEvaluationReport19);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder16 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport21;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport24 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport24;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext26 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext26);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNull(configurableApplicationContext23);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap19 = autoConfigurationReportLoggingInitializer0.orderByName(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = autoConfigurationReportLoggingInitializer0.orderByName(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.lang.Class<?> wildcardClass16 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder22 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes24 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder22, "hi!", conditionAndOutcomes24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(configurableApplicationContext21);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder19 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.springframework.context.ApplicationEvent applicationEvent20 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent20);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log23 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext24 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(conditionEvaluationReport22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(configurableApplicationContext24);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(configurableApplicationContext18);
        org.junit.Assert.assertNull(conditionEvaluationReport19);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext17);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport21;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport23 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport24 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent25 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent25);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport27 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport27;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext29 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext29);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport31 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNull(conditionEvaluationReport23);
        org.junit.Assert.assertNull(conditionEvaluationReport24);
        org.junit.Assert.assertNull(conditionEvaluationReport31);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport18);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener20 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener21 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int22 = autoConfigurationReportListener21.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = autoConfigurationReportLoggingInitializer0.orderByName(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport21);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(conditionEvaluationReport20);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.lang.StringBuilder stringBuilder22 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes24 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder22, "hi!", conditionAndOutcomes24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext21);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder18 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes20 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder18, "", conditionAndOutcomes20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap18 = autoConfigurationReportLoggingInitializer0.orderByName(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent19);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNull(conditionEvaluationReport22);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener19 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportListener13.onApplicationEvent(applicationEvent14);
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportListener13.onApplicationEvent(applicationEvent16);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.context.ApplicationEvent applicationEvent18 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent18);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent21 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent21);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(configurableApplicationContext20);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent19);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log22 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNotNull(log22);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext22);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.StringBuilder stringBuilder26 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes28 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder26, "", conditionAndOutcomes28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNull(configurableApplicationContext21);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext2;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
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
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(configurableApplicationContext21);
        org.junit.Assert.assertNull(configurableApplicationContext22);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent19);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener21 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport22);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
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
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent18 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent18);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent25 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent25);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder28 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext18);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNull(configurableApplicationContext22);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener24 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext27);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport29 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext30 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext30;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext32 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(conditionEvaluationReport29);
        org.junit.Assert.assertNull(configurableApplicationContext32);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent22 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent22);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext24 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport25 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport25;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener27 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport28 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport28);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNull(configurableApplicationContext24);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport20);
        org.springframework.context.ApplicationEvent applicationEvent22 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent22);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder25 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = configurableApplicationContext16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent18 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent18);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(configurableApplicationContext17);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport20);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport22);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        java.lang.Class<?> wildcardClass16 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport18);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport20);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext22);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport24 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext25);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(conditionEvaluationReport24);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        org.springframework.context.ApplicationEvent applicationEvent21 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent21);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext24 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(configurableApplicationContext23);
        org.junit.Assert.assertNull(configurableApplicationContext24);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent20 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent20);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(configurableApplicationContext19);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder13 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log24 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext25);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext27 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext27);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(conditionEvaluationReport20);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext21);
        org.apache.commons.logging.Log log23 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(conditionEvaluationReport20);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int17 = autoConfigurationReportListener16.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass14 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int11 = autoConfigurationReportListener10.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportListener10.onApplicationEvent(applicationEvent12);
        int int14 = autoConfigurationReportListener10.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap19 = autoConfigurationReportLoggingInitializer0.orderByName(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap20 = autoConfigurationReportLoggingInitializer0.orderByName(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport17);
        java.lang.Class<?> wildcardClass19 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNull(configurableApplicationContext17);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.Class<?> wildcardClass11 = log10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext21;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport20);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        java.lang.StringBuilder stringBuilder18 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes20 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder18, "", conditionAndOutcomes20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = autoConfigurationReportLoggingInitializer0.orderByName(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext16);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
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
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log22 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext23;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext25;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport27 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport27);
        org.springframework.context.ApplicationEvent applicationEvent29 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent29);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNotNull(log22);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport20);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
        org.junit.Assert.assertNull(configurableApplicationContext17);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext16);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport21;
        org.springframework.context.ApplicationEvent applicationEvent23 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent23);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(conditionEvaluationReport20);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int16 = autoConfigurationReportListener15.getOrder();
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportListener15.onApplicationEvent(applicationEvent17);
        int int19 = autoConfigurationReportListener15.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.getreport();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = conditionEvaluationReport18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder17 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes19 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder17, "", conditionAndOutcomes19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport17;
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent19);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext19);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener23 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder25 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport13);
        org.junit.Assert.assertNull(configurableApplicationContext18);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNull(configurableApplicationContext22);
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder19 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport18;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext23);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport25 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport25;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport27 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport28 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport29 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder31 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(configurableApplicationContext22);
        org.junit.Assert.assertNull(conditionEvaluationReport27);
        org.junit.Assert.assertNull(conditionEvaluationReport28);
        org.junit.Assert.assertNull(conditionEvaluationReport29);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext20);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport23 = autoConfigurationReportLoggingInitializer0.report;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap25 = autoConfigurationReportLoggingInitializer0.orderByName(strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport19);
        org.junit.Assert.assertNull(conditionEvaluationReport22);
        org.junit.Assert.assertNull(conditionEvaluationReport23);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport21;
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext16;
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext19;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }
}

