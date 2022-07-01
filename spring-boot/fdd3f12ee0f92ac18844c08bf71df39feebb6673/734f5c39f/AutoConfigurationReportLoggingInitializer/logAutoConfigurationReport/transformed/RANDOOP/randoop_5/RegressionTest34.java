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
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent1);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport3 = null;
        autoConfigurationReportLoggingInitializer0.report = conditionEvaluationReport3;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport5 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport5);
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport7 = autoConfigurationReportLoggingInitializer0.report;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport8 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        org.apache.commons.logging.Log log11 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.context.ApplicationEvent applicationEvent12 = null;
        autoConfigurationReportLoggingInitializer0.onApplicationEvent(applicationEvent12);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext14 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport15 = null;
        autoConfigurationReportLoggingInitializer0.setreport(conditionEvaluationReport15);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext17 = null;
        autoConfigurationReportLoggingInitializer0.applicationContext = configurableApplicationContext17;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener19 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoConfigurationReportLoggingInitializer0.initialize(configurableApplicationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(conditionEvaluationReport7);
        org.junit.Assert.assertNull(conditionEvaluationReport8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(configurableApplicationContext14);
    }
}

