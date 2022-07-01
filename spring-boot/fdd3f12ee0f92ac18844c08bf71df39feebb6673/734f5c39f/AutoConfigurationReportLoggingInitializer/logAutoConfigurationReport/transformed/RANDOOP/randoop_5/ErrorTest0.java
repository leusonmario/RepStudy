import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.apache.commons.logging.Log log2 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener3 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.apache.commons.logging.Log log1 = autoConfigurationReportLoggingInitializer0.logger;
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.getreport();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(false);
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext5 = autoConfigurationReportLoggingInitializer0.applicationContext;
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext6 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener1 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer.AutoConfigurationReportListener autoConfigurationReportListener2 = autoConfigurationReportLoggingInitializer0.new AutoConfigurationReportListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer();
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext1 = autoConfigurationReportLoggingInitializer0.getapplicationContext();
        org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport conditionEvaluationReport2 = autoConfigurationReportLoggingInitializer0.report;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        autoConfigurationReportLoggingInitializer0.logAutoConfigurationReport();
    }
}

