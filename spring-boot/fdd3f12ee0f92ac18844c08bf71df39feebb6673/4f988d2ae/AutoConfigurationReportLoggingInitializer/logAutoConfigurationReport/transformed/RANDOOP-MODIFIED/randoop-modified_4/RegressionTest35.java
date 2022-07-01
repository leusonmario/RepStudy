import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder18 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder13 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder13, "", conditionAndOutcomes15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.lang.StringBuilder stringBuilder9 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder9, "", conditionAndOutcomes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport20 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport20;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport19);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportListener8.onApplicationEvent(applicationEvent9);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.getreport();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder18 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(conditionEvaluationReport16);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport19);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener21 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext22 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext22;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener24 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext25 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext25);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap12 = autoConfigurationReportLoggingInitializer0.orderByName(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent20 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent20);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        java.lang.StringBuilder stringBuilder14 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes16 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder14, "hi!", conditionAndOutcomes16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportListener14.onApplicationEvent(applicationEvent15);
        int int17 = autoConfigurationReportListener14.getOrder();
        int int18 = autoConfigurationReportListener14.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext17);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = autoConfigurationReportLoggingInitializer0.getreport();
        java.lang.Class<?> wildcardClass20 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = autoConfigurationReportLoggingInitializer0.orderByName(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int14 = autoConfigurationReportListener13.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
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
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent19);
        org.springframework.context.ApplicationEvent applicationEvent21 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent21);
        org.springframework.context.ApplicationEvent applicationEvent23 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent23);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap10);
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
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport19);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext21 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext21;
        org.apache.commons.logging.Log log23 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log24 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder11, "", conditionAndOutcomes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext16;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext19;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport21;
        java.lang.Class<?> wildcardClass23 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass11 = autoConfigurationReportListener10.getClass();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent3);
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder16 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes18 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder16, "", conditionAndOutcomes18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
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
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportListener13.onApplicationEvent(applicationEvent14);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
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
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent17 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent17);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext13);
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport19;
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext13);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int16 = autoConfigurationReportListener15.getOrder();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport2;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        java.lang.StringBuilder stringBuilder20 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes22 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder20, "hi!", conditionAndOutcomes22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport11);
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext17);
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        java.lang.StringBuilder stringBuilder18 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes20 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder18, "hi!", conditionAndOutcomes20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport13);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNull(configurableApplicationContext15);
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = configurableApplicationContext14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(configurableApplicationContext20);
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext3);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent13 = null;
        autoConfigurationReportListener12.onApplicationEvent(applicationEvent13);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport2;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = conditionEvaluationReport10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        java.lang.StringBuilder stringBuilder20 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes22 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder20, "hi!", conditionAndOutcomes22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext15);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport7);
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext15);
        org.junit.Assert.assertNull(configurableApplicationContext18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext19;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext9;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int12 = autoConfigurationReportListener11.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.junit.Assert.assertNull(configurableApplicationContext1);
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int13 = autoConfigurationReportListener12.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport13;
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent7 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent7);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent5 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log8 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener12 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int9 = autoConfigurationReportListener8.getOrder();
        int int10 = autoConfigurationReportListener8.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext16);
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        int int10 = autoConfigurationReportListener9.getOrder();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder16 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        java.lang.Class<?> wildcardClass8 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext19;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport21 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent22 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent22);
        org.springframework.context.ApplicationEvent applicationEvent24 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent24);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext26 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(conditionEvaluationReport21);
        org.junit.Assert.assertNull(configurableApplicationContext26);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport2;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass16 = autoConfigurationReportLoggingInitializer0.getClass();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log15 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport16 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport16;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport18);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder12 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent9 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent9);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport13 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(conditionEvaluationReport13);
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport3);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext8);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext9);
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport2;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log9 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext10);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext14);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener17 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(configurableApplicationContext16);
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext15 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log10 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        java.lang.Class<?> wildcardClass17 = autoConfigurationReportListener16.getClass();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext9);
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport4;
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener9 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext12);
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport7;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.logger;
        org.junit.Assert.assertNull(configurableApplicationContext5);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
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
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext2 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport4);
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport5;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext7);
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log14 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext16 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext16);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent19 = null;
        autoConfigurationReportListener18.onApplicationEvent(applicationEvent19);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext12);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext4;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener8 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport10;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext12);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNull(conditionEvaluationReport9);
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext3;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent11);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext13;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.apache.commons.logging.Log log17 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log18 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport10);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext13 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener14 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport15;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport19 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport19);
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext10);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(configurableApplicationContext13);
        org.junit.Assert.assertNull(configurableApplicationContext17);
        org.junit.Assert.assertNull(configurableApplicationContext18);
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport10 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport10);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener15 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext18;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext23 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext23;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport25 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport26 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(conditionEvaluationReport12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(conditionEvaluationReport22);
        org.junit.Assert.assertNull(conditionEvaluationReport25);
        org.junit.Assert.assertNull(conditionEvaluationReport26);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ApplicationEvent applicationEvent4 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent4);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport8);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent15 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent15);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport18 = autoConfigurationReportLoggingInitializer0.report;
        java.lang.StringBuilder stringBuilder19 = null;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes21 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.addLogMessage(stringBuilder19, "", conditionAndOutcomes21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(conditionEvaluationReport14);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
        org.junit.Assert.assertNull(conditionEvaluationReport18);
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext8;
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(configurableApplicationContext5);
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext11);
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(configurableApplicationContext6);
        org.junit.Assert.assertNull(configurableApplicationContext10);
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log6 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ApplicationEvent applicationEvent8 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent8);
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport14;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener16 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(conditionEvaluationReport7);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport9 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport9;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport11);
        org.apache.commons.logging.Log log13 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext19 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.apache.commons.logging.Log log20 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log21 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport22 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport22);
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(configurableApplicationContext14);
        org.junit.Assert.assertNull(conditionEvaluationReport15);
        org.junit.Assert.assertNull(configurableApplicationContext19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener5 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener6 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext7 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext7);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap14 = autoConfigurationReportLoggingInitializer0.orderByName(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNull(conditionEvaluationReport11);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ApplicationEvent applicationEvent10 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent10);
        org.apache.commons.logging.Log log12 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport6;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent2 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent2);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport4 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext11 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport12;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.apache.commons.logging.Log log16 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport17 = autoConfigurationReportLoggingInitializer0.getreport();
        org.junit.Assert.assertNull(conditionEvaluationReport1);
        org.junit.Assert.assertNull(conditionEvaluationReport4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext11);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(conditionEvaluationReport17);
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext5;
        org.apache.commons.logging.Log log7 = autoConfigurationReportLoggingInitializer0.logger;
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener11 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport1);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext3 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext6;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport8;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext10 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext10;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport12 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport12);
        org.springframework.context.ApplicationEvent applicationEvent14 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent14);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext18 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext18);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.junit.Assert.assertNull(configurableApplicationContext3);
        org.junit.Assert.assertNull(configurableApplicationContext4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(configurableApplicationContext20);
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        org.apache.commons.logging.Log log3 = autoConfigurationReportLoggingInitializer0.logger;
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener7 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNull(conditionEvaluationReport2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(configurableApplicationContext8);
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener4 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log5 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport6 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport6);
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        java.util.Map<java.lang.String, org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport.ConditionAndOutcomes> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder11 = autoConfigurationReportLoggingInitializer0.getLogMessage(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(configurableApplicationContext1);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport1 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport1;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext4 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext4);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext6);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext8 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext9 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener10 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport11 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport11;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener13 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport14 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport14);
        org.springframework.context.ApplicationEvent applicationEvent16 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent16);
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener18 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log19 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = null;
        autoConfigurationReportLoggingInitializer0.setapplicationContext(configurableApplicationContext20);
        org.junit.Assert.assertNull(conditionEvaluationReport3);
        org.junit.Assert.assertNull(configurableApplicationContext8);
        org.junit.Assert.assertNull(configurableApplicationContext9);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log4 = autoConfigurationReportLoggingInitializer0.getlogger();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = autoConfigurationReportLoggingInitializer0.getreport();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent6);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(conditionEvaluationReport5);
    }
}

