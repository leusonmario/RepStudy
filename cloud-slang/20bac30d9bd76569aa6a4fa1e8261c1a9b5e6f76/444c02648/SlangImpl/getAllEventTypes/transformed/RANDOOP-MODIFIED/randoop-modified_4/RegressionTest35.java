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
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        org.apache.log4j.Appender appender3 = null;
        boolean boolean4 = category0.isAttached(appender3);
        org.apache.log4j.Level level5 = category0.getPriority();
        java.lang.String str6 = category0.getName();
        org.apache.log4j.Level level7 = category0.getEffectiveLevel();
        category0.removeAppender("");
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "root" + "'", str6, "root");
// flaky:         org.junit.Assert.assertNull(level7);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass8);
        boolean boolean10 = logger9.getAdditivity();
        // The following exception was thrown during execution in test generation
        try {
            logger9.assertLog(false, "org.apache.log4j.Level");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl7.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl7.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl7.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl7.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl7.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl7.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl7.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = null;
        slangImpl7.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl7.eventBus = eventBus24;
        java.util.Set<java.lang.String> strSet26 = slangImpl7.getAllEventTypes();
        java.lang.Throwable throwable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.error((java.lang.Object) slangImpl7, throwable27);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass16);
        java.util.ResourceBundle resourceBundle18 = category17.getResourceBundle();
        org.apache.log4j.Appender appender20 = category17.getAppender("org.apache.log4j.spi.RootLogger");
        category17.removeAppender("hi!");
        org.apache.log4j.Level level23 = category17.getLevel();
        org.apache.log4j.spi.LoggerRepository loggerRepository24 = category17.getHierarchy();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNull(resourceBundle18);
        org.junit.Assert.assertNull(appender20);
        org.junit.Assert.assertNull(level23);
        org.junit.Assert.assertNotNull(loggerRepository24);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        org.apache.log4j.Level level3 = category0.getEffectiveLevel();
        java.lang.String str4 = category0.getName();
        java.lang.Class<?> wildcardClass5 = category0.getClass();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass5);
        io.cloudslang.lang.api.SlangImpl.logger = logger6;
        java.util.ResourceBundle resourceBundle8 = null;
        logger6.setResourceBundle(resourceBundle8);
        org.junit.Assert.assertNotNull(category0);
// flaky:         org.junit.Assert.assertNull(level3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "root" + "'", str4, "root");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(logger6);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = category1.getLoggerRepository();
        org.apache.log4j.Category category7 = category1.getParent();
        java.util.ResourceBundle resourceBundle8 = null;
        category7.setResourceBundle(resourceBundle8);
        org.apache.log4j.Level level10 = category7.getPriority();
        category7.assertLog(true, "io.cloudslang.lang.api.SlangImpl");
        category7.removeAllAppenders();
        org.apache.log4j.spi.LoggerFactory loggerFactory16 = null;
        org.apache.log4j.Logger logger17 = null; // flaky: org.apache.log4j.Logger.getLogger("root", loggerFactory16);
// flaky:         logger17.setAdditivity(true);
        org.apache.log4j.Level level20 = null; // flaky: logger17.getEffectiveLevel();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = category7.isEnabledFor((org.apache.log4j.Priority) level20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(category7);
