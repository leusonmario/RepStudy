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
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = null; // flaky: org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
// flaky:         logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = false; // flaky: logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = null; // flaky: logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = null; // flaky: logger2.getLoggerRepository();
        org.apache.log4j.Priority priority9 = null; // flaky: logger2.getChainedPriority();
        org.apache.log4j.Priority priority10 = null;
// flaky:         logger2.setPriority(priority10);
        org.apache.log4j.Level level12 = null; // flaky: logger2.getLevel();
        java.util.ResourceBundle resourceBundle13 = null;
// flaky:         logger2.setResourceBundle(resourceBundle13);
        org.apache.log4j.Level level15 = null; // flaky: logger2.getPriority();
// flaky:         logger2.removeAllAppenders();
// flaky:         org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(enumeration7);
// flaky:         org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNull(priority9);
        org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNull(level15);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        category13.setAdditivity(false);
        java.util.ResourceBundle resourceBundle16 = null;
        category13.setResourceBundle(resourceBundle16);
        org.apache.log4j.Level level18 = category13.getEffectiveLevel();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(category13);
// flaky:         org.junit.Assert.assertNull(level18);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
// flaky:         logger1.callAppenders(loggingEvent2);
        java.lang.Class<?> wildcardClass4 = null; // flaky: logger1.getClass();
        org.apache.log4j.Category category5 = null; // flaky: org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger6 = null; // flaky: org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Appender appender8 = null; // flaky: logger6.getAppender("root");
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = null; // flaky: logger6.getHierarchy();
// flaky:         org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(category5);
// flaky:         org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNull(appender8);
// flaky:         org.junit.Assert.assertNotNull(loggerRepository9);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = null; // flaky: logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
// flaky:         logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = null; // flaky: logger1.getParent();
        boolean boolean7 = false; // flaky: logger1.isTraceEnabled();
        java.util.Enumeration enumeration8 = null; // flaky: logger1.getAllAppenders();
        org.apache.log4j.Category category9 = null; // flaky: logger1.getParent();
        org.apache.log4j.Level level10 = null; // flaky: logger1.getLevel();
// flaky:         org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
// flaky:         org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(enumeration8);
// flaky:         org.junit.Assert.assertNotNull(category9);
// flaky:         org.junit.Assert.assertNotNull(level10);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl15.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl15.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = slangImpl15.score;
        io.cloudslang.score.api.Score score25 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl15.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        org.apache.log4j.Level level3 = category1.getLevel();
        category1.setAdditivity(true);
        org.apache.log4j.Appender appender6 = null;
        category1.addAppender(appender6);
        org.apache.log4j.Appender appender9 = category1.getAppender("io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(category1);
// flaky:         org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNull(appender9);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass4 = strSet3.getClass();
        org.apache.log4j.Category category5 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Category category7 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Level level8 = category7.getLevel();
        java.util.Enumeration enumeration9 = category7.getAllAppenders();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(category7);
// flaky:         org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertNotNull(enumeration9);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        java.util.Set<java.lang.String> strSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = null; // flaky: org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
// flaky:         logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = false; // flaky: logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = null; // flaky: logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = null; // flaky: logger2.getLoggerRepository();
        org.apache.log4j.Priority priority9 = null; // flaky: logger2.getChainedPriority();
// flaky:         logger2.setAdditivity(false);
        org.apache.log4j.spi.LoggerFactory loggerFactory13 = null;
        org.apache.log4j.Logger logger14 = null; // flaky: org.apache.log4j.Logger.getLogger("", loggerFactory13);
        java.util.ResourceBundle resourceBundle15 = null;
// flaky:         logger14.setResourceBundle(resourceBundle15);
        org.apache.log4j.Appender appender17 = null;
        boolean boolean18 = false; // flaky: logger14.isAttached(appender17);
        java.util.Enumeration enumeration19 = null; // flaky: logger14.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository20 = null; // flaky: logger14.getLoggerRepository();
        org.apache.log4j.Level level21 = null; // flaky: logger14.getLevel();
        java.lang.String str22 = null; // flaky: logger14.getName();
        // The following exception was thrown during execution in test generation
        try {
            logger2.trace((java.lang.Object) logger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(enumeration7);
// flaky:         org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNull(priority9);
// flaky:         org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(enumeration19);
// flaky:         org.junit.Assert.assertNotNull(loggerRepository20);
        org.junit.Assert.assertNull(level21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = null; // flaky: org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        org.apache.log4j.Category category3 = null; // flaky: logger2.getParent();
        org.apache.log4j.Level level4 = null; // flaky: logger2.getEffectiveLevel();
        org.apache.log4j.Level level5 = null;
// flaky:         logger2.setLevel(level5);
        boolean boolean7 = false; // flaky: logger2.getAdditivity();
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
        org.apache.log4j.Appender appender9 = null;
// flaky:         logger2.removeAppender(appender9);
// flaky:         org.junit.Assert.assertNotNull(logger2);
// flaky:         org.junit.Assert.assertNotNull(category3);
        org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        org.apache.log4j.Appender appender5 = logger1.getAppender("org.apache.log4j.Level");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNull(appender5);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl18.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet23 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl18.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl18.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet28);
    }
}