// flaky:         org.junit.Assert.assertNull(level10);
// flaky:         org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNull(level20);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("io.cloudslang.lang.api.SlangImpl", loggerFactory1);
        org.apache.log4j.spi.LoggingEvent loggingEvent3 = null;
        logger2.callAppenders(loggingEvent3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = logger2.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangSource slangSource19 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray20 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet21 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet21, slangSourceArray20);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact23 = slangImpl0.compile(slangSource19, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = logger1.getAppender("root");
        java.util.ResourceBundle resourceBundle8 = null;
        logger1.setResourceBundle(resourceBundle8);
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = logger1.getHierarchy();
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(priority4);
        org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(loggerRepository10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
        logger8.callAppenders(loggingEvent9);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        boolean boolean21 = logger20.getAdditivity();
        io.cloudslang.lang.api.SlangImpl.logger = logger20;
        org.apache.log4j.Appender appender23 = null;
        boolean boolean24 = logger20.isAttached(appender23);
        java.util.ResourceBundle resourceBundle25 = null;
        logger20.setResourceBundle(resourceBundle25);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = null; // flaky: org.apache.log4j.Logger.getLogger("root", loggerFactory1);
// flaky:         logger2.assertLog(true, "hi!");
        java.util.ResourceBundle resourceBundle6 = null; // flaky: logger2.getResourceBundle();
// flaky:         logger2.removeAppender("io.cloudslang.lang.api.SlangImpl");
// flaky:         logger2.removeAllAppenders();
        org.apache.log4j.spi.LoggerFactory loggerFactory11 = null;
        org.apache.log4j.Logger logger12 = null; // flaky: org.apache.log4j.Logger.getLogger("root", loggerFactory11);
        org.apache.log4j.Appender appender13 = null;
// flaky:         logger12.removeAppender(appender13);
        org.apache.log4j.Appender appender15 = null;
// flaky:         logger12.removeAppender(appender15);
        org.apache.log4j.Level level17 = null; // flaky: logger12.getEffectiveLevel();
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger2.fatal((java.lang.Object) logger12, throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(resourceBundle6);
// flaky:         org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNull(level17);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
        logger1.callAppenders(loggingEvent5);
        logger1.setAdditivity(true);
        java.util.Enumeration enumeration9 = logger1.getAllAppenders();
        boolean boolean10 = logger1.getAdditivity();
        org.apache.log4j.Level level11 = logger1.getLevel();
        org.apache.log4j.Level level12 = logger1.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl13.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl13.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl13.score = score21;
        java.lang.Class<?> wildcardClass23 = slangImpl13.getClass();
        org.apache.log4j.Category category24 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass23);
        org.apache.log4j.Level level25 = category24.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            logger1.warn((java.lang.Object) level25);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(enumeration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(level11);
// flaky:         org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(category24);
        org.junit.Assert.assertNull(level25);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Appender appender18 = null;
        boolean boolean19 = category17.isAttached(appender18);
        org.apache.log4j.Appender appender21 = category17.getAppender("org.apache.log4j.spi.RootLogger");
        java.lang.Class<?> wildcardClass22 = category17.getClass();
        org.apache.log4j.Category category23 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass22);
        org.apache.log4j.Category category24 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass22);
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(appender21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(category23);
        org.junit.Assert.assertNotNull(category24);
        org.junit.Assert.assertNotNull(logger25);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener28 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl29 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl29.score = score30;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl29.score = score32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl29.compiler = slangCompiler34;
        io.cloudslang.score.events.EventBus eventBus36 = null;
        slangImpl29.eventBus = eventBus36;
        io.cloudslang.score.api.Score score38 = slangImpl29.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl29.compiler;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl29.score = score40;
        java.util.Set<java.lang.String> strSet42 = slangImpl29.getAllEventTypes();
        java.util.Set<java.lang.String> strSet43 = slangImpl29.getAllEventTypes();
        java.util.Set<java.lang.String> strSet44 = slangImpl29.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler45 = slangImpl29.compiler;
        java.util.Set<java.lang.String> strSet46 = slangImpl29.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener28, strSet46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(slangCompiler45);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        java.lang.String str5 = logger1.getName();
        org.apache.log4j.Category category6 = logger1.getParent();
        category6.removeAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = category6.getHierarchy();
        java.lang.Class<?> wildcardClass9 = loggerRepository8.getClass();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(priority4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        io.cloudslang.lang.api.SlangImpl.logger = logger20;
        logger20.removeAppender("org.apache.log4j.Logger");
        java.util.Enumeration enumeration24 = logger20.getAllAppenders();
        boolean boolean25 = logger20.getAdditivity();
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger20.warn(obj26);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
// flaky:         org.junit.Assert.assertNull(enumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
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
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangSource slangSource10 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray11 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet12 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet12, slangSourceArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact14 = slangImpl0.compile(slangSource10, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl22.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl22.compiler = slangCompiler24;
        java.util.Set<java.lang.String> strSet26 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.api.Score score27 = slangImpl22.score;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl22.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl22.eventBus;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl22.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl22.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl22.compiler = slangCompiler32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl22.score = score34;
        io.cloudslang.score.api.Score score36 = slangImpl22.score;
        java.util.Set<java.lang.String> strSet37 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender4 = logger1.getAppender("org.apache.log4j.Level");
        java.util.ResourceBundle resourceBundle5 = null;
        logger1.setResourceBundle(resourceBundle5);
        org.apache.log4j.Priority priority7 = logger1.getChainedPriority();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.apache.log4j.Category category9 = category8.getParent();
        org.apache.log4j.Appender appender10 = null;
        // The following exception was thrown during execution in test generation
        try {
            category9.removeAppender(appender10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender4);
// flaky:         org.junit.Assert.assertNull(priority7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNull(category9);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass22 = strSet21.getClass();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.apache.log4j.Category category24 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(category24);
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
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
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        org.apache.log4j.Appender appender18 = null;
        category17.removeAppender(appender18);
        org.apache.log4j.Level level20 = category17.getPriority();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNull(level20);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("hi!");
        org.apache.log4j.Category category6 = logger1.getParent();
        java.util.Enumeration enumeration7 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        java.lang.Class<?> wildcardClass9 = logger1.getClass();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.spi.LoggerFactory loggerFactory13 = null;
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory13);
        logger14.removeAllAppenders();
        java.util.ResourceBundle resourceBundle16 = logger14.getResourceBundle();
        java.lang.String str17 = logger14.getName();
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            category11.error((java.lang.Object) str17, throwable18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNull(resourceBundle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.log4j.Logger" + "'", str17, "org.apache.log4j.Logger");
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getLoggerRepository();
        org.apache.log4j.Priority priority9 = logger2.getChainedPriority();
        org.apache.log4j.Priority priority10 = null;
        logger2.setPriority(priority10);
        org.apache.log4j.Appender appender12 = null;
        boolean boolean13 = logger2.isAttached(appender12);
        org.apache.log4j.spi.LoggingEvent loggingEvent14 = null;
        logger2.callAppenders(loggingEvent14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = logger2.isInfoEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
// flaky:         org.junit.Assert.assertNull(priority9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
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
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        java.lang.String str16 = logger15.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository17 = logger15.getLoggerRepository();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "io.cloudslang.lang.api.SlangImpl" + "'", str16, "io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(loggerRepository17);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass8);
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        boolean boolean12 = logger9.getAdditivity();
        org.apache.log4j.Priority priority13 = logger9.getChainedPriority();
        io.cloudslang.lang.api.SlangImpl.logger = logger9;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertNull(priority13);
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        io.cloudslang.lang.api.SlangImpl.logger = logger20;
        logger20.removeAppender("org.apache.log4j.Logger");
        java.util.Enumeration enumeration24 = logger20.getAllAppenders();
        java.util.ResourceBundle resourceBundle25 = null;
        logger20.setResourceBundle(resourceBundle25);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
// flaky:         org.junit.Assert.assertNull(enumeration24);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
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
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        java.util.ResourceBundle resourceBundle14 = null;
        logger13.setResourceBundle(resourceBundle14);
        boolean boolean16 = logger13.getAdditivity();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        org.apache.log4j.Level level3 = logger2.getPriority();
        logger2.setAdditivity(true);
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger2.getHierarchy();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger2.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl8.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl8.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl8.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl8.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl8.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl8.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl8.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl8.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            logger2.info((java.lang.Object) strSet22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(level3);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory1);
        logger2.removeAllAppenders();
        org.apache.log4j.Level level4 = logger2.getLevel();
        java.util.ResourceBundle resourceBundle5 = null;
        logger2.setResourceBundle(resourceBundle5);
        logger2.setAdditivity(true);
        logger2.removeAppender("");
        org.apache.log4j.Category category11 = logger2.getParent();
        java.util.Enumeration enumeration12 = category11.getAllAppenders();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNotNull(enumeration12);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangSource slangSource7 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray8 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet9 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9, slangSourceArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact11 = slangImpl0.compile(slangSource7, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.lang.Class<?> wildcardClass2 = logger1.getClass();
        org.apache.log4j.Logger logger3 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass2);
        org.apache.log4j.Category category4 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass2);
        org.apache.log4j.Category category5 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass2);
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass2);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertNotNull(category4);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(category6);
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.lang.Class<?> wildcardClass7 = slangImpl0.getClass();
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        boolean boolean12 = logger11.getAdditivity();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        logger1.removeAllAppenders();
        org.apache.log4j.Level level6 = logger1.getLevel();
        org.apache.log4j.Appender appender7 = null;
        logger1.addAppender(appender7);
        org.apache.log4j.Category category9 = logger1.getParent();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(level6);
        org.junit.Assert.assertNotNull(category9);
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource7 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray8 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet9 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9, slangSourceArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact11 = slangImpl0.compile(slangSource7, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass13);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass13);
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category16);
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(category16);
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getLoggerRepository();
        java.util.ResourceBundle resourceBundle10 = null;
        logger1.setResourceBundle(resourceBundle10);
        java.util.ResourceBundle resourceBundle12 = null;
        logger1.setResourceBundle(resourceBundle12);
        org.apache.log4j.spi.LoggingEvent loggingEvent14 = null;
        logger1.callAppenders(loggingEvent14);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(loggerRepository9);
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangSource slangSource20 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray21 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet22 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet22, slangSourceArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact24 = slangImpl0.compile(slangSource20, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Priority priority2 = category1.getChainedPriority();
        category1.removeAllAppenders();
        org.junit.Assert.assertNotNull(category1);
// flaky:         org.junit.Assert.assertNull(priority2);
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("hi!");
        org.apache.log4j.Category category6 = logger1.getParent();
        java.util.Enumeration enumeration7 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        java.lang.Class<?> wildcardClass9 = logger1.getClass();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.Appender appender13 = category11.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Category category14 = category11.getParent();
        org.apache.log4j.Appender appender15 = null;
        category11.removeAppender(appender15);
        java.util.ResourceBundle resourceBundle17 = null;
        category11.setResourceBundle(resourceBundle17);
        java.util.ResourceBundle resourceBundle19 = category11.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNull(appender13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNull(resourceBundle19);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        java.util.Enumeration enumeration10 = category9.getAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl11.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl11.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl11.getAllEventTypes();
        java.lang.Throwable throwable17 = null;
        category9.info((java.lang.Object) slangImpl11, throwable17);
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender21 = null;
        boolean boolean22 = category20.isAttached(appender21);
        org.apache.log4j.Appender appender23 = null;
        boolean boolean24 = category20.isAttached(appender23);
        java.lang.Class<?> wildcardClass25 = category20.getClass();
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        org.apache.log4j.Level level27 = logger26.getEffectiveLevel();
        boolean boolean28 = logger26.getAdditivity();
        category9.error((java.lang.Object) logger26);
        org.apache.log4j.Appender appender30 = null;
        category9.addAppender(appender30);
        boolean boolean32 = category9.getAdditivity();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(enumeration10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(logger26);
// flaky:         org.junit.Assert.assertNull(level27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Priority priority19 = category18.getChainedPriority();
        java.util.ResourceBundle resourceBundle20 = null;
        category18.setResourceBundle(resourceBundle20);
        org.apache.log4j.Appender appender22 = null;
        category18.removeAppender(appender22);
        org.apache.log4j.Appender appender25 = category18.getAppender("org.apache.log4j.Logger");
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(priority19);
        org.junit.Assert.assertNull(appender25);
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        boolean boolean6 = category5.getAdditivity();
        java.util.ResourceBundle resourceBundle7 = category5.getResourceBundle();
        boolean boolean8 = category5.getAdditivity();
        org.apache.log4j.Category category9 = category5.getParent();
        org.apache.log4j.Priority priority10 = category5.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(resourceBundle7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(category9);
// flaky:         org.junit.Assert.assertNull(priority10);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        org.apache.log4j.Category category3 = logger2.getParent();
        java.util.Enumeration enumeration4 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
        logger2.callAppenders(loggingEvent5);
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl7.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl7.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl7.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl7.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl7.score;
        io.cloudslang.score.api.Score score17 = slangImpl7.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl7.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl7.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl7.compiler;
        java.util.Set<java.lang.String> strSet23 = slangImpl7.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            logger2.debug((java.lang.Object) strSet23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category3);
// flaky:         org.junit.Assert.assertNull(enumeration4);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass8);
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(category10);
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
        logger1.callAppenders(loggingEvent2);
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Priority priority6 = null;
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.l7dlog(priority6, "org.apache.log4j.Level", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.apache.log4j.spi.LoggerRepository loggerRepository24 = logger23.getLoggerRepository();
        java.lang.Class<?> wildcardClass25 = logger23.getClass();
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        logger27.assertLog(true, "");
        org.apache.log4j.Category category31 = logger27.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository32 = category31.getLoggerRepository();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(loggerRepository24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(category31);
        org.junit.Assert.assertNotNull(loggerRepository32);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Category category2 = category1.getParent();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(category2);
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource7 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray8 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet9 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9, slangSourceArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact11 = slangImpl0.compile(slangSource7, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Appender appender24 = logger22.getAppender("org.apache.log4j.Level");
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNull(appender24);
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Appender appender19 = logger17.getAppender("root");
        org.apache.log4j.Appender appender21 = logger17.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Appender appender22 = null;
        logger17.removeAppender(appender22);
        org.apache.log4j.Appender appender24 = null;
        logger17.removeAppender(appender24);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNull(appender19);
        org.junit.Assert.assertNull(appender21);
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        category1.setAdditivity(true);
        org.apache.log4j.Appender appender6 = null;
        boolean boolean7 = category1.isAttached(appender6);
        org.apache.log4j.Level level8 = category1.getLevel();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(level8);
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.apache.log4j.Category category21 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass20);
        org.apache.log4j.Priority priority22 = category21.getChainedPriority();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(category21);
// flaky:         org.junit.Assert.assertNull(priority22);
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Appender appender2 = null;
        logger1.removeAppender(appender2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("root");
        logger1.assertLog(true, "root");
        logger1.removeAllAppenders();
        java.util.ResourceBundle resourceBundle10 = null;
        logger1.setResourceBundle(resourceBundle10);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory1);
        org.apache.log4j.Level level3 = logger2.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl4 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl4.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl4.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl4.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl4.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl4.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl4.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl4.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl4.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl4.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl4.getAllEventTypes();
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger2.fatal((java.lang.Object) strSet18, throwable19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
// flaky:         org.junit.Assert.assertNull(level3);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Category category7 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Level level10 = logger9.getLevel();
        logger9.assertLog(true, "io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Level level14 = logger9.getLevel();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNull(level10);
        org.junit.Assert.assertNull(level14);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(category20);
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass16);
        org.apache.log4j.Priority priority18 = logger17.getChainedPriority();
        java.util.ResourceBundle resourceBundle19 = logger17.getResourceBundle();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(logger17);
// flaky:         org.junit.Assert.assertNull(priority18);
        org.junit.Assert.assertNull(resourceBundle19);
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        logger1.removeAllAppenders();
        org.apache.log4j.Level level8 = logger1.getPriority();
        org.apache.log4j.Appender appender9 = null;
        logger1.removeAppender(appender9);
        org.apache.log4j.spi.LoggingEvent loggingEvent11 = null;
        logger1.callAppenders(loggingEvent11);
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl13.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl13.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl13.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl13.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl13.compiler = slangCompiler28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl13.score = score32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl13.compiler = slangCompiler34;
        io.cloudslang.score.api.Score score36 = null;
        slangImpl13.score = score36;
        // The following exception was thrown during execution in test generation
        try {
            logger1.trace((java.lang.Object) score36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(level8);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(slangCompiler31);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        logger1.removeAllAppenders();
        logger1.removeAppender("hi!");
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertNotNull(loggerRepository3);
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
        category1.callAppenders(loggingEvent2);
        org.apache.log4j.Level level4 = category1.getPriority();
        java.util.ResourceBundle resourceBundle5 = null;
        category1.setResourceBundle(resourceBundle5);
        org.apache.log4j.Category category7 = category1.getParent();
        java.lang.String str8 = category7.getName();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "root" + "'", str8, "root");
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangSource slangSource10 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray11 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet12 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet12, slangSourceArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact14 = slangImpl0.compile(slangSource10, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.apache.log4j.Category category15 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        org.apache.log4j.Priority priority16 = category15.getChainedPriority();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(category15);
        org.junit.Assert.assertNotNull(priority16);
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource12 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray13 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet14 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet14, slangSourceArray13);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact16 = slangImpl0.compile(slangSource12, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger1.getLoggerRepository();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository7);
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category12);
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = null; // flaky: logger1.getAppender("hi!");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender5 = null;
// flaky:         logger1.addAppender(appender5);
        org.apache.log4j.Appender appender7 = null;
// flaky:         logger1.addAppender(appender7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = logger1.isInfoEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
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
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Level level17 = logger16.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl18.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl18.score = score21;
        java.util.Set<java.lang.String> strSet23 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = slangImpl18.score;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl18.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl18.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet31 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl18.eventBus = eventBus33;
        java.util.Set<java.lang.String> strSet35 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet36 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            logger16.error((java.lang.Object) strSet36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNull(level17);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.util.ResourceBundle resourceBundle3 = logger1.getResourceBundle();
        java.util.ResourceBundle resourceBundle4 = null;
        logger1.setResourceBundle(resourceBundle4);
        org.apache.log4j.Appender appender7 = logger1.getAppender("org.apache.log4j.Level");
        logger1.setAdditivity(false);
        org.apache.log4j.Appender appender11 = logger1.getAppender("hi!");
        org.apache.log4j.spi.LoggingEvent loggingEvent12 = null;
        logger1.callAppenders(loggingEvent12);
        org.apache.log4j.spi.LoggerRepository loggerRepository14 = logger1.getLoggerRepository();
        logger1.setAdditivity(false);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertNull(resourceBundle3);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNull(appender11);
        org.junit.Assert.assertNotNull(loggerRepository14);
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger21);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        org.apache.log4j.Level level6 = category1.getPriority();
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        category1.callAppenders(loggingEvent7);
        org.apache.log4j.Level level9 = category1.getLevel();
        category1.removeAllAppenders();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(level6);
        org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        org.apache.log4j.Level level3 = category0.getEffectiveLevel();
        java.lang.String str4 = category0.getName();
        java.util.ResourceBundle resourceBundle5 = null;
        category0.setResourceBundle(resourceBundle5);
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        category0.callAppenders(loggingEvent7);
        boolean boolean9 = category0.getAdditivity();
        org.apache.log4j.Appender appender10 = null;
        category0.removeAppender(appender10);
        category0.removeAllAppenders();
        org.junit.Assert.assertNotNull(category0);
// flaky:         org.junit.Assert.assertNull(level3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "root" + "'", str4, "root");
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = category11.getLoggerRepository();
        org.apache.log4j.Level level13 = category11.getPriority();
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getRoot();
        category14.removeAppender("hi!");
        org.apache.log4j.Level level17 = category14.getEffectiveLevel();
        java.lang.String str18 = category14.getName();
        java.util.ResourceBundle resourceBundle19 = null;
        category14.setResourceBundle(resourceBundle19);
        org.apache.log4j.spi.LoggingEvent loggingEvent21 = null;
        category14.callAppenders(loggingEvent21);
        boolean boolean23 = category14.getAdditivity();
        org.apache.log4j.Level level24 = category14.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl25 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score26 = null;
        slangImpl25.score = score26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl25.score = score28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl25.compiler = slangCompiler30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl25.eventBus = eventBus32;
        io.cloudslang.score.api.Score score34 = slangImpl25.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl25.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = slangImpl25.score;
        java.util.Set<java.lang.String> strSet38 = slangImpl25.getAllEventTypes();
        java.lang.Class<?> wildcardClass39 = strSet38.getClass();
        org.apache.log4j.Logger logger40 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass39);
        org.apache.log4j.Category category41 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass39);
        category41.removeAllAppenders();
        boolean boolean43 = category41.getAdditivity();
        org.apache.log4j.spi.LoggingEvent loggingEvent44 = null;
        category41.callAppenders(loggingEvent44);
        org.apache.log4j.Level level46 = category41.getLevel();
        category14.setPriority((org.apache.log4j.Priority) level46);
        category11.setPriority((org.apache.log4j.Priority) level46);
        org.apache.log4j.Logger logger50 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger50.debug((java.lang.Object) (byte) 1);
        boolean boolean53 = false; // flaky: logger50.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger50;
        org.apache.log4j.spi.LoggerRepository loggerRepository55 = logger50.getHierarchy();
        org.apache.log4j.Logger logger57 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle58 = null;
        logger57.setResourceBundle(resourceBundle58);
        java.lang.Throwable throwable61 = null;
// flaky:         logger57.fatal((java.lang.Object) 100.0f, throwable61);
        org.apache.log4j.Priority priority63 = logger57.getChainedPriority();
        org.apache.log4j.Appender appender64 = null;
        boolean boolean65 = logger57.isAttached(appender64);
        java.util.ResourceBundle resourceBundle66 = null;
        logger57.setResourceBundle(resourceBundle66);
// flaky:         logger50.error((java.lang.Object) logger57);
        org.apache.log4j.spi.LoggingEvent loggingEvent69 = null;
        logger50.callAppenders(loggingEvent69);
        io.cloudslang.lang.api.SlangImpl.logger = logger50;
        logger50.setAdditivity(false);
// flaky:         category11.warn((java.lang.Object) false);
        org.apache.log4j.Appender appender75 = null;
        boolean boolean76 = category11.isAttached(appender75);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNotNull(loggerRepository12);
        org.junit.Assert.assertNull(level13);
        org.junit.Assert.assertNotNull(category14);
// flaky:         org.junit.Assert.assertNull(level17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "root" + "'", str18, "root");
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertNull(level24);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(category41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertNotNull(level46);
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(loggerRepository55);
        org.junit.Assert.assertNotNull(logger57);
// flaky:         org.junit.Assert.assertNotNull(priority63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger9 = io.cloudslang.lang.api.SlangImpl.logger;
// flaky:         logger1.info((java.lang.Object) logger9);
        boolean boolean11 = false; // flaky: logger9.isTraceEnabled();
        boolean boolean12 = false; // flaky: logger9.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getHierarchy();
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
// flaky:         logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Priority priority14 = logger8.getChainedPriority();
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = logger8.isAttached(appender15);
        java.util.ResourceBundle resourceBundle17 = null;
        logger8.setResourceBundle(resourceBundle17);
// flaky:         logger1.error((java.lang.Object) logger8);
        org.apache.log4j.spi.LoggingEvent loggingEvent20 = null;
        logger1.callAppenders(loggingEvent20);
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        logger23.removeAllAppenders();
        org.apache.log4j.Category category27 = logger23.getParent();
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger29.debug((java.lang.Object) (byte) 1);
        boolean boolean32 = false; // flaky: logger29.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger29;
        java.lang.Class<?> wildcardClass34 = logger29.getClass();
        java.lang.Throwable throwable35 = null;
// flaky:         logger23.debug((java.lang.Object) wildcardClass34, throwable35);
        org.apache.log4j.Logger logger37 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass34);
        org.apache.log4j.Logger logger38 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass34);
        java.lang.Throwable throwable39 = null;
// flaky:         logger1.info((java.lang.Object) logger38, throwable39);
        org.apache.log4j.Appender appender41 = null;
        logger38.removeAppender(appender41);
        boolean boolean43 = false; // flaky: logger38.isTraceEnabled();
        org.apache.log4j.Appender appender45 = logger38.getAppender("hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(logger8);
// flaky:         org.junit.Assert.assertNotNull(priority14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(appender45);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
// flaky:         logger1.debug(obj8);
        logger1.assertLog(true, "");
// flaky:         logger1.assertLog(false, "");
        org.apache.log4j.Appender appender16 = null;
        logger1.addAppender(appender16);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle20 = null;
        logger19.setResourceBundle(resourceBundle20);
        logger19.removeAllAppenders();
        org.apache.log4j.Category category23 = logger19.getParent();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger25.debug((java.lang.Object) (byte) 1);
        boolean boolean28 = false; // flaky: logger25.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger25;
        java.lang.Class<?> wildcardClass30 = logger25.getClass();
        java.lang.Throwable throwable31 = null;
// flaky:         logger19.debug((java.lang.Object) wildcardClass30, throwable31);
        java.lang.Throwable throwable33 = null;
// flaky:         logger1.error((java.lang.Object) throwable31, throwable33);
        io.cloudslang.lang.api.SlangImpl slangImpl35 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score36 = null;
        slangImpl35.score = score36;
        io.cloudslang.score.api.Score score38 = null;
        slangImpl35.score = score38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = null;
        slangImpl35.compiler = slangCompiler40;
        io.cloudslang.score.events.EventBus eventBus42 = null;
        slangImpl35.eventBus = eventBus42;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = null;
        slangImpl35.compiler = slangCompiler44;
        io.cloudslang.score.api.Score score46 = null;
        slangImpl35.score = score46;
// flaky:         logger1.fatal((java.lang.Object) slangImpl35);
        io.cloudslang.score.events.ScoreEventListener scoreEventListener49 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl35.subscribeOnAllEvents(scoreEventListener49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(category23);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger9 = io.cloudslang.lang.api.SlangImpl.logger;
// flaky:         logger1.info((java.lang.Object) logger9);
        org.apache.log4j.Appender appender11 = null;
        logger9.removeAppender(appender11);
        boolean boolean13 = logger9.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Appender appender7 = null;
        logger1.removeAppender(appender7);
        org.apache.log4j.Category category9 = logger1.getParent();
        logger1.removeAllAppenders();
        org.apache.log4j.Level level11 = logger1.getPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger1.getHierarchy();
        org.apache.log4j.Priority priority13 = logger1.getChainedPriority();
        java.util.ResourceBundle resourceBundle14 = logger1.getResourceBundle();
        java.util.ResourceBundle resourceBundle15 = logger1.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNull(level11);
        org.junit.Assert.assertNotNull(loggerRepository12);
// flaky:         org.junit.Assert.assertNotNull(priority13);
        org.junit.Assert.assertNull(resourceBundle14);
        org.junit.Assert.assertNull(resourceBundle15);
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.util.ResourceBundle resourceBundle4 = null;
        logger1.setResourceBundle(resourceBundle4);
        java.lang.Object obj6 = null;
        java.lang.Throwable throwable7 = null;
// flaky:         logger1.info(obj6, throwable7);
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle11 = null;
        logger10.setResourceBundle(resourceBundle11);
        org.apache.log4j.Appender appender14 = logger10.getAppender("hi!");
        org.apache.log4j.Category category15 = logger10.getParent();
        org.apache.log4j.Level level16 = logger10.getLevel();
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger19.debug((java.lang.Object) (byte) 1);
        boolean boolean22 = false; // flaky: logger19.isDebugEnabled();
        java.util.Enumeration enumeration23 = logger19.getAllAppenders();
        java.util.ResourceBundle resourceBundle24 = logger19.getResourceBundle();
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle27 = null;
        logger26.setResourceBundle(resourceBundle27);
        java.lang.Throwable throwable30 = null;
// flaky:         logger26.fatal((java.lang.Object) 100.0f, throwable30);
        org.apache.log4j.Level level32 = logger26.getEffectiveLevel();
// flaky:         logger26.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender35 = null;
        logger26.removeAppender(appender35);
        org.apache.log4j.Category category37 = logger26.getParent();
        org.apache.log4j.Logger logger39 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle40 = null;
        logger39.setResourceBundle(resourceBundle40);
        logger39.removeAllAppenders();
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle45 = null;
        logger44.setResourceBundle(resourceBundle45);
        java.lang.Throwable throwable48 = null;
// flaky:         logger44.fatal((java.lang.Object) 100.0f, throwable48);
        org.apache.log4j.Level level50 = logger44.getEffectiveLevel();
        java.lang.Object[] objArray52 = null;
        java.lang.Throwable throwable53 = null;
// flaky:         logger39.l7dlog((org.apache.log4j.Priority) level50, "hi!", objArray52, throwable53);
        boolean boolean55 = false; // flaky: category37.isEnabledFor((org.apache.log4j.Priority) level50);
        java.lang.Object obj56 = null;
        java.lang.Throwable throwable57 = null;
// flaky:         logger19.log((org.apache.log4j.Priority) level50, obj56, throwable57);
        org.apache.log4j.Logger logger60 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle61 = null;
        logger60.setResourceBundle(resourceBundle61);
        java.lang.Throwable throwable63 = null;
// flaky:         logger10.log("", (org.apache.log4j.Priority) level50, (java.lang.Object) logger60, throwable63);
        org.apache.log4j.spi.LoggerRepository loggerRepository65 = logger10.getLoggerRepository();
        java.util.Enumeration enumeration66 = logger10.getAllAppenders();
        org.apache.log4j.Category category67 = logger10.getParent();
        org.apache.log4j.Logger logger69 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle70 = null;
        logger69.setResourceBundle(resourceBundle70);
        java.lang.Throwable throwable73 = null;
// flaky:         logger69.fatal((java.lang.Object) 100.0f, throwable73);
        org.apache.log4j.Level level75 = logger69.getEffectiveLevel();
        boolean boolean76 = false; // flaky: logger69.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl77 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus78 = slangImpl77.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler79 = null;
        slangImpl77.compiler = slangCompiler79;
        java.lang.Throwable throwable81 = null;
// flaky:         logger69.info((java.lang.Object) slangImpl77, throwable81);
        java.lang.String str83 = logger69.getName();
        io.cloudslang.lang.api.SlangImpl.logger = logger69;
        logger69.setAdditivity(true);
        logger69.removeAllAppenders();
        org.apache.log4j.spi.LoggerFactory loggerFactory89 = null;
        org.apache.log4j.Logger logger90 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory89);
        org.apache.log4j.Category category91 = logger90.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository92 = logger90.getHierarchy();
        org.apache.log4j.Level level93 = logger90.getLevel();
        logger69.setLevel(level93);
        category67.setLevel(level93);
// flaky:         logger1.warn((java.lang.Object) category67);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNull(appender14);
        org.junit.Assert.assertNotNull(category15);
        org.junit.Assert.assertNull(level16);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(enumeration23);
        org.junit.Assert.assertNull(resourceBundle24);
        org.junit.Assert.assertNotNull(logger26);
// flaky:         org.junit.Assert.assertNotNull(level32);
        org.junit.Assert.assertNotNull(category37);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertNotNull(logger44);
// flaky:         org.junit.Assert.assertNotNull(level50);
// flaky:         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertNotNull(loggerRepository65);
        org.junit.Assert.assertNotNull(enumeration66);
        org.junit.Assert.assertNotNull(category67);
        org.junit.Assert.assertNotNull(logger69);
// flaky:         org.junit.Assert.assertNotNull(level75);
// flaky:         org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(eventBus78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(logger90);
        org.junit.Assert.assertNotNull(category91);
        org.junit.Assert.assertNotNull(loggerRepository92);
        org.junit.Assert.assertNull(level93);
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getHierarchy();
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
// flaky:         logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Priority priority14 = logger8.getChainedPriority();
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = logger8.isAttached(appender15);
        java.util.ResourceBundle resourceBundle17 = null;
        logger8.setResourceBundle(resourceBundle17);
// flaky:         logger1.error((java.lang.Object) logger8);
        org.apache.log4j.spi.LoggingEvent loggingEvent20 = null;
        logger1.callAppenders(loggingEvent20);
        boolean boolean22 = false; // flaky: logger1.isTraceEnabled();
        org.apache.log4j.spi.LoggingEvent loggingEvent23 = null;
        logger1.callAppenders(loggingEvent23);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(logger8);
// flaky:         org.junit.Assert.assertNotNull(priority14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        boolean boolean7 = false; // flaky: logger1.isDebugEnabled();
        java.lang.Throwable throwable9 = null;
// flaky:         logger1.trace((java.lang.Object) 10L, throwable9);
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Appender appender15 = category13.getAppender("org.apache.log4j.Level");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNull(appender15);
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Appender appender7 = null;
        logger1.removeAppender(appender7);
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getLoggerRepository();
        boolean boolean10 = logger1.getAdditivity();
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl11.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl11.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl11.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl11.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl11.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl11.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = slangImpl11.score;
        io.cloudslang.score.api.Score score27 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl11.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl11.eventBus = eventBus30;
        java.util.Set<java.lang.String> strSet32 = slangImpl11.getAllEventTypes();
        java.lang.Throwable throwable33 = null;
// flaky:         logger1.info((java.lang.Object) slangImpl11, throwable33);
        java.util.Enumeration enumeration35 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository36 = logger1.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(enumeration35);
        org.junit.Assert.assertNotNull(loggerRepository36);
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        boolean boolean7 = false; // flaky: logger1.isInfoEnabled();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        logger9.removeAllAppenders();
// flaky:         logger1.fatal((java.lang.Object) logger9);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle16 = null;
        logger15.setResourceBundle(resourceBundle16);
        java.lang.Throwable throwable19 = null;
// flaky:         logger15.fatal((java.lang.Object) 100.0f, throwable19);
        boolean boolean21 = false; // flaky: logger15.isDebugEnabled();
        boolean boolean22 = false; // flaky: logger15.isDebugEnabled();
        java.lang.Throwable throwable23 = null;
// flaky:         logger1.fatal((java.lang.Object) logger15, throwable23);
        org.apache.log4j.spi.LoggingEvent loggingEvent25 = null;
        logger1.callAppenders(loggingEvent25);
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level29 = logger28.getEffectiveLevel();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
// flaky:         logger32.fatal((java.lang.Object) 100.0f, throwable36);
        org.apache.log4j.Level level38 = logger32.getEffectiveLevel();
// flaky:         logger32.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender41 = null;
        logger32.removeAppender(appender41);
        org.apache.log4j.Category category43 = logger32.getParent();
        boolean boolean44 = false; // flaky: logger32.isDebugEnabled();
        org.apache.log4j.Logger logger46 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger46.debug((java.lang.Object) (byte) 1);
        boolean boolean49 = false; // flaky: logger46.isDebugEnabled();
        logger46.removeAppender("hi!");
        org.apache.log4j.Logger logger53 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle54 = null;
        logger53.setResourceBundle(resourceBundle54);
        java.lang.Throwable throwable57 = null;
// flaky:         logger53.fatal((java.lang.Object) 100.0f, throwable57);
        org.apache.log4j.Level level59 = logger53.getEffectiveLevel();
        org.apache.log4j.Logger logger61 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle62 = null;
        logger61.setResourceBundle(resourceBundle62);
        java.lang.Throwable throwable65 = null;
// flaky:         logger61.fatal((java.lang.Object) 100.0f, throwable65);
        boolean boolean67 = false; // flaky: logger61.isDebugEnabled();
// flaky:         logger46.log((org.apache.log4j.Priority) level59, (java.lang.Object) boolean67);
        org.apache.log4j.Logger logger71 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle72 = null;
        logger71.setResourceBundle(resourceBundle72);
        java.lang.Throwable throwable75 = null;
// flaky:         logger71.fatal((java.lang.Object) 100.0f, throwable75);
        org.apache.log4j.Level level77 = logger71.getEffectiveLevel();
        java.lang.Object[] objArray78 = new java.lang.Object[] { level77 };
        java.lang.Throwable throwable79 = null;
// flaky:         logger32.l7dlog((org.apache.log4j.Priority) level59, "hi!", objArray78, throwable79);
        java.lang.Throwable throwable81 = null;
// flaky:         logger1.l7dlog((org.apache.log4j.Priority) level29, "", objArray78, throwable81);
        org.apache.log4j.Level level83 = logger1.getPriority();
        boolean boolean84 = false; // flaky: logger1.isDebugEnabled();
        boolean boolean85 = logger1.getAdditivity();
        org.apache.log4j.Category category87 = org.apache.log4j.Category.getInstance("hi!");
        org.apache.log4j.Level level88 = category87.getLevel();
        org.apache.log4j.Appender appender89 = null;
        category87.removeAppender(appender89);
        java.util.Enumeration enumeration91 = category87.getAllAppenders();
        org.apache.log4j.Level level92 = category87.getPriority();
// flaky:         logger1.trace((java.lang.Object) category87);
        java.util.Enumeration enumeration94 = logger1.getAllAppenders();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(logger28);
// flaky:         org.junit.Assert.assertNotNull(level29);
        org.junit.Assert.assertNotNull(logger32);
// flaky:         org.junit.Assert.assertNotNull(level38);
        org.junit.Assert.assertNotNull(category43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(logger53);
// flaky:         org.junit.Assert.assertNotNull(level59);
        org.junit.Assert.assertNotNull(logger61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(logger71);
// flaky:         org.junit.Assert.assertNotNull(level77);
        org.junit.Assert.assertNotNull(objArray78);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[INFO]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[INFO]");
        org.junit.Assert.assertNull(level83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(category87);
        org.junit.Assert.assertNull(level88);
        org.junit.Assert.assertNotNull(enumeration91);
        org.junit.Assert.assertNull(level92);
        org.junit.Assert.assertNotNull(enumeration94);
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        boolean boolean7 = false; // flaky: logger1.isInfoEnabled();
        org.apache.log4j.Appender appender8 = null;
        logger1.removeAppender(appender8);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger11.debug((java.lang.Object) (byte) 1);
        boolean boolean14 = false; // flaky: logger11.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger11;
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        logger17.removeAllAppenders();
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle23 = null;
        logger22.setResourceBundle(resourceBundle23);
        java.lang.Throwable throwable26 = null;
// flaky:         logger22.fatal((java.lang.Object) 100.0f, throwable26);
        org.apache.log4j.Level level28 = logger22.getEffectiveLevel();
        java.lang.Object[] objArray30 = null;
        java.lang.Throwable throwable31 = null;
// flaky:         logger17.l7dlog((org.apache.log4j.Priority) level28, "hi!", objArray30, throwable31);
// flaky:         logger11.error((java.lang.Object) objArray30);
        org.apache.log4j.spi.LoggingEvent loggingEvent34 = null;
        logger11.callAppenders(loggingEvent34);
        org.apache.log4j.Level level36 = logger11.getEffectiveLevel();
        logger1.setPriority((org.apache.log4j.Priority) level36);
        io.cloudslang.lang.api.SlangImpl slangImpl38 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl38.eventBus;
        io.cloudslang.score.events.EventBus eventBus40 = slangImpl38.eventBus;
        io.cloudslang.score.api.Score score41 = slangImpl38.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = slangImpl38.compiler;
        io.cloudslang.score.api.Score score43 = null;
        slangImpl38.score = score43;
        java.util.Set<java.lang.String> strSet45 = slangImpl38.getAllEventTypes();
        java.lang.Throwable throwable46 = null;
// flaky:         logger1.warn((java.lang.Object) strSet45, throwable46);
        org.apache.log4j.Logger logger49 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger49;
        org.apache.log4j.Appender appender52 = logger49.getAppender("org.apache.log4j.Level");
        org.apache.log4j.Appender appender53 = null;
        logger49.removeAppender(appender53);
        org.apache.log4j.spi.LoggingEvent loggingEvent55 = null;
        logger49.callAppenders(loggingEvent55);
        org.apache.log4j.Level level57 = logger49.getLevel();
        java.lang.Throwable throwable58 = null;
// flaky:         logger1.debug((java.lang.Object) logger49, throwable58);
        org.apache.log4j.spi.LoggingEvent loggingEvent60 = null;
        logger49.callAppenders(loggingEvent60);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger22);
// flaky:         org.junit.Assert.assertNotNull(level28);
// flaky:         org.junit.Assert.assertNotNull(level36);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNull(eventBus40);
        org.junit.Assert.assertNull(score41);
        org.junit.Assert.assertNull(slangCompiler42);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNull(appender52);
        org.junit.Assert.assertNull(level57);
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Logger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        io.cloudslang.lang.api.SlangImpl slangImpl3 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl3.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl3.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl3.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl3.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl3.score;
        io.cloudslang.score.api.Score score13 = slangImpl3.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl3.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl3.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl3.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl3.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl3.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl3.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl3.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl3.compiler;
// flaky:         logger1.fatal((java.lang.Object) slangCompiler26);
        logger1.removeAppender("root");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        boolean boolean7 = false; // flaky: logger1.isDebugEnabled();
        java.lang.Throwable throwable9 = null;
// flaky:         logger1.trace((java.lang.Object) 10L, throwable9);
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle16 = null;
        logger15.setResourceBundle(resourceBundle16);
        java.lang.Throwable throwable19 = null;
// flaky:         logger15.fatal((java.lang.Object) 100.0f, throwable19);
        boolean boolean21 = false; // flaky: logger15.isDebugEnabled();
        java.lang.Throwable throwable23 = null;
// flaky:         logger15.trace((java.lang.Object) 10L, throwable23);
        java.lang.Class<?> wildcardClass25 = logger15.getClass();
        org.apache.log4j.Category category26 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass25);
        org.apache.log4j.Category category27 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass25);
        category27.removeAppender("");
        org.apache.log4j.Appender appender31 = category27.getAppender("hi!");
        boolean boolean32 = false; // flaky: category27.isDebugEnabled();
        org.apache.log4j.Appender appender33 = null;
        category27.addAppender(appender33);
// flaky:         category13.fatal((java.lang.Object) category27);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(category26);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNull(appender31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
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
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        org.apache.log4j.Level level18 = category17.getPriority();
        java.util.ResourceBundle resourceBundle19 = category17.getResourceBundle();
        java.lang.String str20 = category17.getName();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(category17);
// flaky:         org.junit.Assert.assertNotNull(level18);
        org.junit.Assert.assertNull(resourceBundle19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "io.cloudslang.lang.api.SlangImpl" + "'", str20, "io.cloudslang.lang.api.SlangImpl");
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle7 = null;
        logger6.setResourceBundle(resourceBundle7);
        java.lang.Throwable throwable10 = null;
// flaky:         logger6.fatal((java.lang.Object) 100.0f, throwable10);
        org.apache.log4j.Level level12 = logger6.getEffectiveLevel();
        java.lang.Throwable throwable14 = null;
// flaky:         logger1.l7dlog((org.apache.log4j.Priority) level12, "hi!", throwable14);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        java.lang.Throwable throwable21 = null;
// flaky:         logger17.fatal((java.lang.Object) 100.0f, throwable21);
        org.apache.log4j.Level level23 = logger17.getEffectiveLevel();
        java.lang.Object obj24 = null;
// flaky:         logger17.debug(obj24);
        logger17.assertLog(true, "");
        java.util.ResourceBundle resourceBundle29 = null;
        logger17.setResourceBundle(resourceBundle29);
// flaky:         logger17.assertLog(false, "");
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle36 = null;
        logger35.setResourceBundle(resourceBundle36);
        java.lang.Throwable throwable39 = null;
// flaky:         logger35.fatal((java.lang.Object) 100.0f, throwable39);
        org.apache.log4j.Level level41 = logger35.getEffectiveLevel();
        java.lang.Object obj42 = null;
// flaky:         logger35.debug(obj42);
        logger35.assertLog(true, "");
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger48.debug((java.lang.Object) (byte) 1);
        boolean boolean51 = false; // flaky: logger48.isDebugEnabled();
        logger48.removeAppender("hi!");
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle56 = null;
        logger55.setResourceBundle(resourceBundle56);
        java.lang.Throwable throwable59 = null;
// flaky:         logger55.fatal((java.lang.Object) 100.0f, throwable59);
        org.apache.log4j.Level level61 = logger55.getEffectiveLevel();
        org.apache.log4j.Logger logger63 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle64 = null;
        logger63.setResourceBundle(resourceBundle64);
        java.lang.Throwable throwable67 = null;
// flaky:         logger63.fatal((java.lang.Object) 100.0f, throwable67);
        boolean boolean69 = false; // flaky: logger63.isDebugEnabled();
// flaky:         logger48.log((org.apache.log4j.Priority) level61, (java.lang.Object) boolean69);
        java.lang.Throwable throwable72 = null;
// flaky:         logger35.l7dlog((org.apache.log4j.Priority) level61, "hi!", throwable72);
        java.lang.Throwable throwable74 = null;
// flaky:         logger17.trace((java.lang.Object) "hi!", throwable74);
        io.cloudslang.lang.api.SlangImpl.logger = logger17;
        java.lang.Throwable throwable77 = null;
// flaky:         logger1.info((java.lang.Object) logger17, throwable77);
        io.cloudslang.lang.api.SlangImpl.logger = logger17;
        org.apache.log4j.Category category81 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender82 = null;
        category81.addAppender(appender82);
        category81.setAdditivity(true);
        java.lang.Throwable throwable86 = null;
// flaky:         logger17.trace((java.lang.Object) category81, throwable86);
        org.apache.log4j.Category category88 = logger17.getParent();
        org.apache.log4j.spi.LoggingEvent loggingEvent89 = null;
        category88.callAppenders(loggingEvent89);
// flaky:         category88.assertLog(false, "io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(logger6);
// flaky:         org.junit.Assert.assertNotNull(level12);
        org.junit.Assert.assertNotNull(logger17);
// flaky:         org.junit.Assert.assertNotNull(level23);
        org.junit.Assert.assertNotNull(logger35);
// flaky:         org.junit.Assert.assertNotNull(level41);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(logger55);
// flaky:         org.junit.Assert.assertNotNull(level61);
        org.junit.Assert.assertNotNull(logger63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(category81);
        org.junit.Assert.assertNotNull(category88);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("hi!");
        boolean boolean2 = false; // flaky: logger1.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl3 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl3.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl3.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl3.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl3.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl3.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl3.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl3.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl3.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl3.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl3.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl3.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl3.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl3.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl3.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl3.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl3.getAllEventTypes();
// flaky:         logger1.debug((java.lang.Object) slangImpl3);
        java.util.Set<java.lang.String> strSet27 = slangImpl3.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl3.getAllEventTypes();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl19.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl19.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl19.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl19.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
// flaky:         logger1.debug(obj8);
        logger1.removeAppender("root");
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger1.getHierarchy();
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        java.lang.Throwable throwable18 = null;
// flaky:         logger14.fatal((java.lang.Object) 100.0f, throwable18);
        org.apache.log4j.Level level20 = logger14.getEffectiveLevel();
// flaky:         logger14.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Logger logger24 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle25 = null;
        logger24.setResourceBundle(resourceBundle25);
        java.lang.Throwable throwable28 = null;
// flaky:         logger24.fatal((java.lang.Object) 100.0f, throwable28);
        boolean boolean30 = false; // flaky: logger24.isDebugEnabled();
        java.lang.Throwable throwable32 = null;
// flaky:         logger24.trace((java.lang.Object) 10L, throwable32);
        java.lang.Class<?> wildcardClass34 = logger24.getClass();
        java.lang.Throwable throwable35 = null;
// flaky:         logger14.debug((java.lang.Object) wildcardClass34, throwable35);
        logger14.assertLog(true, "hi!");
        io.cloudslang.lang.api.SlangImpl slangImpl40 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus41 = slangImpl40.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = null;
        slangImpl40.compiler = slangCompiler42;
        io.cloudslang.score.events.EventBus eventBus44 = slangImpl40.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler45 = null;
        slangImpl40.compiler = slangCompiler45;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler47 = slangImpl40.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler48 = null;
        slangImpl40.compiler = slangCompiler48;
        io.cloudslang.score.api.Score score50 = slangImpl40.score;
        java.util.Set<java.lang.String> strSet51 = slangImpl40.getAllEventTypes();
        java.util.Set<java.lang.String> strSet52 = slangImpl40.getAllEventTypes();
        java.lang.Throwable throwable53 = null;
// flaky:         logger14.fatal((java.lang.Object) slangImpl40, throwable53);
// flaky:         logger1.error((java.lang.Object) logger14);
        logger14.setAdditivity(false);
        boolean boolean58 = false; // flaky: logger14.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl59 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score60 = null;
        slangImpl59.score = score60;
        io.cloudslang.score.api.Score score62 = null;
        slangImpl59.score = score62;
        java.util.Set<java.lang.String> strSet64 = slangImpl59.getAllEventTypes();
        java.util.Set<java.lang.String> strSet65 = slangImpl59.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler66 = null;
        slangImpl59.compiler = slangCompiler66;
        io.cloudslang.score.events.EventBus eventBus68 = null;
        slangImpl59.eventBus = eventBus68;
        java.util.Set<java.lang.String> strSet70 = slangImpl59.getAllEventTypes();
        io.cloudslang.score.api.Score score71 = slangImpl59.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler72 = null;
        slangImpl59.compiler = slangCompiler72;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler74 = slangImpl59.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler75 = null;
        slangImpl59.compiler = slangCompiler75;
// flaky:         logger14.debug((java.lang.Object) slangImpl59);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(loggerRepository12);
        org.junit.Assert.assertNotNull(logger14);
// flaky:         org.junit.Assert.assertNotNull(level20);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(eventBus41);
        org.junit.Assert.assertNull(eventBus44);
        org.junit.Assert.assertNull(slangCompiler47);
        org.junit.Assert.assertNull(score50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNull(score71);
        org.junit.Assert.assertNull(slangCompiler74);
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender6 = null;
        boolean boolean7 = logger1.isAttached(appender6);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level9 = logger1.getPriority();
        java.util.ResourceBundle resourceBundle10 = null;
        logger1.setResourceBundle(resourceBundle10);
        java.util.Enumeration enumeration12 = logger1.getAllAppenders();
        org.apache.log4j.Priority priority13 = logger1.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository14 = logger1.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(priority4);
// flaky:         org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNull(enumeration12);
// flaky:         org.junit.Assert.assertNotNull(priority13);
        org.junit.Assert.assertNotNull(loggerRepository14);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource21 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray22 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet23 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet23, slangSourceArray22);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact25 = slangImpl0.compile(slangSource21, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger16.debug((java.lang.Object) (byte) 1);
        boolean boolean19 = false; // flaky: logger16.isDebugEnabled();
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger21.debug((java.lang.Object) (byte) 1);
        boolean boolean24 = false; // flaky: logger21.isDebugEnabled();
        java.util.Enumeration enumeration25 = logger21.getAllAppenders();
        java.lang.Throwable throwable26 = null;
// flaky:         logger16.error((java.lang.Object) logger21, throwable26);
        org.apache.log4j.Level level28 = logger16.getPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository29 = logger16.getLoggerRepository();
        org.apache.log4j.Category category30 = logger16.getParent();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
// flaky:         logger32.fatal((java.lang.Object) 100.0f, throwable36);
        org.apache.log4j.Level level38 = logger32.getEffectiveLevel();
        boolean boolean39 = false; // flaky: logger32.isInfoEnabled();
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger41.debug((java.lang.Object) (byte) 1);
        boolean boolean44 = false; // flaky: logger41.isDebugEnabled();
        logger41.removeAppender("hi!");
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle49 = null;
        logger48.setResourceBundle(resourceBundle49);
        java.lang.Throwable throwable52 = null;
// flaky:         logger48.fatal((java.lang.Object) 100.0f, throwable52);
        org.apache.log4j.Level level54 = logger48.getEffectiveLevel();
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle57 = null;
        logger56.setResourceBundle(resourceBundle57);
        java.lang.Throwable throwable60 = null;
// flaky:         logger56.fatal((java.lang.Object) 100.0f, throwable60);
        boolean boolean62 = false; // flaky: logger56.isDebugEnabled();
// flaky:         logger41.log((org.apache.log4j.Priority) level54, (java.lang.Object) boolean62);
        org.apache.log4j.Priority priority64 = logger41.getChainedPriority();
        org.apache.log4j.Logger logger66 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender67 = null;
        logger66.addAppender(appender67);
        org.apache.log4j.spi.LoggerRepository loggerRepository69 = logger66.getHierarchy();
        org.apache.log4j.Logger logger71 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle72 = null;
        logger71.setResourceBundle(resourceBundle72);
        java.lang.Throwable throwable75 = null;
// flaky:         logger71.fatal((java.lang.Object) 100.0f, throwable75);
        org.apache.log4j.Level level77 = logger71.getEffectiveLevel();
        java.lang.Throwable throwable79 = null;
// flaky:         logger66.l7dlog((org.apache.log4j.Priority) level77, "hi!", throwable79);
        java.lang.Throwable throwable81 = null;
// flaky:         logger41.warn((java.lang.Object) level77, throwable81);
        io.cloudslang.lang.api.SlangImpl slangImpl83 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus84 = slangImpl83.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler85 = null;
        slangImpl83.compiler = slangCompiler85;
        io.cloudslang.score.events.EventBus eventBus87 = slangImpl83.eventBus;
        java.lang.Throwable throwable88 = null;
// flaky:         logger32.log((org.apache.log4j.Priority) level77, (java.lang.Object) slangImpl83, throwable88);
        io.cloudslang.score.api.Score score90 = slangImpl83.score;
        java.util.Set<java.lang.String> strSet91 = slangImpl83.getAllEventTypes();
// flaky:         category30.fatal((java.lang.Object) slangImpl83);
        java.util.Set<java.lang.String> strSet93 = slangImpl83.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(enumeration25);
// flaky:         org.junit.Assert.assertNotNull(level28);
        org.junit.Assert.assertNotNull(loggerRepository29);
        org.junit.Assert.assertNotNull(category30);
        org.junit.Assert.assertNotNull(logger32);
// flaky:         org.junit.Assert.assertNotNull(level38);
// flaky:         org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(logger48);
// flaky:         org.junit.Assert.assertNotNull(level54);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky:         org.junit.Assert.assertNotNull(priority64);
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertNotNull(loggerRepository69);
        org.junit.Assert.assertNotNull(logger71);
// flaky:         org.junit.Assert.assertNotNull(level77);
        org.junit.Assert.assertNull(eventBus84);
        org.junit.Assert.assertNull(eventBus87);
        org.junit.Assert.assertNull(score90);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strSet93);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        boolean boolean3 = false; // flaky: logger2.isDebugEnabled();
        boolean boolean4 = false; // flaky: logger2.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl5 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl5.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl5.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl5.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl5.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl5.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl5.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl5.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl5.eventBus;
// flaky:         logger2.info((java.lang.Object) eventBus15);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender20 = null; // flaky: logger18.getAppender("hi!");
        java.lang.Throwable throwable21 = null;
// flaky:         logger2.fatal((java.lang.Object) "hi!", throwable21);
        java.util.ResourceBundle resourceBundle23 = null;
        logger2.setResourceBundle(resourceBundle23);
        logger2.setAdditivity(true);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
// flaky:         org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNull(appender20);
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger7.debug((java.lang.Object) (byte) 1);
        boolean boolean10 = false; // flaky: logger7.isDebugEnabled();
        logger7.removeAppender("hi!");
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        java.lang.Throwable throwable18 = null;
// flaky:         logger14.fatal((java.lang.Object) 100.0f, throwable18);
        org.apache.log4j.Level level20 = logger14.getEffectiveLevel();
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle23 = null;
        logger22.setResourceBundle(resourceBundle23);
        java.lang.Throwable throwable26 = null;
// flaky:         logger22.fatal((java.lang.Object) 100.0f, throwable26);
        boolean boolean28 = false; // flaky: logger22.isDebugEnabled();
// flaky:         logger7.log((org.apache.log4j.Priority) level20, (java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = null; // flaky: level20.getClass();
        org.apache.log4j.Logger logger31 = null; // flaky: org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass30);
        org.apache.log4j.Logger logger32 = null; // flaky: org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass30);
        org.apache.log4j.Category category33 = null; // flaky: org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass30);
// flaky:         category33.setAdditivity(false);
        org.apache.log4j.Logger logger37 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger37.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Category category41 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender42 = null;
        boolean boolean43 = category41.isAttached(appender42);
        org.apache.log4j.Appender appender44 = null;
        boolean boolean45 = category41.isAttached(appender44);
        java.lang.Class<?> wildcardClass46 = category41.getClass();
// flaky:         logger37.error((java.lang.Object) wildcardClass46);
        java.util.ResourceBundle resourceBundle48 = null;
        logger37.setResourceBundle(resourceBundle48);
        org.apache.log4j.Logger logger51 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender52 = null;
        logger51.addAppender(appender52);
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle56 = null;
        logger55.setResourceBundle(resourceBundle56);
        java.lang.Throwable throwable59 = null;
// flaky:         logger55.fatal((java.lang.Object) 100.0f, throwable59);
        boolean boolean61 = false; // flaky: logger55.isDebugEnabled();
        java.lang.Throwable throwable63 = null;
// flaky:         logger55.trace((java.lang.Object) 10L, throwable63);
        java.lang.Class<?> wildcardClass65 = logger55.getClass();
        org.apache.log4j.Category category66 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass65);
        org.apache.log4j.Category category67 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass65);
        category67.removeAppender("");
// flaky:         logger51.error((java.lang.Object) category67);
        java.lang.Class<?> wildcardClass71 = logger51.getClass();
        org.apache.log4j.Category category72 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass71);
        java.lang.Throwable throwable73 = null;
// flaky:         logger37.error((java.lang.Object) wildcardClass71, throwable73);
        org.apache.log4j.Priority priority75 = logger37.getChainedPriority();
        boolean boolean76 = false; // flaky: category33.isEnabledFor(priority75);
        java.lang.Throwable throwable78 = null;
// flaky:         logger1.l7dlog(priority75, "org.apache.log4j.Logger", throwable78);
        boolean boolean80 = false; // flaky: logger1.isDebugEnabled();
        org.apache.log4j.Appender appender82 = logger1.getAppender("root");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.assertLog(true, "root");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(logger14);
// flaky:         org.junit.Assert.assertNotNull(level20);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass30);
// flaky:         org.junit.Assert.assertNotNull(logger31);
// flaky:         org.junit.Assert.assertNotNull(logger32);
// flaky:         org.junit.Assert.assertNotNull(category33);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(category41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(logger51);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(category66);
        org.junit.Assert.assertNotNull(category67);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(category72);
// flaky:         org.junit.Assert.assertNotNull(priority75);
// flaky:         org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(appender82);
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
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
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = logger15.getClass();
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass16);
        org.apache.log4j.Appender appender18 = null;
        logger17.removeAppender(appender18);
        java.lang.String str20 = logger17.getName();
        org.apache.log4j.Category category21 = logger17.getParent();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.log4j.Logger" + "'", str20, "org.apache.log4j.Logger");
        org.junit.Assert.assertNotNull(category21);
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle7 = null;
        logger6.setResourceBundle(resourceBundle7);
        java.lang.Throwable throwable10 = null;
// flaky:         logger6.fatal((java.lang.Object) 100.0f, throwable10);
        org.apache.log4j.Level level12 = logger6.getEffectiveLevel();
// flaky:         logger6.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger16.debug((java.lang.Object) (byte) 1);
        boolean boolean19 = false; // flaky: logger16.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger16;
        java.lang.Class<?> wildcardClass21 = logger16.getClass();
        java.lang.Throwable throwable22 = null;
// flaky:         logger6.debug((java.lang.Object) logger16, throwable22);
        boolean boolean24 = false; // flaky: logger6.isTraceEnabled();
        java.lang.Throwable throwable25 = null;
// flaky:         logger1.debug((java.lang.Object) boolean24, throwable25);
        boolean boolean27 = false; // flaky: logger1.isDebugEnabled();
        boolean boolean28 = false; // flaky: logger1.isInfoEnabled();
        boolean boolean29 = false; // flaky: logger1.isTraceEnabled();
        logger1.setAdditivity(true);
        org.apache.log4j.Appender appender32 = null;
        logger1.addAppender(appender32);
        java.lang.Object obj34 = null;
        java.lang.Throwable throwable35 = null;
// flaky:         logger1.info(obj34, throwable35);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger6);
// flaky:         org.junit.Assert.assertNotNull(level12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        java.lang.String str5 = logger1.getName();
        org.apache.log4j.Category category6 = logger1.getParent();
        org.apache.log4j.Appender appender7 = null;
        category6.addAppender(appender7);
        java.util.ResourceBundle resourceBundle9 = null;
        category6.setResourceBundle(resourceBundle9);
        org.apache.log4j.Appender appender11 = null;
        category6.removeAppender(appender11);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        java.lang.Throwable throwable18 = null;
// flaky:         logger14.fatal((java.lang.Object) 100.0f, throwable18);
        org.apache.log4j.Level level20 = logger14.getEffectiveLevel();
        boolean boolean21 = false; // flaky: logger14.isInfoEnabled();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
// flaky:         logger23.fatal((java.lang.Object) 100.0f, throwable27);
        org.apache.log4j.Priority priority29 = logger23.getChainedPriority();
        logger23.removeAppender("");
        logger23.setAdditivity(true);
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger35.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Logger logger39 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle40 = null;
        logger39.setResourceBundle(resourceBundle40);
        java.lang.Throwable throwable43 = null;
// flaky:         logger39.fatal((java.lang.Object) 100.0f, throwable43);
        org.apache.log4j.Level level45 = logger39.getEffectiveLevel();
// flaky:         logger39.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender48 = null;
        logger39.removeAppender(appender48);
        org.apache.log4j.Category category50 = logger39.getParent();
        org.apache.log4j.Logger logger52 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle53 = null;
        logger52.setResourceBundle(resourceBundle53);
        logger52.removeAllAppenders();
        org.apache.log4j.Logger logger57 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle58 = null;
        logger57.setResourceBundle(resourceBundle58);
        java.lang.Throwable throwable61 = null;
// flaky:         logger57.fatal((java.lang.Object) 100.0f, throwable61);
        org.apache.log4j.Level level63 = logger57.getEffectiveLevel();
        java.lang.Object[] objArray65 = null;
        java.lang.Throwable throwable66 = null;
// flaky:         logger52.l7dlog((org.apache.log4j.Priority) level63, "hi!", objArray65, throwable66);
        boolean boolean68 = false; // flaky: category50.isEnabledFor((org.apache.log4j.Priority) level63);
        logger35.setLevel(level63);
        logger23.setPriority((org.apache.log4j.Priority) level63);
        org.apache.log4j.Level level71 = logger23.getPriority();
        boolean boolean72 = false; // flaky: logger14.isEnabledFor((org.apache.log4j.Priority) level71);
        java.lang.Throwable throwable74 = null;
// flaky:         category6.l7dlog((org.apache.log4j.Priority) level71, "org.apache.log4j.Level", throwable74);
        java.util.ResourceBundle resourceBundle76 = null;
        category6.setResourceBundle(resourceBundle76);
        org.apache.log4j.Level level78 = category6.getPriority();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(priority4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(logger14);
// flaky:         org.junit.Assert.assertNotNull(level20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(logger23);
// flaky:         org.junit.Assert.assertNotNull(priority29);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(logger39);
// flaky:         org.junit.Assert.assertNotNull(level45);
        org.junit.Assert.assertNotNull(category50);
        org.junit.Assert.assertNotNull(logger52);
        org.junit.Assert.assertNotNull(logger57);
// flaky:         org.junit.Assert.assertNotNull(level63);
// flaky:         org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
// flaky:         org.junit.Assert.assertNotNull(level71);
// flaky:         org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
// flaky:         org.junit.Assert.assertNotNull(level78);
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        logger18.removeAppender("java.util.HashSet");
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl21.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl21.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl21.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl21.compiler = slangCompiler26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl21.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl21.compiler = slangCompiler29;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl21.score = score31;
        java.util.Set<java.lang.String> strSet33 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet34 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score35 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet36 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet37 = slangImpl21.getAllEventTypes();
        java.lang.Class<?> wildcardClass38 = strSet37.getClass();
        org.apache.log4j.Logger logger39 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass38);
        org.apache.log4j.Level level40 = logger39.getLevel();
        org.apache.log4j.Category category42 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        boolean boolean43 = category42.getAdditivity();
        category42.assertLog(true, "org.apache.log4j.Logger");
        org.apache.log4j.Appender appender47 = null;
        category42.addAppender(appender47);
        org.apache.log4j.spi.LoggerRepository loggerRepository49 = category42.getHierarchy();
// flaky:         logger39.warn((java.lang.Object) category42);
        java.lang.Throwable throwable51 = null;
// flaky:         logger18.error((java.lang.Object) category42, throwable51);
        org.apache.log4j.spi.LoggingEvent loggingEvent53 = null;
        logger18.callAppenders(loggingEvent53);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(logger39);
// flaky:         org.junit.Assert.assertNotNull(level40);
        org.junit.Assert.assertNotNull(category42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(loggerRepository49);
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle8 = null;
        logger7.setResourceBundle(resourceBundle8);
        logger7.removeAllAppenders();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle13 = null;
        logger12.setResourceBundle(resourceBundle13);
        java.lang.Throwable throwable16 = null;
// flaky:         logger12.fatal((java.lang.Object) 100.0f, throwable16);
        org.apache.log4j.Level level18 = logger12.getEffectiveLevel();
        java.lang.Object[] objArray20 = null;
        java.lang.Throwable throwable21 = null;
// flaky:         logger7.l7dlog((org.apache.log4j.Priority) level18, "hi!", objArray20, throwable21);
// flaky:         logger1.error((java.lang.Object) objArray20);
        org.apache.log4j.spi.LoggerRepository loggerRepository24 = logger1.getHierarchy();
        org.apache.log4j.Category category25 = org.apache.log4j.Category.getRoot();
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle28 = null;
        logger27.setResourceBundle(resourceBundle28);
        logger27.removeAllAppenders();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
// flaky:         logger32.fatal((java.lang.Object) 100.0f, throwable36);
        org.apache.log4j.Level level38 = logger32.getEffectiveLevel();
        java.lang.Object[] objArray40 = null;
        java.lang.Throwable throwable41 = null;
// flaky:         logger27.l7dlog((org.apache.log4j.Priority) level38, "hi!", objArray40, throwable41);
// flaky:         category25.fatal((java.lang.Object) level38);
        java.lang.Throwable throwable45 = null;
// flaky:         logger1.l7dlog((org.apache.log4j.Priority) level38, "", throwable45);
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger48.debug((java.lang.Object) (byte) 1);
        boolean boolean51 = false; // flaky: logger48.isDebugEnabled();
        logger48.removeAppender("hi!");
        boolean boolean54 = false; // flaky: logger48.isInfoEnabled();
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle57 = null;
        logger56.setResourceBundle(resourceBundle57);
        logger56.removeAllAppenders();
// flaky:         logger48.fatal((java.lang.Object) logger56);
        io.cloudslang.lang.api.SlangImpl.logger = logger48;
        java.lang.Throwable throwable62 = null;
// flaky:         logger1.info((java.lang.Object) logger48, throwable62);
        java.lang.String str64 = logger48.getName();
        org.apache.log4j.Appender appender65 = null;
        logger48.removeAppender(appender65);
        io.cloudslang.lang.api.SlangImpl.logger = logger48;
        org.apache.log4j.spi.LoggingEvent loggingEvent68 = null;
        logger48.callAppenders(loggingEvent68);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(logger12);
// flaky:         org.junit.Assert.assertNotNull(level18);
        org.junit.Assert.assertNotNull(loggerRepository24);
        org.junit.Assert.assertNotNull(category25);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(logger32);
// flaky:         org.junit.Assert.assertNotNull(level38);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getLoggerRepository();
        java.util.ResourceBundle resourceBundle10 = null;
        logger1.setResourceBundle(resourceBundle10);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        boolean boolean13 = false; // flaky: logger1.isTraceEnabled();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger6.debug((java.lang.Object) (byte) 1);
        boolean boolean9 = false; // flaky: logger6.isDebugEnabled();
        java.util.Enumeration enumeration10 = logger6.getAllAppenders();
        java.lang.Throwable throwable11 = null;
// flaky:         logger1.error((java.lang.Object) logger6, throwable11);
        org.apache.log4j.Level level13 = logger1.getPriority();
// flaky:         logger1.info((java.lang.Object) (-1.0d));
        boolean boolean16 = logger1.getAdditivity();
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl17.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl17.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl17.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl17.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl17.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl17.compiler = slangCompiler25;
        io.cloudslang.score.api.Score score27 = slangImpl17.score;
        io.cloudslang.score.api.Score score28 = slangImpl17.score;
        io.cloudslang.score.api.Score score29 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl17.getAllEventTypes();
        java.lang.Throwable throwable31 = null;
// flaky:         logger1.error((java.lang.Object) strSet30, throwable31);
        org.apache.log4j.Appender appender34 = logger1.getAppender("hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(enumeration10);
// flaky:         org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(appender34);
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger2.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent4 = null;
        logger2.callAppenders(loggingEvent4);
        org.apache.log4j.Appender appender6 = null;
        boolean boolean7 = logger2.isAttached(appender6);
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getLoggerRepository();
        logger2.removeAppender("hi!");
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle13 = null;
        logger12.setResourceBundle(resourceBundle13);
        logger12.removeAllAppenders();
        org.apache.log4j.Category category16 = logger12.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository17 = logger12.getLoggerRepository();
        org.apache.log4j.Level level18 = logger12.getLevel();
        org.apache.log4j.Category category19 = logger12.getParent();
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl20.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl20.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl20.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl20.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl20.getAllEventTypes();
        java.lang.Throwable throwable31 = null;
// flaky:         category19.warn((java.lang.Object) slangImpl20, throwable31);
// flaky:         logger2.fatal((java.lang.Object) throwable31);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(loggerRepository17);
// flaky:         org.junit.Assert.assertNotNull(level18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Throwable throwable9 = null;
// flaky:         logger1.fatal((java.lang.Object) (byte) 10, throwable9);
        org.apache.log4j.Appender appender12 = logger1.getAppender("hi!");
        java.lang.String str13 = logger1.getName();
        org.apache.log4j.spi.LoggingEvent loggingEvent14 = null;
        logger1.callAppenders(loggingEvent14);
        org.apache.log4j.Appender appender16 = null;
        logger1.addAppender(appender16);
        org.apache.log4j.Level level18 = logger1.getEffectiveLevel();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNull(appender12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertNotNull(level18);
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        boolean boolean7 = false; // flaky: logger1.isDebugEnabled();
        java.lang.Throwable throwable9 = null;
// flaky:         logger1.trace((java.lang.Object) 10L, throwable9);
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        category12.removeAllAppenders();
        org.apache.log4j.Level level14 = category12.getPriority();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger16.debug((java.lang.Object) (byte) 1);
        boolean boolean19 = false; // flaky: logger16.isDebugEnabled();
        java.util.Enumeration enumeration20 = logger16.getAllAppenders();
        java.util.ResourceBundle resourceBundle21 = logger16.getResourceBundle();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
// flaky:         logger23.fatal((java.lang.Object) 100.0f, throwable27);
        org.apache.log4j.Level level29 = logger23.getEffectiveLevel();
// flaky:         logger23.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender32 = null;
        logger23.removeAppender(appender32);
        org.apache.log4j.Category category34 = logger23.getParent();
        org.apache.log4j.Logger logger36 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle37 = null;
        logger36.setResourceBundle(resourceBundle37);
        logger36.removeAllAppenders();
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle42 = null;
        logger41.setResourceBundle(resourceBundle42);
        java.lang.Throwable throwable45 = null;
// flaky:         logger41.fatal((java.lang.Object) 100.0f, throwable45);
        org.apache.log4j.Level level47 = logger41.getEffectiveLevel();
        java.lang.Object[] objArray49 = null;
        java.lang.Throwable throwable50 = null;
// flaky:         logger36.l7dlog((org.apache.log4j.Priority) level47, "hi!", objArray49, throwable50);
        boolean boolean52 = false; // flaky: category34.isEnabledFor((org.apache.log4j.Priority) level47);
        java.lang.Object obj53 = null;
        java.lang.Throwable throwable54 = null;
// flaky:         logger16.log((org.apache.log4j.Priority) level47, obj53, throwable54);
// flaky:         category12.debug(obj53);
        org.apache.log4j.Logger logger58 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle59 = null;
        logger58.setResourceBundle(resourceBundle59);
        java.lang.Throwable throwable62 = null;
// flaky:         logger58.fatal((java.lang.Object) 100.0f, throwable62);
        org.apache.log4j.spi.LoggerRepository loggerRepository64 = logger58.getHierarchy();
// flaky:         category12.info((java.lang.Object) logger58);
        org.apache.log4j.Appender appender67 = category12.getAppender("hi!");
        io.cloudslang.lang.api.SlangImpl slangImpl68 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus69 = slangImpl68.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler70 = null;
        slangImpl68.compiler = slangCompiler70;
        io.cloudslang.score.events.EventBus eventBus72 = slangImpl68.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler73 = null;
        slangImpl68.compiler = slangCompiler73;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler75 = slangImpl68.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler76 = null;
        slangImpl68.compiler = slangCompiler76;
        io.cloudslang.score.api.Score score78 = slangImpl68.score;
        java.util.Set<java.lang.String> strSet79 = slangImpl68.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus80 = slangImpl68.eventBus;
        java.util.Set<java.lang.String> strSet81 = slangImpl68.getAllEventTypes();
        java.util.Set<java.lang.String> strSet82 = slangImpl68.getAllEventTypes();
        java.util.Set<java.lang.String> strSet83 = slangImpl68.getAllEventTypes();
// flaky:         category12.info((java.lang.Object) slangImpl68);
        boolean boolean85 = category12.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(enumeration20);
        org.junit.Assert.assertNull(resourceBundle21);
        org.junit.Assert.assertNotNull(logger23);
// flaky:         org.junit.Assert.assertNotNull(level29);
        org.junit.Assert.assertNotNull(category34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(logger41);
// flaky:         org.junit.Assert.assertNotNull(level47);
// flaky:         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(logger58);
        org.junit.Assert.assertNotNull(loggerRepository64);
        org.junit.Assert.assertNull(appender67);
        org.junit.Assert.assertNull(eventBus69);
        org.junit.Assert.assertNull(eventBus72);
        org.junit.Assert.assertNull(slangCompiler75);
        org.junit.Assert.assertNull(score78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNull(eventBus80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl7.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl7.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl7.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl7.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl7.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl7.getAllEventTypes();
// flaky:         logger1.debug((java.lang.Object) slangImpl7);
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl7.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = null;
        slangImpl22.score = score23;
        io.cloudslang.score.api.Score score25 = slangImpl22.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl22.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl22.compiler = slangCompiler27;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl22.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl7.subscribeOnEvents(scoreEventListener21, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle6 = null;
        logger5.setResourceBundle(resourceBundle6);
        java.lang.Throwable throwable9 = null;
// flaky:         logger5.fatal((java.lang.Object) 100.0f, throwable9);
        boolean boolean11 = false; // flaky: logger5.isDebugEnabled();
        org.apache.log4j.Appender appender12 = null;
        logger5.addAppender(appender12);
        logger5.removeAllAppenders();
        java.util.ResourceBundle resourceBundle15 = null;
        logger5.setResourceBundle(resourceBundle15);
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl17.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl17.compiler;
// flaky:         logger5.fatal((java.lang.Object) slangImpl17);
        java.lang.Throwable throwable23 = null;
// flaky:         category1.info((java.lang.Object) logger5, throwable23);
// flaky:         logger5.assertLog(false, "hi!");
        org.apache.log4j.Level level28 = logger5.getLevel();
        org.apache.log4j.spi.LoggingEvent loggingEvent29 = null;
        logger5.callAppenders(loggingEvent29);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler21);
// flaky:         org.junit.Assert.assertNotNull(level28);
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass13);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass13);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass13);
        org.apache.log4j.spi.LoggerRepository loggerRepository17 = logger16.getHierarchy();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(loggerRepository17);
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Priority priority7 = logger1.getChainedPriority();
        java.lang.String str8 = logger1.getName();
        org.apache.log4j.Level level9 = logger1.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl10.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl10.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl10.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl10.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl10.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl10.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl10.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl10.getAllEventTypes();
        java.lang.Throwable throwable26 = null;
// flaky:         logger1.info((java.lang.Object) slangImpl10, throwable26);
        java.util.Set<java.lang.String> strSet28 = slangImpl10.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangSource slangSource30 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray31 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet32 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet32, slangSourceArray31);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact34 = slangImpl10.compile(slangSource30, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(priority7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(slangSourceArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = false; // flaky: logger1.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        java.lang.Throwable throwable13 = null;
// flaky:         logger1.info((java.lang.Object) slangImpl9, throwable13);
        java.lang.String str15 = logger1.getName();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level17 = logger1.getPriority();
        boolean boolean18 = false; // flaky: logger1.isTraceEnabled();
        java.util.Enumeration enumeration19 = logger1.getAllAppenders();
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender22 = null;
        logger21.addAppender(appender22);
        org.apache.log4j.Priority priority24 = logger21.getChainedPriority();
        org.apache.log4j.Level level25 = logger21.getPriority();
// flaky:         logger1.trace((java.lang.Object) logger21);
        java.util.Enumeration enumeration27 = logger1.getAllAppenders();
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger("hi!");
        org.apache.log4j.Logger logger31 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle32 = null;
        logger31.setResourceBundle(resourceBundle32);
        java.lang.Throwable throwable35 = null;
// flaky:         logger31.fatal((java.lang.Object) 100.0f, throwable35);
        org.apache.log4j.Level level37 = logger31.getEffectiveLevel();
        boolean boolean38 = false; // flaky: logger31.isInfoEnabled();
        org.apache.log4j.Logger logger40 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger40.debug((java.lang.Object) (byte) 1);
        boolean boolean43 = false; // flaky: logger40.isDebugEnabled();
        logger40.removeAppender("hi!");
        org.apache.log4j.Logger logger47 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle48 = null;
        logger47.setResourceBundle(resourceBundle48);
        java.lang.Throwable throwable51 = null;
// flaky:         logger47.fatal((java.lang.Object) 100.0f, throwable51);
        org.apache.log4j.Level level53 = logger47.getEffectiveLevel();
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle56 = null;
        logger55.setResourceBundle(resourceBundle56);
        java.lang.Throwable throwable59 = null;
// flaky:         logger55.fatal((java.lang.Object) 100.0f, throwable59);
        boolean boolean61 = false; // flaky: logger55.isDebugEnabled();
// flaky:         logger40.log((org.apache.log4j.Priority) level53, (java.lang.Object) boolean61);
        org.apache.log4j.Priority priority63 = logger40.getChainedPriority();
        org.apache.log4j.Logger logger65 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender66 = null;
        logger65.addAppender(appender66);
        org.apache.log4j.spi.LoggerRepository loggerRepository68 = logger65.getHierarchy();
        org.apache.log4j.Logger logger70 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle71 = null;
        logger70.setResourceBundle(resourceBundle71);
        java.lang.Throwable throwable74 = null;
// flaky:         logger70.fatal((java.lang.Object) 100.0f, throwable74);
        org.apache.log4j.Level level76 = logger70.getEffectiveLevel();
        java.lang.Throwable throwable78 = null;
// flaky:         logger65.l7dlog((org.apache.log4j.Priority) level76, "hi!", throwable78);
        java.lang.Throwable throwable80 = null;
// flaky:         logger40.warn((java.lang.Object) level76, throwable80);
        io.cloudslang.lang.api.SlangImpl slangImpl82 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus83 = slangImpl82.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler84 = null;
        slangImpl82.compiler = slangCompiler84;
        io.cloudslang.score.events.EventBus eventBus86 = slangImpl82.eventBus;
        java.lang.Throwable throwable87 = null;
// flaky:         logger31.log((org.apache.log4j.Priority) level76, (java.lang.Object) slangImpl82, throwable87);
        java.util.Set<java.lang.String> strSet89 = slangImpl82.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler90 = slangImpl82.compiler;
        java.lang.Throwable throwable91 = null;
// flaky:         logger29.debug((java.lang.Object) slangCompiler90, throwable91);
        logger29.setAdditivity(true);
// flaky:         logger1.error((java.lang.Object) logger29);
        logger29.removeAppender("org.apache.log4j.Level");
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertNotNull(level17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(enumeration19);
        org.junit.Assert.assertNotNull(logger21);
// flaky:         org.junit.Assert.assertNotNull(priority24);
// flaky:         org.junit.Assert.assertNotNull(level25);
        org.junit.Assert.assertNull(enumeration27);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(logger31);
// flaky:         org.junit.Assert.assertNotNull(level37);
// flaky:         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(logger47);
// flaky:         org.junit.Assert.assertNotNull(level53);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertNotNull(priority63);
        org.junit.Assert.assertNotNull(logger65);
        org.junit.Assert.assertNotNull(loggerRepository68);
        org.junit.Assert.assertNotNull(logger70);
// flaky:         org.junit.Assert.assertNotNull(level76);
        org.junit.Assert.assertNull(eventBus83);
        org.junit.Assert.assertNull(eventBus86);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNull(slangCompiler90);
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.Level level9 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level10 = logger1.getEffectiveLevel();
        java.util.Enumeration enumeration11 = logger1.getAllAppenders();
        org.apache.log4j.Category category12 = logger1.getParent();
        java.util.Enumeration enumeration13 = logger1.getAllAppenders();
        org.apache.log4j.Priority priority14 = logger1.getChainedPriority();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger16.debug((java.lang.Object) (byte) 1);
        boolean boolean19 = false; // flaky: logger16.isDebugEnabled();
        logger16.removeAppender("hi!");
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
// flaky:         logger23.fatal((java.lang.Object) 100.0f, throwable27);
        org.apache.log4j.Level level29 = logger23.getEffectiveLevel();
        org.apache.log4j.Logger logger31 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle32 = null;
        logger31.setResourceBundle(resourceBundle32);
        java.lang.Throwable throwable35 = null;
// flaky:         logger31.fatal((java.lang.Object) 100.0f, throwable35);
        boolean boolean37 = false; // flaky: logger31.isDebugEnabled();
// flaky:         logger16.log((org.apache.log4j.Priority) level29, (java.lang.Object) boolean37);
        org.apache.log4j.Priority priority39 = logger16.getChainedPriority();
// flaky:         logger16.warn((java.lang.Object) (byte) -1);
        io.cloudslang.lang.api.SlangImpl.logger = logger16;
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender45 = null;
        logger44.addAppender(appender45);
        org.apache.log4j.spi.LoggerRepository loggerRepository47 = logger44.getHierarchy();
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger49.debug((java.lang.Object) (byte) 1);
        boolean boolean52 = false; // flaky: logger49.isDebugEnabled();
        logger49.removeAppender("hi!");
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle57 = null;
        logger56.setResourceBundle(resourceBundle57);
        java.lang.Throwable throwable60 = null;
// flaky:         logger56.fatal((java.lang.Object) 100.0f, throwable60);
        org.apache.log4j.Level level62 = logger56.getEffectiveLevel();
        org.apache.log4j.Logger logger64 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle65 = null;
        logger64.setResourceBundle(resourceBundle65);
        java.lang.Throwable throwable68 = null;
// flaky:         logger64.fatal((java.lang.Object) 100.0f, throwable68);
        boolean boolean70 = false; // flaky: logger64.isDebugEnabled();
// flaky:         logger49.log((org.apache.log4j.Priority) level62, (java.lang.Object) boolean70);
        org.apache.log4j.Category category72 = org.apache.log4j.Category.getRoot();
        java.lang.Throwable throwable73 = null;
// flaky:         logger44.log((org.apache.log4j.Priority) level62, (java.lang.Object) category72, throwable73);
        java.util.ResourceBundle resourceBundle75 = category72.getResourceBundle();
        org.apache.log4j.Priority priority76 = category72.getChainedPriority();
        org.apache.log4j.Logger logger78 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger78.debug((java.lang.Object) (byte) 1);
        boolean boolean81 = false; // flaky: logger78.isDebugEnabled();
        logger78.removeAppender("hi!");
        org.apache.log4j.Level level84 = logger78.getEffectiveLevel();
        org.apache.log4j.Appender appender85 = null;
        logger78.addAppender(appender85);
        java.lang.Throwable throwable87 = null;
// flaky:         logger16.log(priority76, (java.lang.Object) appender85, throwable87);
        java.lang.Throwable throwable90 = null;
// flaky:         logger1.l7dlog(priority76, "io.cloudslang.lang.api.SlangImpl", throwable90);
        org.apache.log4j.Appender appender93 = logger1.getAppender("org.apache.log4j.Level");
        org.apache.log4j.spi.LoggerRepository loggerRepository94 = logger1.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertNotNull(level9);
// flaky:         org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNull(enumeration11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNull(enumeration13);
// flaky:         org.junit.Assert.assertNotNull(priority14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(logger23);
// flaky:         org.junit.Assert.assertNotNull(level29);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertNotNull(priority39);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertNotNull(loggerRepository47);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(logger56);
// flaky:         org.junit.Assert.assertNotNull(level62);
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(category72);
        org.junit.Assert.assertNull(resourceBundle75);
// flaky:         org.junit.Assert.assertNotNull(priority76);
        org.junit.Assert.assertNotNull(logger78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertNotNull(level84);
        org.junit.Assert.assertNull(appender93);
        org.junit.Assert.assertNotNull(loggerRepository94);
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = null; // flaky: logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
// flaky:         logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = null; // flaky: logger1.getParent();
        java.util.Enumeration enumeration7 = null; // flaky: logger1.getAllAppenders();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.lang.Class<?> wildcardClass10 = logger9.getClass();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass10);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        java.lang.Object obj13 = null;
// flaky:         category12.warn(obj13);
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl15.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl15.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl15.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl15.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl15.score = score26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl15.score = score28;
        java.lang.Class<?> wildcardClass30 = slangImpl15.getClass();
        org.apache.log4j.Logger logger31 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass30);
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass30);
        io.cloudslang.lang.api.SlangImpl.logger = logger32;
        org.apache.log4j.spi.LoggingEvent loggingEvent34 = null;
        logger32.callAppenders(loggingEvent34);
        java.lang.String str36 = logger32.getName();
        java.lang.Throwable throwable37 = null;
// flaky:         category12.debug((java.lang.Object) logger32, throwable37);
        org.apache.log4j.spi.LoggerFactory loggerFactory40 = null;
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory40);
        boolean boolean42 = false; // flaky: logger41.isTraceEnabled();
        org.apache.log4j.Level level43 = logger41.getPriority();
        logger32.setLevel(level43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = logger1.isEnabledFor((org.apache.log4j.Priority) level43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
// flaky:         org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "io.cloudslang.lang.api.SlangImpl" + "'", str36, "io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(level43);
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = false; // flaky: logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle8 = null;
        logger7.setResourceBundle(resourceBundle8);
        logger7.removeAllAppenders();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle13 = null;
        logger12.setResourceBundle(resourceBundle13);
        java.lang.Throwable throwable16 = null;
// flaky:         logger12.fatal((java.lang.Object) 100.0f, throwable16);
        org.apache.log4j.Level level18 = logger12.getEffectiveLevel();
        java.lang.Object[] objArray20 = null;
        java.lang.Throwable throwable21 = null;
// flaky:         logger7.l7dlog((org.apache.log4j.Priority) level18, "hi!", objArray20, throwable21);
// flaky:         logger1.error((java.lang.Object) objArray20);
        org.apache.log4j.spi.LoggerRepository loggerRepository24 = logger1.getHierarchy();
        org.apache.log4j.Category category25 = org.apache.log4j.Category.getRoot();
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle28 = null;
        logger27.setResourceBundle(resourceBundle28);
        logger27.removeAllAppenders();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
// flaky:         logger32.fatal((java.lang.Object) 100.0f, throwable36);
        org.apache.log4j.Level level38 = logger32.getEffectiveLevel();
        java.lang.Object[] objArray40 = null;
        java.lang.Throwable throwable41 = null;
// flaky:         logger27.l7dlog((org.apache.log4j.Priority) level38, "hi!", objArray40, throwable41);
// flaky:         category25.fatal((java.lang.Object) level38);
        java.lang.Throwable throwable45 = null;
// flaky:         logger1.l7dlog((org.apache.log4j.Priority) level38, "", throwable45);
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger48.debug((java.lang.Object) (byte) 1);
        boolean boolean51 = false; // flaky: logger48.isDebugEnabled();
        logger48.removeAppender("hi!");
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle56 = null;
        logger55.setResourceBundle(resourceBundle56);
        java.lang.Throwable throwable59 = null;
// flaky:         logger55.fatal((java.lang.Object) 100.0f, throwable59);
        org.apache.log4j.Level level61 = logger55.getEffectiveLevel();
        org.apache.log4j.Logger logger63 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle64 = null;
        logger63.setResourceBundle(resourceBundle64);
        java.lang.Throwable throwable67 = null;
// flaky:         logger63.fatal((java.lang.Object) 100.0f, throwable67);
        boolean boolean69 = false; // flaky: logger63.isDebugEnabled();
// flaky:         logger48.log((org.apache.log4j.Priority) level61, (java.lang.Object) boolean69);
        org.apache.log4j.Priority priority71 = logger48.getChainedPriority();
// flaky:         logger1.log(priority71, (java.lang.Object) (-1.0d));
        org.apache.log4j.Level level74 = logger1.getEffectiveLevel();
        org.apache.log4j.Logger logger76 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle77 = null;
        logger76.setResourceBundle(resourceBundle77);
        logger76.removeAllAppenders();
        org.apache.log4j.Category category80 = logger76.getParent();
        java.lang.String str81 = logger76.getName();
        org.apache.log4j.Level level82 = logger76.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl83 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus84 = slangImpl83.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler85 = null;
        slangImpl83.compiler = slangCompiler85;
        io.cloudslang.score.api.Score score87 = slangImpl83.score;
        io.cloudslang.score.events.EventBus eventBus88 = slangImpl83.eventBus;
        java.util.Set<java.lang.String> strSet89 = slangImpl83.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler90 = null;
        slangImpl83.compiler = slangCompiler90;
        io.cloudslang.score.events.EventBus eventBus92 = null;
        slangImpl83.eventBus = eventBus92;
        io.cloudslang.score.events.EventBus eventBus94 = slangImpl83.eventBus;
        java.util.Set<java.lang.String> strSet95 = slangImpl83.getAllEventTypes();
// flaky:         logger1.log((org.apache.log4j.Priority) level82, (java.lang.Object) slangImpl83);
        org.apache.log4j.Appender appender97 = null;
        boolean boolean98 = logger1.isAttached(appender97);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(logger12);
// flaky:         org.junit.Assert.assertNotNull(level18);
        org.junit.Assert.assertNotNull(loggerRepository24);
        org.junit.Assert.assertNotNull(category25);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(logger32);
// flaky:         org.junit.Assert.assertNotNull(level38);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(logger55);
// flaky:         org.junit.Assert.assertNotNull(level61);
        org.junit.Assert.assertNotNull(logger63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
// flaky:         org.junit.Assert.assertNotNull(priority71);
// flaky:         org.junit.Assert.assertNotNull(level74);
        org.junit.Assert.assertNotNull(logger76);
        org.junit.Assert.assertNotNull(category80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
// flaky:         org.junit.Assert.assertNotNull(level82);
        org.junit.Assert.assertNull(eventBus84);
        org.junit.Assert.assertNull(score87);
        org.junit.Assert.assertNull(eventBus88);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNull(eventBus94);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.lang.String str3 = logger2.getName();
        boolean boolean4 = logger2.getAdditivity();
        boolean boolean5 = false; // flaky: logger2.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        org.apache.log4j.Category category3 = logger2.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger2.getHierarchy();
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender7 = null;
        boolean boolean8 = category6.isAttached(appender7);
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = category6.isAttached(appender9);
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level13 = logger12.getEffectiveLevel();
        java.lang.String str14 = logger12.getName();
        boolean boolean15 = false; // flaky: logger12.isInfoEnabled();
        java.lang.String str16 = logger12.getName();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle19 = null;
        logger18.setResourceBundle(resourceBundle19);
        java.lang.Throwable throwable22 = null;
// flaky:         logger18.fatal((java.lang.Object) 100.0f, throwable22);
        org.apache.log4j.Priority priority24 = logger18.getChainedPriority();
        logger18.removeAppender("");
        logger18.setAdditivity(true);
        org.apache.log4j.Logger logger30 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger30.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Logger logger34 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle35 = null;
        logger34.setResourceBundle(resourceBundle35);
        java.lang.Throwable throwable38 = null;
// flaky:         logger34.fatal((java.lang.Object) 100.0f, throwable38);
        org.apache.log4j.Level level40 = logger34.getEffectiveLevel();
// flaky:         logger34.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender43 = null;
        logger34.removeAppender(appender43);
        org.apache.log4j.Category category45 = logger34.getParent();
        org.apache.log4j.Logger logger47 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle48 = null;
        logger47.setResourceBundle(resourceBundle48);
        logger47.removeAllAppenders();
        org.apache.log4j.Logger logger52 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle53 = null;
        logger52.setResourceBundle(resourceBundle53);
        java.lang.Throwable throwable56 = null;
// flaky:         logger52.fatal((java.lang.Object) 100.0f, throwable56);
        org.apache.log4j.Level level58 = logger52.getEffectiveLevel();
        java.lang.Object[] objArray60 = null;
        java.lang.Throwable throwable61 = null;
// flaky:         logger47.l7dlog((org.apache.log4j.Priority) level58, "hi!", objArray60, throwable61);
        boolean boolean63 = false; // flaky: category45.isEnabledFor((org.apache.log4j.Priority) level58);
        logger30.setLevel(level58);
        logger18.setPriority((org.apache.log4j.Priority) level58);
        org.apache.log4j.Level level66 = logger18.getPriority();
        java.lang.Throwable throwable67 = null;
// flaky:         logger12.error((java.lang.Object) level66, throwable67);
        boolean boolean69 = false; // flaky: category6.isEnabledFor((org.apache.log4j.Priority) level66);
        io.cloudslang.lang.api.SlangImpl slangImpl70 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus71 = slangImpl70.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler72 = null;
        slangImpl70.compiler = slangCompiler72;
        io.cloudslang.score.events.EventBus eventBus74 = slangImpl70.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler75 = null;
        slangImpl70.compiler = slangCompiler75;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler77 = slangImpl70.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler78 = null;
        slangImpl70.compiler = slangCompiler78;
        io.cloudslang.score.api.Score score80 = slangImpl70.score;
        java.util.Set<java.lang.String> strSet81 = slangImpl70.getAllEventTypes();
        java.util.Set<java.lang.String> strSet82 = slangImpl70.getAllEventTypes();
        java.lang.Class<?> wildcardClass83 = slangImpl70.getClass();
        org.apache.log4j.Category category84 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass83);
        org.apache.log4j.Category category85 = category84.getParent();
        java.lang.Throwable throwable86 = null;
// flaky:         logger2.log((org.apache.log4j.Priority) level66, (java.lang.Object) category84, throwable86);
        io.cloudslang.lang.api.SlangImpl slangImpl88 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus89 = slangImpl88.eventBus;
        io.cloudslang.score.events.EventBus eventBus90 = slangImpl88.eventBus;
        io.cloudslang.score.api.Score score91 = slangImpl88.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler92 = slangImpl88.compiler;
        java.util.Set<java.lang.String> strSet93 = slangImpl88.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler94 = slangImpl88.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler95 = null;
        slangImpl88.compiler = slangCompiler95;
        java.lang.Throwable throwable97 = null;
// flaky:         logger2.trace((java.lang.Object) slangCompiler95, throwable97);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category3);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(logger12);
// flaky:         org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(logger18);
// flaky:         org.junit.Assert.assertNotNull(priority24);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertNotNull(logger34);
// flaky:         org.junit.Assert.assertNotNull(level40);
        org.junit.Assert.assertNotNull(category45);
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertNotNull(logger52);
// flaky:         org.junit.Assert.assertNotNull(level58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
// flaky:         org.junit.Assert.assertNotNull(level66);
// flaky:         org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(eventBus71);
        org.junit.Assert.assertNull(eventBus74);
        org.junit.Assert.assertNull(slangCompiler77);
        org.junit.Assert.assertNull(score80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(category84);
        org.junit.Assert.assertNotNull(category85);
        org.junit.Assert.assertNull(eventBus89);
        org.junit.Assert.assertNull(eventBus90);
        org.junit.Assert.assertNull(score91);
        org.junit.Assert.assertNull(slangCompiler92);
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNull(slangCompiler94);
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
// flaky:         logger1.fatal((java.lang.Object) 100.0f, throwable5);
        boolean boolean7 = false; // flaky: logger1.isDebugEnabled();
        java.lang.Throwable throwable9 = null;
// flaky:         logger1.trace((java.lang.Object) 10L, throwable9);
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Level level15 = logger14.getPriority();
        boolean boolean16 = logger14.getAdditivity();
        io.cloudslang.lang.api.SlangImpl.logger = logger14;
        org.apache.log4j.Priority priority18 = logger14.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNull(level15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(priority18);
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
// flaky:         logger1.fatal((java.lang.Object) 10.0f);
        logger1.assertLog(true, "hi!");
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getRoot();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle12 = null;
        logger11.setResourceBundle(resourceBundle12);
        java.lang.Throwable throwable15 = null;
// flaky:         logger11.fatal((java.lang.Object) 100.0f, throwable15);
        org.apache.log4j.Level level17 = logger11.getEffectiveLevel();
        category9.setPriority((org.apache.log4j.Priority) level17);
        org.apache.log4j.Appender appender19 = null;
        category9.removeAppender(appender19);
        org.apache.log4j.spi.LoggingEvent loggingEvent21 = null;
        category9.callAppenders(loggingEvent21);
        org.apache.log4j.Level level23 = category9.getEffectiveLevel();
        boolean boolean24 = false; // flaky: logger1.isEnabledFor((org.apache.log4j.Priority) level23);
        boolean boolean25 = false; // flaky: logger1.isInfoEnabled();
        org.apache.log4j.spi.LoggerRepository loggerRepository26 = logger1.getHierarchy();
        org.apache.log4j.spi.LoggerRepository loggerRepository27 = logger1.getLoggerRepository();
        java.util.ResourceBundle resourceBundle28 = logger1.getResourceBundle();
        org.apache.log4j.Logger logger30 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger30.debug((java.lang.Object) (byte) 1);
        boolean boolean33 = false; // flaky: logger30.isDebugEnabled();
        logger30.removeAppender("hi!");
        boolean boolean36 = false; // flaky: logger30.isInfoEnabled();
        org.apache.log4j.Logger logger38 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle39 = null;
        logger38.setResourceBundle(resourceBundle39);
        logger38.removeAllAppenders();
// flaky:         logger30.fatal((java.lang.Object) logger38);
        logger30.removeAllAppenders();
        java.lang.Throwable throwable44 = null;
// flaky:         logger1.debug((java.lang.Object) logger30, throwable44);
        io.cloudslang.lang.api.SlangImpl.logger = logger30;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(logger11);
// flaky:         org.junit.Assert.assertNotNull(level17);
// flaky:         org.junit.Assert.assertNotNull(level23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(loggerRepository26);
        org.junit.Assert.assertNotNull(loggerRepository27);
        org.junit.Assert.assertNull(resourceBundle28);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(logger38);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        java.util.ResourceBundle resourceBundle16 = logger15.getResourceBundle();
        boolean boolean17 = logger15.getAdditivity();
        boolean boolean18 = logger15.getAdditivity();
        org.apache.log4j.Priority priority19 = logger15.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository20 = logger15.getLoggerRepository();
        logger15.removeAllAppenders();
        org.apache.log4j.Level level22 = logger15.getLevel();
        org.apache.log4j.Logger logger24 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger24;
        java.lang.Object obj26 = null;
        java.lang.Throwable throwable27 = null;
// flaky:         logger24.fatal(obj26, throwable27);
        boolean boolean29 = false; // flaky: logger24.isTraceEnabled();
        org.apache.log4j.spi.LoggingEvent loggingEvent30 = null;
        logger24.callAppenders(loggingEvent30);
        org.apache.log4j.spi.LoggerRepository loggerRepository32 = logger24.getLoggerRepository();
        org.apache.log4j.Level level33 = logger24.getEffectiveLevel();
// flaky:         logger15.info((java.lang.Object) logger24);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNull(resourceBundle16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertNotNull(priority19);
        org.junit.Assert.assertNotNull(loggerRepository20);
// flaky:         org.junit.Assert.assertNotNull(level22);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(loggerRepository32);
// flaky:         org.junit.Assert.assertNotNull(level33);
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
// flaky:         logger1.fatal((java.lang.Object) 10.0f);
        logger1.assertLog(true, "hi!");
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getRoot();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle12 = null;
        logger11.setResourceBundle(resourceBundle12);
        java.lang.Throwable throwable15 = null;
// flaky:         logger11.fatal((java.lang.Object) 100.0f, throwable15);
        org.apache.log4j.Level level17 = logger11.getEffectiveLevel();
        category9.setPriority((org.apache.log4j.Priority) level17);
        org.apache.log4j.Appender appender19 = null;
        category9.removeAppender(appender19);
        org.apache.log4j.spi.LoggingEvent loggingEvent21 = null;
        category9.callAppenders(loggingEvent21);
        org.apache.log4j.Level level23 = category9.getEffectiveLevel();
        boolean boolean24 = false; // flaky: logger1.isEnabledFor((org.apache.log4j.Priority) level23);
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle27 = null;
        logger26.setResourceBundle(resourceBundle27);
        logger26.removeAllAppenders();
        org.apache.log4j.Logger logger31 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle32 = null;
        logger31.setResourceBundle(resourceBundle32);
        java.lang.Throwable throwable35 = null;
// flaky:         logger31.fatal((java.lang.Object) 100.0f, throwable35);
        org.apache.log4j.Level level37 = logger31.getEffectiveLevel();
        java.lang.Object[] objArray39 = null;
        java.lang.Throwable throwable40 = null;
// flaky:         logger26.l7dlog((org.apache.log4j.Priority) level37, "hi!", objArray39, throwable40);
        org.apache.log4j.Logger logger43 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger43.debug((java.lang.Object) (byte) 1);
        java.lang.Object obj46 = null;
// flaky:         logger43.info(obj46);
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("hi!");
        org.apache.log4j.Logger logger51 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle52 = null;
        logger51.setResourceBundle(resourceBundle52);
        logger51.removeAllAppenders();
        org.apache.log4j.Category category55 = logger51.getParent();
        org.apache.log4j.Logger logger57 = org.apache.log4j.Logger.getLogger("");
// flaky:         logger57.debug((java.lang.Object) (byte) 1);
        boolean boolean60 = false; // flaky: logger57.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger57;
        java.lang.Class<?> wildcardClass62 = logger57.getClass();
        java.lang.Throwable throwable63 = null;
// flaky:         logger51.debug((java.lang.Object) wildcardClass62, throwable63);
        org.apache.log4j.Priority priority65 = logger51.getChainedPriority();
        java.lang.Throwable throwable66 = null;
// flaky:         logger49.trace((java.lang.Object) priority65, throwable66);
// flaky:         logger49.fatal((java.lang.Object) 1);
// flaky:         logger43.debug((java.lang.Object) 1);
        java.lang.Throwable throwable71 = null;
// flaky:         logger26.trace((java.lang.Object) logger43, throwable71);
        org.apache.log4j.Level level73 = logger43.getPriority();
        java.util.ResourceBundle resourceBundle74 = null;
        logger43.setResourceBundle(resourceBundle74);
        io.cloudslang.lang.api.SlangImpl slangImpl76 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus77 = slangImpl76.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler78 = null;
        slangImpl76.compiler = slangCompiler78;
        io.cloudslang.score.events.EventBus eventBus80 = slangImpl76.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler81 = null;
        slangImpl76.compiler = slangCompiler81;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler83 = slangImpl76.compiler;
        io.cloudslang.score.events.EventBus eventBus84 = slangImpl76.eventBus;
        java.util.Set<java.lang.String> strSet85 = slangImpl76.getAllEventTypes();
        java.lang.Throwable throwable86 = null;
// flaky:         logger43.warn((java.lang.Object) strSet85, throwable86);
        org.apache.log4j.spi.LoggingEvent loggingEvent88 = null;
        logger43.callAppenders(loggingEvent88);
        java.lang.Throwable throwable90 = null;
// flaky:         logger1.info((java.lang.Object) loggingEvent88, throwable90);
        org.apache.log4j.spi.LoggerRepository loggerRepository92 = logger1.getHierarchy();
        logger1.setAdditivity(false);
        boolean boolean95 = logger1.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(logger11);
// flaky:         org.junit.Assert.assertNotNull(level17);
// flaky:         org.junit.Assert.assertNotNull(level23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger31);
// flaky:         org.junit.Assert.assertNotNull(level37);
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(logger51);
        org.junit.Assert.assertNotNull(category55);
        org.junit.Assert.assertNotNull(logger57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
// flaky:         org.junit.Assert.assertNotNull(priority65);
        org.junit.Assert.assertNull(level73);
        org.junit.Assert.assertNull(eventBus77);
        org.junit.Assert.assertNull(eventBus80);
        org.junit.Assert.assertNull(slangCompiler83);
        org.junit.Assert.assertNull(eventBus84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(loggerRepository92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }
}
