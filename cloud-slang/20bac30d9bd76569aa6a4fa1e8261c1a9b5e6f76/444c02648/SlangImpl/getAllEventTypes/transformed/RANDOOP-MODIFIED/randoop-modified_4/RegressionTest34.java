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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangSource slangSource14 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray15 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet16 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet16, slangSourceArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact18 = slangImpl0.compile(slangSource14, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        org.apache.log4j.Category category6 = category5.getParent();
        org.apache.log4j.Appender appender7 = null;
        boolean boolean8 = category5.isAttached(appender7);
        java.lang.Class<?> wildcardClass9 = category5.getClass();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl11.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl11.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl11.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl11.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl11.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl11.compiler;
        java.lang.Class<?> wildcardClass25 = slangImpl11.getClass();
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        org.apache.log4j.Category category27 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass25);
        org.apache.log4j.Category category28 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass25);
        org.apache.log4j.Level level29 = category28.getLevel();
        java.lang.Throwable throwable30 = null;
        logger10.trace((java.lang.Object) level29, throwable30);
        org.apache.log4j.Appender appender32 = null;
        logger10.addAppender(appender32);
        io.cloudslang.lang.api.SlangImpl.logger = logger10;
        org.apache.log4j.Category category35 = logger10.getParent();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(category28);
        org.junit.Assert.assertNull(level29);
        org.junit.Assert.assertNotNull(category35);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger1.getHierarchy();
        logger1.assertLog(true, "org.apache.log4j.Logger");
        org.apache.log4j.spi.LoggerFactory loggerFactory12 = null;
        org.apache.log4j.Logger logger13 = null; // flaky: org.apache.log4j.Logger.getLogger("root", loggerFactory12);
        org.apache.log4j.Appender appender14 = null;
// flaky:         logger13.removeAppender(appender14);
        org.apache.log4j.Appender appender16 = null;
// flaky:         logger13.removeAppender(appender16);
        java.util.Enumeration enumeration18 = null; // flaky: logger13.getAllAppenders();
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender21 = null;
        category20.addAppender(appender21);
        category20.setAdditivity(true);
        java.lang.String str25 = category20.getName();
        category20.removeAppender("org.apache.log4j.Logger");
        org.apache.log4j.Level level28 = category20.getLevel();
        java.lang.Throwable throwable29 = null;
// flaky:         logger13.warn((java.lang.Object) level28, throwable29);
        org.apache.log4j.Level level31 = null; // flaky: logger13.getEffectiveLevel();
        logger1.setPriority((org.apache.log4j.Priority) level31);
        org.apache.log4j.Category category34 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender35 = null;
        boolean boolean36 = category34.isAttached(appender35);
        org.apache.log4j.Appender appender37 = null;
        boolean boolean38 = category34.isAttached(appender37);
        org.apache.log4j.spi.LoggerRepository loggerRepository39 = category34.getLoggerRepository();
        org.apache.log4j.Category category40 = category34.getParent();
        org.apache.log4j.Priority priority41 = category34.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository42 = category34.getHierarchy();
        java.lang.String str43 = category34.getName();
        org.apache.log4j.Level level44 = category34.getEffectiveLevel();
        java.lang.Throwable throwable45 = null;
        logger1.info((java.lang.Object) level44, throwable45);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository7);
// flaky:         org.junit.Assert.assertNotNull(logger13);
// flaky:         org.junit.Assert.assertNotNull(enumeration18);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(level28);
// flaky:         org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertNotNull(category34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(loggerRepository39);
        org.junit.Assert.assertNotNull(category40);
        org.junit.Assert.assertNotNull(priority41);
        org.junit.Assert.assertNotNull(loggerRepository42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(level44);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Category category7 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Appender appender10 = category8.getAppender("root");
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl11.eventBus = eventBus12;
        category8.warn((java.lang.Object) eventBus12);
        org.apache.log4j.spi.LoggerRepository loggerRepository15 = category8.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl16.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl16.compiler;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl16.score = score21;
        java.util.Set<java.lang.String> strSet23 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl16.getAllEventTypes();
        category8.debug((java.lang.Object) slangImpl16);
        java.util.Set<java.lang.String> strSet26 = slangImpl16.getAllEventTypes();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNull(appender10);
        org.junit.Assert.assertNotNull(loggerRepository15);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        org.apache.log4j.Category category6 = category5.getParent();
        org.apache.log4j.Appender appender7 = null;
        boolean boolean8 = category5.isAttached(appender7);
        org.apache.log4j.Category category9 = category5.getParent();
        category5.setAdditivity(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = category5.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(category9);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
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
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
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
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
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
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        logger2.assertLog(true, "root");
        logger2.removeAllAppenders();
        org.apache.log4j.Level level7 = logger2.getEffectiveLevel();
        org.apache.log4j.Level level8 = logger2.getEffectiveLevel();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(level8);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        java.lang.Throwable throwable13 = null;
        logger9.fatal((java.lang.Object) 100.0f, throwable13);
        org.apache.log4j.Level level15 = logger9.getEffectiveLevel();
        java.lang.Object obj16 = null;
        logger9.debug(obj16);
        logger9.assertLog(true, "");
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("");
        logger22.debug((java.lang.Object) (byte) 1);
        boolean boolean25 = logger22.isDebugEnabled();
        logger22.removeAppender("hi!");
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle30 = null;
        logger29.setResourceBundle(resourceBundle30);
        java.lang.Throwable throwable33 = null;
        logger29.fatal((java.lang.Object) 100.0f, throwable33);
        org.apache.log4j.Level level35 = logger29.getEffectiveLevel();
        org.apache.log4j.Logger logger37 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle38 = null;
        logger37.setResourceBundle(resourceBundle38);
        java.lang.Throwable throwable41 = null;
        logger37.fatal((java.lang.Object) 100.0f, throwable41);
        boolean boolean43 = logger37.isDebugEnabled();
        logger22.log((org.apache.log4j.Priority) level35, (java.lang.Object) boolean43);
        java.lang.Throwable throwable46 = null;
        logger9.l7dlog((org.apache.log4j.Priority) level35, "hi!", throwable46);
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        logger49.debug((java.lang.Object) (byte) 1);
        boolean boolean52 = logger49.isDebugEnabled();
        logger49.removeAppender("hi!");
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle57 = null;
        logger56.setResourceBundle(resourceBundle57);
        java.lang.Throwable throwable60 = null;
        logger56.fatal((java.lang.Object) 100.0f, throwable60);
        org.apache.log4j.Level level62 = logger56.getEffectiveLevel();
        org.apache.log4j.Logger logger64 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle65 = null;
        logger64.setResourceBundle(resourceBundle65);
        java.lang.Throwable throwable68 = null;
        logger64.fatal((java.lang.Object) 100.0f, throwable68);
        boolean boolean70 = logger64.isDebugEnabled();
        logger49.log((org.apache.log4j.Priority) level62, (java.lang.Object) boolean70);
        org.apache.log4j.Priority priority72 = logger49.getChainedPriority();
        java.lang.Throwable throwable74 = null;
        logger9.l7dlog(priority72, "hi!", throwable74);
        org.apache.log4j.Logger logger77 = org.apache.log4j.Logger.getLogger("");
        logger77.debug((java.lang.Object) (byte) 1);
        boolean boolean80 = logger77.isDebugEnabled();
        logger77.removeAppender("hi!");
        boolean boolean83 = logger77.isInfoEnabled();
        org.apache.log4j.Logger logger85 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle86 = null;
        logger85.setResourceBundle(resourceBundle86);
        logger85.removeAllAppenders();
        logger77.fatal((java.lang.Object) logger85);
        io.cloudslang.lang.api.SlangImpl.logger = logger77;
        java.lang.Throwable throwable91 = null;
        logger9.info((java.lang.Object) logger77, throwable91);
        boolean boolean93 = logger77.isInfoEnabled();
        logger1.info((java.lang.Object) logger77);
        boolean boolean95 = logger77.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(level15);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(level35);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertNotNull(level62);
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(priority72);
        org.junit.Assert.assertNotNull(logger77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(logger85);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
// flaky:         logger1.callAppenders(loggingEvent5);
        logger1.setAdditivity(true);
        java.util.Enumeration enumeration9 = logger1.getAllAppenders();
        boolean boolean10 = logger1.getAdditivity();
        org.apache.log4j.Level level11 = logger1.getLevel();
        org.apache.log4j.Level level12 = logger1.getEffectiveLevel();
        java.util.Enumeration enumeration13 = logger1.getAllAppenders();
        java.util.ResourceBundle resourceBundle14 = null;
        logger1.setResourceBundle(resourceBundle14);
        org.apache.log4j.Appender appender16 = null;
        logger1.addAppender(appender16);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(enumeration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(level11);
// flaky:         org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNull(enumeration13);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
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
        java.util.ResourceBundle resourceBundle19 = null;
        logger18.setResourceBundle(resourceBundle19);
        boolean boolean21 = logger18.isTraceEnabled();
        org.apache.log4j.Priority priority22 = logger18.getChainedPriority();
        org.apache.log4j.Appender appender23 = null;
        logger18.removeAppender(appender23);
        org.apache.log4j.Priority priority25 = logger18.getChainedPriority();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(priority22);
        org.junit.Assert.assertNotNull(priority25);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
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
        java.lang.String str11 = logger1.getName();
        org.apache.log4j.Priority priority12 = logger1.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertNull(priority12);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Category category7 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl8.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl8.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl8.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl8.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl8.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl8.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl8.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl8.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl8.compiler;
        java.lang.Throwable throwable23 = null;
        category7.fatal((java.lang.Object) slangCompiler22, throwable23);
        io.cloudslang.lang.api.SlangImpl slangImpl25 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score26 = null;
        slangImpl25.score = score26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl25.score = score28;
        java.util.Set<java.lang.String> strSet30 = slangImpl25.getAllEventTypes();
        java.util.Set<java.lang.String> strSet31 = slangImpl25.getAllEventTypes();
        io.cloudslang.score.api.Score score32 = slangImpl25.score;
        java.util.Set<java.lang.String> strSet33 = slangImpl25.getAllEventTypes();
        io.cloudslang.score.api.Score score34 = slangImpl25.score;
        io.cloudslang.score.api.Score score35 = slangImpl25.score;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl25.eventBus;
        category7.debug((java.lang.Object) slangImpl25);
        category7.removeAllAppenders();
        org.apache.log4j.Appender appender40 = category7.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggerRepository loggerRepository41 = category7.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl slangImpl42 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus43 = slangImpl42.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = null;
        slangImpl42.compiler = slangCompiler44;
        io.cloudslang.score.events.EventBus eventBus46 = slangImpl42.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler47 = null;
        slangImpl42.compiler = slangCompiler47;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler49 = slangImpl42.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler50 = slangImpl42.compiler;
        io.cloudslang.score.events.EventBus eventBus51 = null;
        slangImpl42.eventBus = eventBus51;
        java.lang.Class<?> wildcardClass53 = slangImpl42.getClass();
        org.apache.log4j.Category category54 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass53);
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass53);
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass53);
        org.apache.log4j.Category category57 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass53);
        java.lang.Throwable throwable58 = null;
        category7.warn((java.lang.Object) wildcardClass53, throwable58);
        boolean boolean60 = category7.isInfoEnabled();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNull(appender40);
        org.junit.Assert.assertNotNull(loggerRepository41);
        org.junit.Assert.assertNull(eventBus43);
        org.junit.Assert.assertNull(eventBus46);
        org.junit.Assert.assertNull(slangCompiler49);
        org.junit.Assert.assertNull(slangCompiler50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(category54);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertNotNull(category57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender6 = null;
        boolean boolean7 = logger1.isAttached(appender6);
        logger1.removeAllAppenders();
        org.apache.log4j.Level level9 = logger1.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = logger1.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(priority4);
        org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        java.lang.Class<?> wildcardClass5 = logger1.getClass();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass5);
        org.apache.log4j.Appender appender7 = null;
        logger6.addAppender(appender7);
        logger6.removeAppender("org.apache.log4j.Level");
        java.util.ResourceBundle resourceBundle11 = null;
        logger6.setResourceBundle(resourceBundle11);
        boolean boolean13 = logger6.isInfoEnabled();
        org.apache.log4j.Priority priority14 = logger6.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(priority14);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.apache.log4j.Category category22 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass21);
        org.apache.log4j.Category category23 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass21);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(category22);
        org.junit.Assert.assertNotNull(category23);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
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
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass10);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        org.apache.log4j.Level level13 = category12.getLevel();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNull(level13);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
// flaky:         logger1.callAppenders(loggingEvent5);
        logger1.setAdditivity(true);
        logger1.removeAllAppenders();
        org.apache.log4j.Appender appender10 = null;
        logger1.addAppender(appender10);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        boolean boolean8 = logger2.getAdditivity();
        org.apache.log4j.Category category9 = logger2.getParent();
        org.apache.log4j.Appender appender10 = null;
        logger2.removeAppender(appender10);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(category9);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = null; // flaky: org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.spi.LoggerFactory loggerFactory4 = null;
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory4);
        org.apache.log4j.Category category6 = logger5.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger5.getHierarchy();
        org.apache.log4j.Level level8 = logger5.getLevel();
// flaky:         logger2.setLevel(level8);
        java.util.ResourceBundle resourceBundle10 = null;
// flaky:         logger2.setResourceBundle(resourceBundle10);
        org.apache.log4j.spi.LoggingEvent loggingEvent12 = null;
// flaky:         logger2.callAppenders(loggingEvent12);
        org.apache.log4j.Priority priority14 = null; // flaky: logger2.getChainedPriority();
// flaky:         logger2.removeAllAppenders();
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        logger17.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger17;
        org.apache.log4j.Level level23 = logger17.getEffectiveLevel();
        boolean boolean24 = logger17.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository25 = logger17.getLoggerRepository();
        java.util.ResourceBundle resourceBundle26 = null;
        logger17.setResourceBundle(resourceBundle26);
        java.util.ResourceBundle resourceBundle28 = null;
        logger17.setResourceBundle(resourceBundle28);
        logger17.removeAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository31 = logger17.getLoggerRepository();
// flaky:         logger2.warn((java.lang.Object) logger17);
        org.apache.log4j.Level level33 = null; // flaky: logger2.getPriority();
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
// flaky:         org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(loggerRepository7);
// flaky:         org.junit.Assert.assertNotNull(level8);
// flaky:         org.junit.Assert.assertNotNull(priority14);
        org.junit.Assert.assertNotNull(logger17);
// flaky:         org.junit.Assert.assertNull(level23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(loggerRepository25);
        org.junit.Assert.assertNotNull(loggerRepository31);
// flaky:         org.junit.Assert.assertNotNull(level33);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        category1.assertLog(true, "");
        org.apache.log4j.Level level7 = category1.getEffectiveLevel();
        category1.setAdditivity(true);
        org.apache.log4j.Level level10 = category1.getPriority();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(level7);
// flaky:         org.junit.Assert.assertNotNull(level10);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
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
        org.apache.log4j.Appender appender13 = category11.getAppender("");
        org.apache.log4j.Category category14 = category11.getParent();
        java.util.Enumeration enumeration15 = category14.getAllAppenders();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNull(appender13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNotNull(enumeration15);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
        java.lang.Class<?> wildcardClass4 = logger1.getClass();
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger8 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
// flaky:         logger8.callAppenders(loggingEvent9);
        java.lang.Class<?> wildcardClass11 = logger8.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Appender appender15 = logger13.getAppender("root");
        org.apache.log4j.Level level16 = logger13.getPriority();
        category6.setPriority((org.apache.log4j.Priority) level16);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNull(appender15);
// flaky:         org.junit.Assert.assertNotNull(level16);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
        logger1.removeAllAppenders();
        java.util.Enumeration enumeration5 = logger1.getAllAppenders();
        java.util.Enumeration enumeration6 = logger1.getAllAppenders();
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl7.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl7.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl7.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass21);
        org.apache.log4j.Category category23 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass21);
        category23.removeAllAppenders();
        java.lang.String str25 = category23.getName();
        org.apache.log4j.Level level26 = category23.getPriority();
        org.apache.log4j.Level level27 = category23.getPriority();
        logger1.setPriority((org.apache.log4j.Priority) level27);
        io.cloudslang.lang.api.SlangImpl slangImpl29 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl29.score = score30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl29.eventBus = eventBus32;
        java.util.Set<java.lang.String> strSet34 = slangImpl29.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus35 = null;
        slangImpl29.eventBus = eventBus35;
        java.util.Set<java.lang.String> strSet37 = slangImpl29.getAllEventTypes();
        io.cloudslang.score.api.Score score38 = slangImpl29.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl29.compiler;
        java.util.Set<java.lang.String> strSet40 = slangImpl29.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler41 = slangImpl29.compiler;
        io.cloudslang.score.api.Score score42 = null;
        slangImpl29.score = score42;
        io.cloudslang.score.events.EventBus eventBus44 = null;
        slangImpl29.eventBus = eventBus44;
        java.lang.Throwable throwable46 = null;
        logger1.trace((java.lang.Object) slangImpl29, throwable46);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(enumeration5);
        org.junit.Assert.assertNotNull(enumeration6);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(category23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.util.HashSet" + "'", str25, "java.util.HashSet");
// flaky:         org.junit.Assert.assertNotNull(level26);
// flaky:         org.junit.Assert.assertNotNull(level27);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(slangCompiler41);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory1);
        logger2.removeAllAppenders();
        java.util.ResourceBundle resourceBundle4 = logger2.getResourceBundle();
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        logger2.assertLog(false, "hi!");
        org.apache.log4j.Level level10 = logger2.getPriority();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        logger12.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender17 = null;
        boolean boolean18 = category16.isAttached(appender17);
        org.apache.log4j.Appender appender19 = null;
        boolean boolean20 = category16.isAttached(appender19);
        java.lang.Class<?> wildcardClass21 = category16.getClass();
        logger12.error((java.lang.Object) wildcardClass21);
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass21);
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl24.score = score25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl24.score = score27;
        java.util.Set<java.lang.String> strSet29 = slangImpl24.getAllEventTypes();
        java.util.Set<java.lang.String> strSet30 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl24.eventBus;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl24.eventBus = eventBus32;
        logger23.error((java.lang.Object) eventBus32);
        org.apache.log4j.Category category36 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender37 = null;
        boolean boolean38 = category36.isAttached(appender37);
        org.apache.log4j.Appender appender40 = category36.getAppender("");
        category36.assertLog(false, "io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Logger logger45 = org.apache.log4j.Logger.getLogger("");
        logger45.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        logger49.debug((java.lang.Object) (byte) 1);
        boolean boolean52 = logger49.isDebugEnabled();
        org.apache.log4j.Logger logger54 = org.apache.log4j.Logger.getLogger("");
        logger54.debug((java.lang.Object) (byte) 1);
        boolean boolean57 = logger54.isDebugEnabled();
        java.util.Enumeration enumeration58 = logger54.getAllAppenders();
        java.lang.Throwable throwable59 = null;
        logger49.error((java.lang.Object) logger54, throwable59);
        logger45.trace((java.lang.Object) logger54);
        java.util.ResourceBundle resourceBundle62 = null;
        logger45.setResourceBundle(resourceBundle62);
        logger45.removeAppender("hi!");
        io.cloudslang.lang.api.SlangImpl slangImpl66 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score67 = null;
        slangImpl66.score = score67;
        io.cloudslang.score.api.Score score69 = null;
        slangImpl66.score = score69;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler71 = null;
        slangImpl66.compiler = slangCompiler71;
        io.cloudslang.score.events.EventBus eventBus73 = null;
        slangImpl66.eventBus = eventBus73;
        io.cloudslang.score.api.Score score75 = slangImpl66.score;
        io.cloudslang.score.api.Score score76 = slangImpl66.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler77 = null;
        slangImpl66.compiler = slangCompiler77;
        java.util.Set<java.lang.String> strSet79 = slangImpl66.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler80 = null;
        slangImpl66.compiler = slangCompiler80;
        logger45.fatal((java.lang.Object) slangCompiler80);
        category36.error((java.lang.Object) slangCompiler80);
        org.apache.log4j.Level level84 = category36.getEffectiveLevel();
        logger23.setLevel(level84);
        java.lang.Throwable throwable87 = null;
        logger2.l7dlog((org.apache.log4j.Priority) level84, "org.apache.log4j.spi.RootLogger", throwable87);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(resourceBundle4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(category36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(appender40);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(logger54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(enumeration58);
        org.junit.Assert.assertNull(score75);
        org.junit.Assert.assertNull(score76);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(level84);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        boolean boolean5 = logger1.isTraceEnabled();
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        logger9.debug((java.lang.Object) (byte) 1);
        boolean boolean12 = logger9.isDebugEnabled();
        logger9.removeAppender("hi!");
        boolean boolean15 = logger9.isInfoEnabled();
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        logger17.removeAllAppenders();
        logger9.fatal((java.lang.Object) logger17);
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
        logger23.fatal((java.lang.Object) 100.0f, throwable27);
        boolean boolean29 = logger23.isDebugEnabled();
        boolean boolean30 = logger23.isDebugEnabled();
        java.lang.Throwable throwable31 = null;
        logger9.fatal((java.lang.Object) logger23, throwable31);
        logger23.setAdditivity(false);
        io.cloudslang.lang.api.SlangImpl slangImpl35 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl35.eventBus;
        io.cloudslang.score.events.EventBus eventBus37 = slangImpl35.eventBus;
        java.util.Set<java.lang.String> strSet38 = slangImpl35.getAllEventTypes();
        java.lang.Throwable throwable39 = null;
        logger23.trace((java.lang.Object) strSet38, throwable39);
        org.apache.log4j.spi.LoggerRepository loggerRepository41 = logger23.getHierarchy();
        org.apache.log4j.Level level42 = logger23.getEffectiveLevel();
        logger1.setPriority((org.apache.log4j.Priority) level42);
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getRootLogger();
        java.util.ResourceBundle resourceBundle45 = null;
        logger44.setResourceBundle(resourceBundle45);
        logger44.removeAllAppenders();
        java.util.ResourceBundle resourceBundle48 = null;
        logger44.setResourceBundle(resourceBundle48);
        java.lang.String str50 = logger44.getName();
        org.apache.log4j.Level level51 = logger44.getLevel();
        logger44.removeAllAppenders();
        logger1.trace((java.lang.Object) logger44);
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        logger55.debug((java.lang.Object) (byte) 1);
        java.lang.Object obj58 = null;
        logger55.info(obj58);
        org.apache.log4j.Appender appender60 = null;
        logger55.addAppender(appender60);
        io.cloudslang.lang.api.SlangImpl slangImpl62 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score63 = null;
        slangImpl62.score = score63;
        io.cloudslang.score.api.Score score65 = null;
        slangImpl62.score = score65;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler67 = null;
        slangImpl62.compiler = slangCompiler67;
        io.cloudslang.score.events.EventBus eventBus69 = null;
        slangImpl62.eventBus = eventBus69;
        io.cloudslang.score.api.Score score71 = slangImpl62.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler72 = slangImpl62.compiler;
        io.cloudslang.score.api.Score score73 = null;
        slangImpl62.score = score73;
        io.cloudslang.score.api.Score score75 = null;
        slangImpl62.score = score75;
        io.cloudslang.score.events.EventBus eventBus77 = slangImpl62.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler78 = null;
        slangImpl62.compiler = slangCompiler78;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler80 = slangImpl62.compiler;
        logger55.trace((java.lang.Object) slangImpl62);
        java.lang.Throwable throwable82 = null;
        logger1.info((java.lang.Object) logger55, throwable82);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(level6);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNull(eventBus37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(loggerRepository41);
        org.junit.Assert.assertNotNull(level42);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "root" + "'", str50, "root");
// flaky:         org.junit.Assert.assertNull(level51);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertNull(score71);
        org.junit.Assert.assertNull(slangCompiler72);
        org.junit.Assert.assertNull(eventBus77);
        org.junit.Assert.assertNull(slangCompiler80);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.util.ResourceBundle resourceBundle7 = null;
        logger1.setResourceBundle(resourceBundle7);
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getHierarchy();
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl10.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl10.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl10.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl10.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl10.score;
        io.cloudslang.score.api.Score score20 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl10.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl10.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl10.compiler;
        logger1.info((java.lang.Object) slangCompiler25);
        org.apache.log4j.spi.LoggerRepository loggerRepository27 = logger1.getHierarchy();
        org.apache.log4j.Appender appender29 = logger1.getAppender("io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.spi.LoggingEvent loggingEvent30 = null;
        logger1.callAppenders(loggingEvent30);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(loggerRepository27);
        org.junit.Assert.assertNull(appender29);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getLoggerRepository();
        org.apache.log4j.Level level7 = logger1.getLevel();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.apache.log4j.Level level9 = category8.getLevel();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(category8);
// flaky:         org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
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
        io.cloudslang.lang.compiler.SlangSource slangSource26 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray27 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet28 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet28, slangSourceArray27);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact30 = slangImpl0.compile(slangSource26, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(slangSourceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("root");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        boolean boolean3 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle6 = null;
        logger5.setResourceBundle(resourceBundle6);
        java.lang.Throwable throwable9 = null;
        logger5.fatal((java.lang.Object) 100.0f, throwable9);
        org.apache.log4j.Level level11 = logger5.getEffectiveLevel();
        boolean boolean12 = logger5.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        java.lang.Throwable throwable17 = null;
        logger5.info((java.lang.Object) slangImpl13, throwable17);
        logger5.setAdditivity(false);
        org.apache.log4j.Level level21 = logger5.getLevel();
        logger1.setLevel(level21);
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger26 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle27 = logger26.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository28 = logger26.getLoggerRepository();
        java.lang.String str29 = logger26.getName();
        org.apache.log4j.Level level30 = logger26.getLevel();
        logger26.removeAppender("io.cloudslang.lang.api.SlangImpl");
        java.lang.Throwable throwable33 = null;
        logger1.fatal((java.lang.Object) logger26, throwable33);
        java.util.ResourceBundle resourceBundle35 = null;
        logger1.setResourceBundle(resourceBundle35);
        java.lang.Class<?> wildcardClass37 = logger1.getClass();
        org.apache.log4j.Logger logger38 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass37);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(level11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(level21);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNull(resourceBundle27);
        org.junit.Assert.assertNotNull(loggerRepository28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(level30);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(logger38);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        java.lang.Throwable throwable13 = null;
        logger1.info((java.lang.Object) slangImpl9, throwable13);
        java.lang.String str15 = logger1.getName();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level17 = logger1.getPriority();
        boolean boolean18 = logger1.isTraceEnabled();
        java.util.Enumeration enumeration19 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository20 = logger1.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.setAdditivity(false);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(level17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(enumeration19);
        org.junit.Assert.assertNotNull(loggerRepository20);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        logger2.info((java.lang.Object) 10.0f);
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        logger9.debug((java.lang.Object) (byte) 1);
        boolean boolean12 = logger9.isDebugEnabled();
        logger9.removeAppender("hi!");
        boolean boolean15 = logger9.isInfoEnabled();
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        logger17.removeAllAppenders();
        logger9.fatal((java.lang.Object) logger17);
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender24 = null;
        logger23.addAppender(appender24);
        org.apache.log4j.spi.LoggerRepository loggerRepository26 = logger23.getHierarchy();
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger("");
        logger28.debug((java.lang.Object) (byte) 1);
        boolean boolean31 = logger28.isDebugEnabled();
        logger28.removeAppender("hi!");
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle36 = null;
        logger35.setResourceBundle(resourceBundle36);
        java.lang.Throwable throwable39 = null;
        logger35.fatal((java.lang.Object) 100.0f, throwable39);
        org.apache.log4j.Level level41 = logger35.getEffectiveLevel();
        org.apache.log4j.Logger logger43 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle44 = null;
        logger43.setResourceBundle(resourceBundle44);
        java.lang.Throwable throwable47 = null;
        logger43.fatal((java.lang.Object) 100.0f, throwable47);
        boolean boolean49 = logger43.isDebugEnabled();
        logger28.log((org.apache.log4j.Priority) level41, (java.lang.Object) boolean49);
        org.apache.log4j.Category category51 = org.apache.log4j.Category.getRoot();
        java.lang.Throwable throwable52 = null;
        logger23.log((org.apache.log4j.Priority) level41, (java.lang.Object) category51, throwable52);
        logger9.setPriority((org.apache.log4j.Priority) level41);
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        logger56.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Logger logger60 = org.apache.log4j.Logger.getLogger("");
        logger60.debug((java.lang.Object) (byte) 1);
        boolean boolean63 = logger60.isDebugEnabled();
        org.apache.log4j.Logger logger65 = org.apache.log4j.Logger.getLogger("");
        logger65.debug((java.lang.Object) (byte) 1);
        boolean boolean68 = logger65.isDebugEnabled();
        java.util.Enumeration enumeration69 = logger65.getAllAppenders();
        java.lang.Throwable throwable70 = null;
        logger60.error((java.lang.Object) logger65, throwable70);
        logger56.trace((java.lang.Object) logger65);
        java.lang.Throwable throwable73 = null;
        logger2.log("", (org.apache.log4j.Priority) level41, (java.lang.Object) logger65, throwable73);
        org.apache.log4j.Appender appender76 = logger65.getAppender("org.apache.log4j.spi.RootLogger");
        boolean boolean77 = logger65.isDebugEnabled();
        boolean boolean78 = logger65.getAdditivity();
        java.util.ResourceBundle resourceBundle79 = logger65.getResourceBundle();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(loggerRepository26);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(level41);
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(category51);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(logger65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumeration69);
        org.junit.Assert.assertNull(appender76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(resourceBundle79);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("root");
        org.apache.log4j.Logger logger3 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle4 = null;
        logger3.setResourceBundle(resourceBundle4);
        java.lang.Throwable throwable7 = null;
        logger3.fatal((java.lang.Object) 100.0f, throwable7);
        org.apache.log4j.Level level9 = logger3.getEffectiveLevel();
        boolean boolean10 = logger3.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl11.compiler = slangCompiler13;
        java.lang.Throwable throwable15 = null;
        logger3.info((java.lang.Object) slangImpl11, throwable15);
        java.lang.String str17 = logger3.getName();
        io.cloudslang.lang.api.SlangImpl.logger = logger3;
        org.apache.log4j.Level level19 = logger3.getPriority();
        boolean boolean20 = logger3.isTraceEnabled();
        java.util.Enumeration enumeration21 = logger3.getAllAppenders();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender24 = null;
        logger23.addAppender(appender24);
        org.apache.log4j.Priority priority26 = logger23.getChainedPriority();
        org.apache.log4j.Level level27 = logger23.getPriority();
        logger3.trace((java.lang.Object) logger23);
        logger1.fatal((java.lang.Object) logger3);
        java.lang.Class<?> wildcardClass30 = logger1.getClass();
        org.apache.log4j.Category category31 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass30);
        org.apache.log4j.Appender appender33 = category31.getAppender("java.util.HashSet");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(level19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(enumeration21);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(priority26);
        org.junit.Assert.assertNotNull(level27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(category31);
        org.junit.Assert.assertNull(appender33);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
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
        io.cloudslang.lang.compiler.SlangSource slangSource15 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray16 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet17 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet17, slangSourceArray16);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact19 = slangImpl0.compile(slangSource15, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = logger1.getAppender("root");
        logger1.removeAppender("root");
        org.apache.log4j.Level level10 = logger1.getLevel();
        org.apache.log4j.Appender appender11 = null;
        boolean boolean12 = logger1.isAttached(appender11);
        logger1.removeAllAppenders();
        java.util.ResourceBundle resourceBundle14 = logger1.getResourceBundle();
        java.lang.String str15 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority4);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(resourceBundle14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        logger6.debug((java.lang.Object) (byte) 1);
        boolean boolean9 = logger6.isDebugEnabled();
        logger6.removeAppender("hi!");
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle14 = null;
        logger13.setResourceBundle(resourceBundle14);
        java.lang.Throwable throwable17 = null;
        logger13.fatal((java.lang.Object) 100.0f, throwable17);
        org.apache.log4j.Level level19 = logger13.getEffectiveLevel();
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle22 = null;
        logger21.setResourceBundle(resourceBundle22);
        java.lang.Throwable throwable25 = null;
        logger21.fatal((java.lang.Object) 100.0f, throwable25);
        boolean boolean27 = logger21.isDebugEnabled();
        logger6.log((org.apache.log4j.Priority) level19, (java.lang.Object) boolean27);
        org.apache.log4j.Category category29 = org.apache.log4j.Category.getRoot();
        java.lang.Throwable throwable30 = null;
        logger1.log((org.apache.log4j.Priority) level19, (java.lang.Object) category29, throwable30);
        java.util.ResourceBundle resourceBundle32 = category29.getResourceBundle();
        org.apache.log4j.Priority priority33 = category29.getChainedPriority();
        java.lang.String str34 = category29.getName();
        org.apache.log4j.Level level35 = category29.getLevel();
        category29.setAdditivity(false);
        io.cloudslang.lang.api.SlangImpl slangImpl38 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score39 = null;
        slangImpl38.score = score39;
        io.cloudslang.score.api.Score score41 = slangImpl38.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = slangImpl38.compiler;
        java.util.Set<java.lang.String> strSet43 = slangImpl38.getAllEventTypes();
        io.cloudslang.score.api.Score score44 = null;
        slangImpl38.score = score44;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler46 = null;
        slangImpl38.compiler = slangCompiler46;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler48 = null;
        slangImpl38.compiler = slangCompiler48;
        java.lang.Throwable throwable50 = null;
        // The following exception was thrown during execution in test generation
        try {
            category29.debug((java.lang.Object) slangCompiler48, throwable50);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(level19);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(category29);
        org.junit.Assert.assertNull(resourceBundle32);
// flaky:         org.junit.Assert.assertNull(priority33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "root" + "'", str34, "root");
// flaky:         org.junit.Assert.assertNull(level35);
        org.junit.Assert.assertNull(score41);
        org.junit.Assert.assertNull(slangCompiler42);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = logger1.getAppender("root");
        logger1.removeAppender("root");
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle12 = null;
        logger11.setResourceBundle(resourceBundle12);
        java.lang.Throwable throwable15 = null;
        logger11.fatal((java.lang.Object) 100.0f, throwable15);
        org.apache.log4j.Level level17 = logger11.getEffectiveLevel();
        boolean boolean18 = logger11.isInfoEnabled();
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger("");
        logger20.debug((java.lang.Object) (byte) 1);
        boolean boolean23 = logger20.isDebugEnabled();
        logger20.removeAppender("hi!");
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle28 = null;
        logger27.setResourceBundle(resourceBundle28);
        java.lang.Throwable throwable31 = null;
        logger27.fatal((java.lang.Object) 100.0f, throwable31);
        org.apache.log4j.Level level33 = logger27.getEffectiveLevel();
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle36 = null;
        logger35.setResourceBundle(resourceBundle36);
        java.lang.Throwable throwable39 = null;
        logger35.fatal((java.lang.Object) 100.0f, throwable39);
        boolean boolean41 = logger35.isDebugEnabled();
        logger20.log((org.apache.log4j.Priority) level33, (java.lang.Object) boolean41);
        org.apache.log4j.Priority priority43 = logger20.getChainedPriority();
        org.apache.log4j.Logger logger45 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender46 = null;
        logger45.addAppender(appender46);
        org.apache.log4j.spi.LoggerRepository loggerRepository48 = logger45.getHierarchy();
        org.apache.log4j.Logger logger50 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle51 = null;
        logger50.setResourceBundle(resourceBundle51);
        java.lang.Throwable throwable54 = null;
        logger50.fatal((java.lang.Object) 100.0f, throwable54);
        org.apache.log4j.Level level56 = logger50.getEffectiveLevel();
        java.lang.Throwable throwable58 = null;
        logger45.l7dlog((org.apache.log4j.Priority) level56, "hi!", throwable58);
        java.lang.Throwable throwable60 = null;
        logger20.warn((java.lang.Object) level56, throwable60);
        io.cloudslang.lang.api.SlangImpl slangImpl62 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus63 = slangImpl62.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler64 = null;
        slangImpl62.compiler = slangCompiler64;
        io.cloudslang.score.events.EventBus eventBus66 = slangImpl62.eventBus;
        java.lang.Throwable throwable67 = null;
        logger11.log((org.apache.log4j.Priority) level56, (java.lang.Object) slangImpl62, throwable67);
        java.util.Set<java.lang.String> strSet69 = slangImpl62.getAllEventTypes();
        io.cloudslang.score.api.Score score70 = null;
        slangImpl62.score = score70;
        io.cloudslang.score.events.EventBus eventBus72 = slangImpl62.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler73 = null;
        slangImpl62.compiler = slangCompiler73;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler75 = null;
        slangImpl62.compiler = slangCompiler75;
        io.cloudslang.score.api.Score score77 = null;
        slangImpl62.score = score77;
        io.cloudslang.score.api.Score score79 = null;
        slangImpl62.score = score79;
        logger1.info((java.lang.Object) slangImpl62);
        logger1.setAdditivity(false);
        boolean boolean84 = logger1.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority4);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(level17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(level33);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(priority43);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(loggerRepository48);
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertNotNull(level56);
        org.junit.Assert.assertNull(eventBus63);
        org.junit.Assert.assertNull(eventBus66);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNull(eventBus72);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        boolean boolean7 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        logger9.removeAllAppenders();
        logger1.fatal((java.lang.Object) logger9);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender16 = logger1.getAppender("");
        org.apache.log4j.Appender appender17 = null;
        logger1.removeAppender(appender17);
        org.apache.log4j.spi.LoggerRepository loggerRepository19 = logger1.getHierarchy();
        org.apache.log4j.Level level20 = logger1.getLevel();
        java.util.ResourceBundle resourceBundle21 = null;
        logger1.setResourceBundle(resourceBundle21);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNull(appender16);
        org.junit.Assert.assertNotNull(loggerRepository19);
        org.junit.Assert.assertNotNull(level20);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        java.lang.Throwable throwable13 = null;
        logger1.info((java.lang.Object) slangImpl9, throwable13);
        logger1.setAdditivity(false);
        org.apache.log4j.Appender appender17 = null;
        logger1.addAppender(appender17);
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl19.score = score20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl19.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl19.getAllEventTypes();
        logger1.fatal((java.lang.Object) strSet25);
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender29 = null;
        logger28.addAppender(appender29);
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
        logger32.fatal((java.lang.Object) 100.0f, throwable36);
        boolean boolean38 = logger32.isDebugEnabled();
        java.lang.Throwable throwable40 = null;
        logger32.trace((java.lang.Object) 10L, throwable40);
        java.lang.Class<?> wildcardClass42 = logger32.getClass();
        org.apache.log4j.Category category43 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass42);
        org.apache.log4j.Category category44 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass42);
        category44.removeAppender("");
        logger28.error((java.lang.Object) category44);
        java.lang.Class<?> wildcardClass48 = logger28.getClass();
        org.apache.log4j.Category category49 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass48);
        java.lang.Throwable throwable50 = null;
        logger1.fatal((java.lang.Object) category49, throwable50);
        boolean boolean52 = logger1.isTraceEnabled();
        logger1.assertLog(false, "org.apache.log4j.spi.RootLogger");
        boolean boolean56 = logger1.isDebugEnabled();
        logger1.assertLog(false, "org.apache.log4j.Logger");
        org.apache.log4j.Appender appender61 = logger1.getAppender("");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender63 = null;
        boolean boolean64 = logger1.isAttached(appender63);
        boolean boolean65 = logger1.isTraceEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(category43);
        org.junit.Assert.assertNotNull(category44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(category49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(appender61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
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
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass10);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Appender appender15 = null;
        logger14.removeAppender(appender15);
        org.apache.log4j.spi.LoggingEvent loggingEvent17 = null;
        logger14.callAppenders(loggingEvent17);
        io.cloudslang.lang.api.SlangImpl.logger = logger14;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl20.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl20.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score27 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet28 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = slangImpl20.score;
        io.cloudslang.score.api.Score score30 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl20.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score34 = null;
        slangImpl20.score = score34;
        logger14.info((java.lang.Object) score34);
        org.apache.log4j.Category category37 = logger14.getParent();
        // The following exception was thrown during execution in test generation
        try {
            category12.info((java.lang.Object) logger14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(category37);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getHierarchy();
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Priority priority14 = logger8.getChainedPriority();
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = logger8.isAttached(appender15);
        java.util.ResourceBundle resourceBundle17 = null;
        logger8.setResourceBundle(resourceBundle17);
        logger1.error((java.lang.Object) logger8);
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        logger21.debug((java.lang.Object) (byte) 1);
        boolean boolean24 = logger21.isDebugEnabled();
        logger21.removeAppender("hi!");
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle29 = null;
        logger28.setResourceBundle(resourceBundle29);
        java.lang.Throwable throwable32 = null;
        logger28.fatal((java.lang.Object) 100.0f, throwable32);
        org.apache.log4j.Level level34 = logger28.getEffectiveLevel();
        org.apache.log4j.Logger logger36 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle37 = null;
        logger36.setResourceBundle(resourceBundle37);
        java.lang.Throwable throwable40 = null;
        logger36.fatal((java.lang.Object) 100.0f, throwable40);
        boolean boolean42 = logger36.isDebugEnabled();
        logger21.log((org.apache.log4j.Priority) level34, (java.lang.Object) boolean42);
        org.apache.log4j.Priority priority44 = logger21.getChainedPriority();
        org.apache.log4j.Logger logger46 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender47 = null;
        logger46.addAppender(appender47);
        org.apache.log4j.spi.LoggerRepository loggerRepository49 = logger46.getHierarchy();
        org.apache.log4j.Logger logger51 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle52 = null;
        logger51.setResourceBundle(resourceBundle52);
        java.lang.Throwable throwable55 = null;
        logger51.fatal((java.lang.Object) 100.0f, throwable55);
        org.apache.log4j.Level level57 = logger51.getEffectiveLevel();
        java.lang.Throwable throwable59 = null;
        logger46.l7dlog((org.apache.log4j.Priority) level57, "hi!", throwable59);
        java.lang.Throwable throwable61 = null;
        logger21.warn((java.lang.Object) level57, throwable61);
        boolean boolean63 = logger1.isEnabledFor((org.apache.log4j.Priority) level57);
        org.apache.log4j.Appender appender64 = null;
        boolean boolean65 = logger1.isAttached(appender64);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(priority14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(level34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(priority44);
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertNotNull(loggerRepository49);
        org.junit.Assert.assertNotNull(logger51);
        org.junit.Assert.assertNotNull(level57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender9 = null;
        logger1.addAppender(appender9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(level7);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
        logger1.debug(obj8);
        logger1.assertLog(true, "");
        logger1.assertLog(false, "");
        java.lang.String str16 = logger1.getName();
        org.apache.log4j.Level level17 = logger1.getPriority();
        logger1.setAdditivity(false);
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl20.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl20.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl20.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl20.eventBus = eventBus27;
        io.cloudslang.score.api.Score score29 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl20.compiler = slangCompiler30;
        io.cloudslang.score.api.Score score32 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet33 = slangImpl20.getAllEventTypes();
        java.lang.Throwable throwable34 = null;
        logger1.debug((java.lang.Object) slangImpl20, throwable34);
        org.apache.log4j.Appender appender36 = null;
        logger1.addAppender(appender36);
        logger1.removeAppender("hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(level17);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle7 = null;
        logger6.setResourceBundle(resourceBundle7);
        java.lang.Throwable throwable10 = null;
        logger6.fatal((java.lang.Object) 100.0f, throwable10);
        org.apache.log4j.Level level12 = logger6.getEffectiveLevel();
        boolean boolean13 = logger6.isInfoEnabled();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        logger15.debug((java.lang.Object) (byte) 1);
        boolean boolean18 = logger15.isDebugEnabled();
        logger15.removeAppender("hi!");
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle23 = null;
        logger22.setResourceBundle(resourceBundle23);
        java.lang.Throwable throwable26 = null;
        logger22.fatal((java.lang.Object) 100.0f, throwable26);
        org.apache.log4j.Level level28 = logger22.getEffectiveLevel();
        org.apache.log4j.Logger logger30 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle31 = null;
        logger30.setResourceBundle(resourceBundle31);
        java.lang.Throwable throwable34 = null;
        logger30.fatal((java.lang.Object) 100.0f, throwable34);
        boolean boolean36 = logger30.isDebugEnabled();
        logger15.log((org.apache.log4j.Priority) level28, (java.lang.Object) boolean36);
        org.apache.log4j.Priority priority38 = logger15.getChainedPriority();
        org.apache.log4j.Logger logger40 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender41 = null;
        logger40.addAppender(appender41);
        org.apache.log4j.spi.LoggerRepository loggerRepository43 = logger40.getHierarchy();
        org.apache.log4j.Logger logger45 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle46 = null;
        logger45.setResourceBundle(resourceBundle46);
        java.lang.Throwable throwable49 = null;
        logger45.fatal((java.lang.Object) 100.0f, throwable49);
        org.apache.log4j.Level level51 = logger45.getEffectiveLevel();
        java.lang.Throwable throwable53 = null;
        logger40.l7dlog((org.apache.log4j.Priority) level51, "hi!", throwable53);
        java.lang.Throwable throwable55 = null;
        logger15.warn((java.lang.Object) level51, throwable55);
        io.cloudslang.lang.api.SlangImpl slangImpl57 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus58 = slangImpl57.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler59 = null;
        slangImpl57.compiler = slangCompiler59;
        io.cloudslang.score.events.EventBus eventBus61 = slangImpl57.eventBus;
        java.lang.Throwable throwable62 = null;
        logger6.log((org.apache.log4j.Priority) level51, (java.lang.Object) slangImpl57, throwable62);
        logger1.debug((java.lang.Object) logger6);
        org.apache.log4j.Logger logger66 = org.apache.log4j.Logger.getLogger("");
        logger66.debug((java.lang.Object) (byte) 1);
        boolean boolean69 = logger66.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger66;
        org.apache.log4j.Logger logger72 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle73 = null;
        logger72.setResourceBundle(resourceBundle73);
        logger72.removeAllAppenders();
        org.apache.log4j.Logger logger77 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle78 = null;
        logger77.setResourceBundle(resourceBundle78);
        java.lang.Throwable throwable81 = null;
        logger77.fatal((java.lang.Object) 100.0f, throwable81);
        org.apache.log4j.Level level83 = logger77.getEffectiveLevel();
        java.lang.Object[] objArray85 = null;
        java.lang.Throwable throwable86 = null;
        logger72.l7dlog((org.apache.log4j.Priority) level83, "hi!", objArray85, throwable86);
        logger66.error((java.lang.Object) objArray85);
        org.apache.log4j.spi.LoggerRepository loggerRepository89 = logger66.getHierarchy();
        logger1.trace((java.lang.Object) loggerRepository89);
        logger1.removeAppender("hi!");
        org.apache.log4j.Level level93 = logger1.getLevel();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(level12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(level28);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(priority38);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(loggerRepository43);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(level51);
        org.junit.Assert.assertNull(eventBus58);
        org.junit.Assert.assertNull(eventBus61);
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(logger72);
        org.junit.Assert.assertNotNull(logger77);
        org.junit.Assert.assertNotNull(level83);
        org.junit.Assert.assertNotNull(loggerRepository89);
        org.junit.Assert.assertNotNull(level93);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = null; // flaky: logger1.getChainedPriority();
        java.util.Enumeration enumeration3 = null; // flaky: logger1.getAllAppenders();
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle6 = null;
        logger5.setResourceBundle(resourceBundle6);
        logger5.removeAllAppenders();
        org.apache.log4j.Category category9 = logger5.getParent();
        boolean boolean10 = category9.getAdditivity();
        java.util.ResourceBundle resourceBundle11 = category9.getResourceBundle();
        java.util.Enumeration enumeration12 = category9.getAllAppenders();
        category9.removeAppender("java.util.HashSet");
        org.apache.log4j.Level level15 = category9.getPriority();
        org.apache.log4j.Appender appender16 = null;
        category9.addAppender(appender16);
// flaky:         logger1.trace((java.lang.Object) category9);
// flaky:         org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertNull(enumeration3);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(resourceBundle11);
        org.junit.Assert.assertNotNull(enumeration12);
// flaky:         org.junit.Assert.assertNull(level15);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Appender appender2 = null;
        logger1.removeAppender(appender2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(loggerRepository6);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        org.apache.log4j.Level level4 = category1.getPriority();
        category1.assertLog(true, "org.apache.log4j.Logger");
        org.apache.log4j.Level level8 = category1.getPriority();
        boolean boolean9 = category1.isDebugEnabled();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(level4);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        boolean boolean7 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        logger9.removeAllAppenders();
        logger1.fatal((java.lang.Object) logger9);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender16 = null;
        logger15.addAppender(appender16);
        org.apache.log4j.spi.LoggerRepository loggerRepository18 = logger15.getHierarchy();
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger("");
        logger20.debug((java.lang.Object) (byte) 1);
        boolean boolean23 = logger20.isDebugEnabled();
        logger20.removeAppender("hi!");
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle28 = null;
        logger27.setResourceBundle(resourceBundle28);
        java.lang.Throwable throwable31 = null;
        logger27.fatal((java.lang.Object) 100.0f, throwable31);
        org.apache.log4j.Level level33 = logger27.getEffectiveLevel();
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle36 = null;
        logger35.setResourceBundle(resourceBundle36);
        java.lang.Throwable throwable39 = null;
        logger35.fatal((java.lang.Object) 100.0f, throwable39);
        boolean boolean41 = logger35.isDebugEnabled();
        logger20.log((org.apache.log4j.Priority) level33, (java.lang.Object) boolean41);
        org.apache.log4j.Category category43 = org.apache.log4j.Category.getRoot();
        java.lang.Throwable throwable44 = null;
        logger15.log((org.apache.log4j.Priority) level33, (java.lang.Object) category43, throwable44);
        logger1.setPriority((org.apache.log4j.Priority) level33);
        org.apache.log4j.Appender appender47 = null;
        boolean boolean48 = logger1.isAttached(appender47);
        org.apache.log4j.Level level49 = logger1.getLevel();
        java.lang.String str50 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(loggerRepository18);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(level33);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(category43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(level49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.lang.String str3 = logger2.getName();
        java.util.ResourceBundle resourceBundle4 = logger2.getResourceBundle();
        org.apache.log4j.Level level5 = logger2.getPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger2.getHierarchy();
        logger2.removeAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl8.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl8.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl8.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl8.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl8.compiler = slangCompiler18;
        java.lang.Class<?> wildcardClass20 = slangImpl8.getClass();
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass20);
        java.lang.Throwable throwable22 = null;
        logger2.error((java.lang.Object) logger21, throwable22);
        org.apache.log4j.Priority priority24 = logger2.getChainedPriority();
        org.apache.log4j.Priority priority25 = logger2.getChainedPriority();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(resourceBundle4);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(priority24);
        org.junit.Assert.assertNotNull(priority25);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        org.apache.log4j.Priority priority24 = logger1.getChainedPriority();
        logger1.warn((java.lang.Object) (byte) -1);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getRootLogger();
        java.lang.Throwable throwable29 = null;
        logger1.trace((java.lang.Object) logger28, throwable29);
        org.apache.log4j.Level level31 = logger1.getLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.util.ResourceBundle resourceBundle33 = null;
        logger1.setResourceBundle(resourceBundle33);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        boolean boolean36 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(priority24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.isInfoEnabled();
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = logger1.isAttached(appender9);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.setAdditivity(true);
        org.apache.log4j.spi.LoggingEvent loggingEvent14 = null;
        logger1.callAppenders(loggingEvent14);
        org.apache.log4j.Priority priority16 = null;
        logger1.setPriority(priority16);
        org.apache.log4j.Category category18 = logger1.getParent();
        java.lang.String str19 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("hi!");
        org.apache.log4j.Priority priority2 = null;
        category1.setPriority(priority2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = category1.getHierarchy();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(loggerRepository4);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        boolean boolean2 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger4 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle5 = null;
        logger4.setResourceBundle(resourceBundle5);
        logger4.removeAllAppenders();
        org.apache.log4j.Category category8 = logger4.getParent();
        java.lang.String str9 = logger4.getName();
        org.apache.log4j.Level level10 = logger4.getEffectiveLevel();
        logger4.removeAllAppenders();
        logger1.warn((java.lang.Object) logger4);
        logger4.assertLog(true, "org.apache.log4j.Level");
        java.util.ResourceBundle resourceBundle16 = null;
        logger4.setResourceBundle(resourceBundle16);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger4.fatal(obj18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertNull(level10);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.lang.String str4 = logger1.getName();
        org.apache.log4j.Level level5 = logger1.getLevel();
        logger1.removeAppender("io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Appender appender8 = null;
        logger1.removeAppender(appender8);
        org.apache.log4j.Category category10 = logger1.getParent();
        java.util.ResourceBundle resourceBundle11 = logger1.getResourceBundle();
        org.apache.log4j.Appender appender12 = null;
        logger1.removeAppender(appender12);
        org.apache.log4j.Appender appender14 = null;
        logger1.addAppender(appender14);
        org.apache.log4j.Priority priority16 = logger1.getChainedPriority();
        org.apache.log4j.spi.LoggingEvent loggingEvent17 = null;
        logger1.callAppenders(loggingEvent17);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(resourceBundle2);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNull(resourceBundle11);
// flaky:         org.junit.Assert.assertNull(priority16);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
        java.lang.Class<?> wildcardClass4 = logger1.getClass();
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        java.lang.String str6 = logger5.getName();
        java.lang.Class<?> wildcardClass7 = logger5.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.log4j.Logger" + "'", str6, "org.apache.log4j.Logger");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        org.apache.log4j.Level level4 = category1.getPriority();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
        category1.callAppenders(loggingEvent5);
        java.util.ResourceBundle resourceBundle7 = category1.getResourceBundle();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertNull(resourceBundle7);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = null; // flaky: logger1.getAppender("hi!");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Category category5 = null; // flaky: logger1.getParent();
        java.util.Enumeration enumeration6 = null; // flaky: category5.getAllAppenders();
        org.apache.log4j.Appender appender7 = null;
// flaky:         category5.removeAppender(appender7);
// flaky:         org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
// flaky:         org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNull(enumeration6);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
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
        java.util.Set<java.lang.String> strSet28 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl17.eventBus;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl17.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl17.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Logger");
        org.apache.log4j.Appender appender3 = logger1.getAppender("org.apache.log4j.Logger");
        boolean boolean4 = logger1.isInfoEnabled();
        org.apache.log4j.Level level5 = logger1.getLevel();
        logger1.assertLog(false, "hi!");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Category category10 = logger1.getParent();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNotNull(category10);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        java.lang.String str3 = category1.getName();
        org.apache.log4j.Appender appender4 = null;
        category1.removeAppender(appender4);
        boolean boolean6 = category1.getAdditivity();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.log4j.Level" + "'", str3, "org.apache.log4j.Level");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.lang.Object obj3 = null;
        java.lang.Throwable throwable4 = null;
        logger1.fatal(obj3, throwable4);
        boolean boolean6 = logger1.isTraceEnabled();
        boolean boolean7 = logger1.isTraceEnabled();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        logger1.assertLog(true, "root");
        org.apache.log4j.Appender appender12 = null;
        logger1.removeAppender(appender12);
        java.lang.Class<?> wildcardClass14 = logger1.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = logger18.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        category5.removeAppender("");
        org.apache.log4j.Appender appender8 = null;
        category5.addAppender(appender8);
        org.apache.log4j.spi.LoggingEvent loggingEvent10 = null;
        category5.callAppenders(loggingEvent10);
        java.util.ResourceBundle resourceBundle12 = category5.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNull(resourceBundle12);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level7 = logger1.getLevel();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(level6);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(category8);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger1.getHierarchy();
        logger1.removeAllAppenders();
        org.apache.log4j.Appender appender9 = null;
        logger1.addAppender(appender9);
        org.apache.log4j.Level level11 = logger1.getPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNull(level11);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.lang.Class<?> wildcardClass7 = slangImpl0.getClass();
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Priority priority10 = category9.getChainedPriority();
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle13 = null;
        logger12.setResourceBundle(resourceBundle13);
        logger12.removeAllAppenders();
        org.apache.log4j.Category category16 = logger12.getParent();
        org.apache.log4j.Appender appender17 = null;
        category16.removeAppender(appender17);
        org.apache.log4j.Appender appender20 = category16.getAppender("org.apache.log4j.spi.RootLogger");
        java.lang.String str21 = category16.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository22 = category16.getHierarchy();
        java.lang.Throwable throwable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            category9.debug((java.lang.Object) category16, throwable23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(category9);
// flaky:         org.junit.Assert.assertNull(priority10);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNull(appender20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "root" + "'", str21, "root");
        org.junit.Assert.assertNotNull(loggerRepository22);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.ResourceBundle resourceBundle7 = logger2.getResourceBundle();
        org.apache.log4j.Appender appender8 = null;
        logger2.removeAppender(appender8);
        org.apache.log4j.Level level10 = logger2.getPriority();
        org.apache.log4j.Priority priority11 = logger2.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger2.getHierarchy();
        org.apache.log4j.Appender appender13 = null;
        logger2.removeAppender(appender13);
        org.apache.log4j.spi.LoggerRepository loggerRepository15 = logger2.getLoggerRepository();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(resourceBundle7);
        org.junit.Assert.assertNull(level10);
// flaky:         org.junit.Assert.assertNull(priority11);
        org.junit.Assert.assertNotNull(loggerRepository12);
        org.junit.Assert.assertNotNull(loggerRepository15);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        logger2.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
        logger2.removeAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Level level8 = logger2.getPriority();
        org.apache.log4j.Appender appender9 = null;
        logger2.removeAppender(appender9);
        org.apache.log4j.Priority priority11 = logger2.getChainedPriority();
        java.util.Enumeration enumeration12 = logger2.getAllAppenders();
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        org.apache.log4j.Appender appender18 = logger14.getAppender("hi!");
        org.apache.log4j.Category category19 = logger14.getParent();
        java.util.Enumeration enumeration20 = logger14.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository21 = logger14.getLoggerRepository();
        java.lang.Class<?> wildcardClass22 = logger14.getClass();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.apache.log4j.Category category24 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass22);
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.apache.log4j.Category category26 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass22);
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        boolean boolean28 = logger27.isTraceEnabled();
        logger2.debug((java.lang.Object) logger27);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertNotNull(priority11);
        org.junit.Assert.assertNotNull(enumeration12);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNull(appender18);
        org.junit.Assert.assertNotNull(category19);
// flaky:         org.junit.Assert.assertNull(enumeration20);
        org.junit.Assert.assertNotNull(loggerRepository21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(category24);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(category26);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.util.Enumeration enumeration6 = logger1.getAllAppenders();
        java.util.ResourceBundle resourceBundle7 = null;
        logger1.setResourceBundle(resourceBundle7);
        org.apache.log4j.Level level9 = logger1.getPriority();
        java.lang.Object obj10 = null;
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.info(obj10, throwable11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(enumeration6);
        org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(logger19);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory1);
        boolean boolean3 = logger2.isTraceEnabled();
        org.apache.log4j.Appender appender4 = null;
        logger2.addAppender(appender4);
        org.apache.log4j.spi.LoggerFactory loggerFactory7 = null;
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Logger", loggerFactory7);
        logger8.removeAllAppenders();
        java.util.ResourceBundle resourceBundle10 = logger8.getResourceBundle();
        org.apache.log4j.Level level11 = logger8.getLevel();
        org.apache.log4j.Priority priority12 = logger8.getChainedPriority();
        java.lang.Throwable throwable13 = null;
        logger2.info((java.lang.Object) priority12, throwable13);
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl15.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl15.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl15.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl15.score = score24;
        logger2.trace((java.lang.Object) score24);
        org.apache.log4j.Level level27 = logger2.getLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl28 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score29 = null;
        slangImpl28.score = score29;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl28.score = score31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl28.compiler = slangCompiler33;
        io.cloudslang.score.events.EventBus eventBus35 = null;
        slangImpl28.eventBus = eventBus35;
        io.cloudslang.score.api.Score score37 = slangImpl28.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler38 = null;
        slangImpl28.compiler = slangCompiler38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = null;
        slangImpl28.compiler = slangCompiler40;
        io.cloudslang.score.events.EventBus eventBus42 = null;
        slangImpl28.eventBus = eventBus42;
        io.cloudslang.score.events.EventBus eventBus44 = null;
        slangImpl28.eventBus = eventBus44;
        java.lang.Throwable throwable46 = null;
        logger2.warn((java.lang.Object) slangImpl28, throwable46);
        java.lang.String str48 = logger2.getName();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNull(resourceBundle10);
        org.junit.Assert.assertNotNull(level11);
        org.junit.Assert.assertNotNull(priority12);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(level27);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.log4j.Logger" + "'", str48, "org.apache.log4j.Logger");
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet21 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet26 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet26);
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
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl16.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl16.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl16.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl16.compiler = slangCompiler24;
        io.cloudslang.score.api.Score score26 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl16.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl16.compiler = slangCompiler30;
        java.util.Set<java.lang.String> strSet32 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = logger1.getParent();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.setAdditivity(false);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(category6);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        boolean boolean3 = logger2.isDebugEnabled();
        boolean boolean4 = logger2.isDebugEnabled();
        java.util.Enumeration enumeration5 = logger2.getAllAppenders();
        logger2.setAdditivity(false);
        boolean boolean8 = logger2.isTraceEnabled();
        org.apache.log4j.Level level9 = logger2.getEffectiveLevel();
        java.lang.Class<?> wildcardClass10 = logger2.getClass();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(enumeration5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(logger11);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.apache.log4j.Logger logger0 = org.apache.log4j.Logger.getRootLogger();
        java.util.ResourceBundle resourceBundle1 = null;
        logger0.setResourceBundle(resourceBundle1);
        org.apache.log4j.Priority priority3 = logger0.getChainedPriority();
        org.apache.log4j.Appender appender4 = null;
        logger0.addAppender(appender4);
        org.apache.log4j.Appender appender7 = logger0.getAppender("");
        java.lang.Class<?> wildcardClass8 = logger0.getClass();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertNotNull(logger0);
// flaky:         org.junit.Assert.assertNull(priority3);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.lang.String str3 = logger2.getName();
        java.util.ResourceBundle resourceBundle4 = logger2.getResourceBundle();
        org.apache.log4j.Level level5 = logger2.getPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger2.getHierarchy();
        org.apache.log4j.Level level7 = logger2.getPriority();
        org.apache.log4j.Appender appender8 = null;
        boolean boolean9 = logger2.isAttached(appender8);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(resourceBundle4);
        org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = category0.isAttached(appender5);
        java.util.ResourceBundle resourceBundle7 = null;
        category0.setResourceBundle(resourceBundle7);
        category0.removeAllAppenders();
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = category0.isAttached(appender5);
        category0.setAdditivity(true);
        org.apache.log4j.Level level9 = category0.getEffectiveLevel();
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
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
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass16);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass16);
        org.apache.log4j.Appender appender20 = null;
        logger19.removeAppender(appender20);
        org.apache.log4j.Category category22 = logger19.getParent();
        java.lang.Object obj23 = null;
        logger19.error(obj23);
        java.lang.String str25 = logger19.getName();
        java.lang.String str26 = logger19.getName();
        io.cloudslang.lang.api.SlangImpl slangImpl27 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score28 = null;
        slangImpl27.score = score28;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl27.score = score30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl27.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl27.eventBus = eventBus34;
        io.cloudslang.score.api.Score score36 = slangImpl27.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl27.compiler;
        io.cloudslang.score.api.Score score38 = null;
        slangImpl27.score = score38;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl27.score = score40;
        java.lang.Class<?> wildcardClass42 = slangImpl27.getClass();
        org.apache.log4j.Logger logger43 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass42);
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass42);
        org.apache.log4j.Logger logger45 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass42);
        org.apache.log4j.Category category46 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass42);
        org.apache.log4j.Category category47 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass42);
        category47.assertLog(true, "org.apache.log4j.Level");
        org.apache.log4j.Category category51 = category47.getParent();
        java.lang.Throwable throwable52 = null;
        logger19.trace((java.lang.Object) category51, throwable52);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(category22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.log4j.Logger" + "'", str25, "org.apache.log4j.Logger");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.log4j.Logger" + "'", str26, "org.apache.log4j.Logger");
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(category46);
        org.junit.Assert.assertNotNull(category47);
        org.junit.Assert.assertNotNull(category51);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        org.apache.log4j.Level level4 = logger1.getLevel();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle7 = null;
        logger6.setResourceBundle(resourceBundle7);
        logger6.removeAllAppenders();
        org.apache.log4j.Category category10 = logger6.getParent();
        java.lang.String str11 = logger6.getName();
        org.apache.log4j.Appender appender12 = null;
        logger6.removeAppender(appender12);
        org.apache.log4j.Priority priority14 = logger6.getChainedPriority();
        org.apache.log4j.Appender appender16 = logger6.getAppender("root");
        logger6.removeAppender("");
        logger1.info((java.lang.Object) logger6);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
// flaky:         org.junit.Assert.assertNotNull(level4);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertNull(priority14);
        org.junit.Assert.assertNull(appender16);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
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
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        org.apache.log4j.Logger logger0 = org.apache.log4j.Logger.getRootLogger();
        java.util.ResourceBundle resourceBundle1 = null;
        logger0.setResourceBundle(resourceBundle1);
        org.apache.log4j.Priority priority3 = logger0.getChainedPriority();
        org.apache.log4j.Appender appender4 = null;
        logger0.addAppender(appender4);
        org.apache.log4j.Appender appender7 = logger0.getAppender("");
        java.util.ResourceBundle resourceBundle8 = null;
        logger0.setResourceBundle(resourceBundle8);
        org.junit.Assert.assertNotNull(logger0);
// flaky:         org.junit.Assert.assertNull(priority3);
        org.junit.Assert.assertNull(appender7);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        boolean boolean2 = category1.getAdditivity();
        category1.assertLog(false, "org.apache.log4j.Logger");
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl6.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl6.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl6.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl6.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl6.compiler;
        java.lang.Throwable throwable20 = null;
        category1.debug((java.lang.Object) slangCompiler19, throwable20);
        org.apache.log4j.Category category22 = category1.getParent();
        org.apache.log4j.Logger logger24 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle25 = null;
        logger24.setResourceBundle(resourceBundle25);
        org.apache.log4j.Appender appender28 = logger24.getAppender("hi!");
        org.apache.log4j.Category category29 = logger24.getParent();
        java.util.Enumeration enumeration30 = logger24.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository31 = logger24.getLoggerRepository();
        java.lang.Class<?> wildcardClass32 = logger24.getClass();
        org.apache.log4j.Logger logger33 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass32);
        org.apache.log4j.Category category34 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass32);
        org.apache.log4j.Appender appender36 = category34.getAppender("");
        category34.removeAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository38 = category34.getHierarchy();
        category1.info((java.lang.Object) category34);
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender42 = null;
        logger41.addAppender(appender42);
        org.apache.log4j.Priority priority44 = logger41.getChainedPriority();
        org.apache.log4j.Level level45 = logger41.getPriority();
        org.apache.log4j.Appender appender46 = null;
        boolean boolean47 = logger41.isAttached(appender46);
        logger41.removeAllAppenders();
        org.apache.log4j.Appender appender49 = null;
        logger41.addAppender(appender49);
        io.cloudslang.lang.api.SlangImpl.logger = logger41;
        logger41.removeAllAppenders();
        org.apache.log4j.Priority priority53 = logger41.getChainedPriority();
        java.lang.Throwable throwable55 = null;
        // The following exception was thrown during execution in test generation
        try {
            category1.l7dlog(priority53, "java.util.HashSet", throwable55);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(category22);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNull(appender28);
        org.junit.Assert.assertNotNull(category29);
// flaky:         org.junit.Assert.assertNull(enumeration30);
        org.junit.Assert.assertNotNull(loggerRepository31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(logger33);
        org.junit.Assert.assertNotNull(category34);
        org.junit.Assert.assertNull(appender36);
        org.junit.Assert.assertNotNull(loggerRepository38);
        org.junit.Assert.assertNotNull(logger41);
// flaky:         org.junit.Assert.assertNull(priority44);
        org.junit.Assert.assertNull(level45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertNull(priority53);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.lang.Class<?> wildcardClass7 = slangImpl0.getClass();
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = category9.getHierarchy();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(loggerRepository10);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        boolean boolean2 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger4 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle5 = null;
        logger4.setResourceBundle(resourceBundle5);
        logger4.removeAllAppenders();
        org.apache.log4j.Category category8 = logger4.getParent();
        java.lang.String str9 = logger4.getName();
        org.apache.log4j.Level level10 = logger4.getEffectiveLevel();
        logger4.removeAllAppenders();
        logger1.warn((java.lang.Object) logger4);
        org.apache.log4j.Appender appender13 = null;
        logger4.removeAppender(appender13);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertNull(level10);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        org.apache.log4j.Logger logger0 = org.apache.log4j.Logger.getRootLogger();
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        logger2.removeAllAppenders();
        org.apache.log4j.Category category6 = logger2.getParent();
        category6.removeAppender("");
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
        category6.callAppenders(loggingEvent9);
        org.apache.log4j.Priority priority11 = category6.getChainedPriority();
        logger0.setPriority(priority11);
        org.apache.log4j.Appender appender14 = logger0.getAppender("org.apache.log4j.spi.RootLogger");
        logger0.removeAppender("org.apache.log4j.Level");
        org.apache.log4j.spi.LoggingEvent loggingEvent17 = null;
        logger0.callAppenders(loggingEvent17);
        org.apache.log4j.Appender appender19 = null;
        boolean boolean20 = logger0.isAttached(appender19);
        org.apache.log4j.spi.LoggingEvent loggingEvent21 = null;
        logger0.callAppenders(loggingEvent21);
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger0.trace(obj23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category6);
// flaky:         org.junit.Assert.assertNull(priority11);
        org.junit.Assert.assertNull(appender14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        java.util.Enumeration enumeration5 = category0.getAllAppenders();
        category0.setAdditivity(true);
        org.apache.log4j.Priority priority8 = category0.getChainedPriority();
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertNull(enumeration5);
// flaky:         org.junit.Assert.assertNull(priority8);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
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
        org.apache.log4j.spi.LoggerRepository loggerRepository19 = category9.getLoggerRepository();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(enumeration10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(loggerRepository19);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.util.ResourceBundle resourceBundle4 = null;
        logger1.setResourceBundle(resourceBundle4);
        org.apache.log4j.Appender appender7 = logger1.getAppender("hi!");
        java.util.Enumeration enumeration8 = logger1.getAllAppenders();
        java.lang.String str9 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNull(appender7);
// flaky:         org.junit.Assert.assertNotNull(enumeration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.log4j.spi.RootLogger" + "'", str9, "org.apache.log4j.spi.RootLogger");
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = logger1.isAttached(appender4);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
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
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(category14);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource15 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource15, slangSourceSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        logger1.callAppenders(loggingEvent7);
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getHierarchy();
        org.apache.log4j.Level level10 = logger1.getPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertNull(level10);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Level level4 = logger1.getPriority();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.lang.Class<?> wildcardClass6 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        boolean boolean19 = logger18.isTraceEnabled();
        org.apache.log4j.spi.LoggingEvent loggingEvent20 = null;
        logger18.callAppenders(loggingEvent20);
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet23 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl22.getAllEventTypes();
        java.lang.Throwable throwable27 = null;
        logger18.fatal((java.lang.Object) slangImpl22, throwable27);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.ResourceBundle resourceBundle7 = logger2.getResourceBundle();
        org.apache.log4j.Appender appender8 = null;
        logger2.removeAppender(appender8);
        org.apache.log4j.Level level10 = logger2.getPriority();
        org.apache.log4j.Priority priority11 = logger2.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger2.getHierarchy();
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl13.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl13.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl13.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl13.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl13.score;
        io.cloudslang.score.api.Score score23 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl13.compiler = slangCompiler24;
        java.util.Set<java.lang.String> strSet26 = slangImpl13.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl13.compiler = slangCompiler27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl13.compiler = slangCompiler29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl13.compiler = slangCompiler31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl13.eventBus = eventBus33;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet36 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            logger2.fatal((java.lang.Object) strSet36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(resourceBundle7);
        org.junit.Assert.assertNull(level10);
// flaky:         org.junit.Assert.assertNull(priority11);
        org.junit.Assert.assertNotNull(loggerRepository12);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        category1.setAdditivity(true);
        boolean boolean4 = category1.getAdditivity();
        org.apache.log4j.Appender appender5 = null;
        category1.addAppender(appender5);
        java.util.ResourceBundle resourceBundle7 = category1.getResourceBundle();
        org.apache.log4j.spi.LoggingEvent loggingEvent8 = null;
        category1.callAppenders(loggingEvent8);
        org.apache.log4j.Priority priority10 = category1.getChainedPriority();
        category1.setAdditivity(true);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(resourceBundle7);
        org.junit.Assert.assertNotNull(priority10);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Level level2 = logger1.getLevel();
        java.lang.String str3 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.log4j.spi.RootLogger" + "'", str3, "org.apache.log4j.spi.RootLogger");
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        boolean boolean6 = category5.getAdditivity();
        java.util.ResourceBundle resourceBundle7 = category5.getResourceBundle();
        org.apache.log4j.spi.LoggingEvent loggingEvent8 = null;
        category5.callAppenders(loggingEvent8);
        org.apache.log4j.Appender appender10 = null;
        boolean boolean11 = category5.isAttached(appender10);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resourceBundle7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = logger1.getParent();
        boolean boolean7 = logger1.isTraceEnabled();
        java.util.ResourceBundle resourceBundle8 = null;
        logger1.setResourceBundle(resourceBundle8);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.lang.Class<?> wildcardClass11 = logger1.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        java.lang.String str3 = category1.getName();
        org.apache.log4j.spi.LoggingEvent loggingEvent4 = null;
        category1.callAppenders(loggingEvent4);
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl6.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl6.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl6.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl6.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl6.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl6.getAllEventTypes();
        category1.fatal((java.lang.Object) slangImpl6);
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl6.eventBus;
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.log4j.Level" + "'", str3, "org.apache.log4j.Level");
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger2.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent4 = null;
        logger2.callAppenders(loggingEvent4);
        org.apache.log4j.Level level6 = logger2.getLevel();
        org.apache.log4j.Appender appender8 = logger2.getAppender("java.util.HashSet");
        org.apache.log4j.Level level9 = logger2.getPriority();
        org.apache.log4j.Priority priority10 = logger2.getChainedPriority();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNull(level6);
        org.junit.Assert.assertNull(appender8);
        org.junit.Assert.assertNull(level9);
// flaky:         org.junit.Assert.assertNull(priority10);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = category1.getLoggerRepository();
        org.apache.log4j.Category category7 = category1.getParent();
        org.apache.log4j.Priority priority8 = category1.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = category1.getHierarchy();
        org.apache.log4j.Appender appender10 = null;
        category1.removeAppender(appender10);
        category1.removeAppender("");
        org.apache.log4j.Appender appender14 = null;
        category1.removeAppender(appender14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = category1.isInfoEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(category7);
// flaky:         org.junit.Assert.assertNull(priority8);
        org.junit.Assert.assertNotNull(loggerRepository9);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
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
        org.apache.log4j.Appender appender20 = null;
        logger19.addAppender(appender20);
        java.util.Enumeration enumeration22 = logger19.getAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl23.score = score24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl23.score = score26;
        java.util.Set<java.lang.String> strSet28 = slangImpl23.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = slangImpl23.score;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl23.score = score30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl23.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl23.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl23.compiler = slangCompiler35;
        java.util.Set<java.lang.String> strSet37 = slangImpl23.getAllEventTypes();
        io.cloudslang.score.api.Score score38 = slangImpl23.score;
        io.cloudslang.score.events.EventBus eventBus39 = null;
        slangImpl23.eventBus = eventBus39;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler41 = slangImpl23.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = null;
        slangImpl23.compiler = slangCompiler42;
        io.cloudslang.score.events.EventBus eventBus44 = null;
        slangImpl23.eventBus = eventBus44;
        io.cloudslang.score.api.Score score46 = slangImpl23.score;
        // The following exception was thrown during execution in test generation
        try {
            logger19.error((java.lang.Object) slangImpl23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNull(enumeration22);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNull(slangCompiler41);
        org.junit.Assert.assertNull(score46);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
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
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Level level18 = logger17.getPriority();
        org.apache.log4j.spi.LoggingEvent loggingEvent19 = null;
        logger17.callAppenders(loggingEvent19);
        org.apache.log4j.Appender appender21 = null;
        boolean boolean22 = logger17.isAttached(appender21);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNull(level18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("hi!");
        org.apache.log4j.Category category6 = logger1.getParent();
        java.util.Enumeration enumeration7 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        org.apache.log4j.Appender appender9 = null;
        logger1.removeAppender(appender9);
        org.apache.log4j.Level level11 = null;
        logger1.setLevel(level11);
        logger1.assertLog(true, "hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
// flaky:         org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger1.getHierarchy();
        logger1.assertLog(true, "org.apache.log4j.Logger");
        java.util.Enumeration enumeration11 = logger1.getAllAppenders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = logger1.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNotNull(enumeration11);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Category category7 = logger1.getParent();
        org.apache.log4j.Appender appender8 = null;
        category7.removeAppender(appender8);
        java.util.ResourceBundle resourceBundle10 = null;
        category7.setResourceBundle(resourceBundle10);
        java.util.ResourceBundle resourceBundle12 = category7.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNull(resourceBundle12);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender3 = null;
        boolean boolean4 = logger1.isAttached(appender3);
        java.lang.String str5 = logger1.getName();
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl6.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl6.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl6.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl6.getAllEventTypes();
        java.lang.Throwable throwable13 = null;
        logger1.debug((java.lang.Object) strSet12, throwable13);
        java.util.ResourceBundle resourceBundle15 = logger1.getResourceBundle();
        org.apache.log4j.Category category16 = logger1.getParent();
        org.apache.log4j.Appender appender17 = null;
        category16.addAppender(appender17);
        org.apache.log4j.spi.LoggerRepository loggerRepository19 = category16.getLoggerRepository();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.log4j.spi.RootLogger" + "'", str5, "org.apache.log4j.spi.RootLogger");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(resourceBundle15);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(loggerRepository19);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        org.apache.log4j.Level level3 = category0.getEffectiveLevel();
        java.lang.String str4 = category0.getName();
        org.apache.log4j.Level level5 = category0.getEffectiveLevel();
        category0.removeAppender("org.apache.log4j.Level");
        org.junit.Assert.assertNotNull(category0);
// flaky:         org.junit.Assert.assertNull(level3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "root" + "'", str4, "root");
// flaky:         org.junit.Assert.assertNull(level5);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        boolean boolean4 = logger1.isTraceEnabled();
        org.apache.log4j.Level level5 = logger1.getEffectiveLevel();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(level5);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAppender("org.apache.log4j.Level");
        org.apache.log4j.Level level6 = logger1.getLevel();
        org.apache.log4j.Category category7 = logger1.getParent();
        org.apache.log4j.spi.LoggingEvent loggingEvent8 = null;
        category7.callAppenders(loggingEvent8);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNotNull(level6);
        org.junit.Assert.assertNotNull(category7);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        java.lang.String str3 = category1.getName();
        org.apache.log4j.spi.LoggingEvent loggingEvent4 = null;
        category1.callAppenders(loggingEvent4);
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl6.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl6.getAllEventTypes();
        java.lang.Class<?> wildcardClass10 = strSet9.getClass();
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass10);
        org.apache.log4j.Priority priority12 = logger11.getChainedPriority();
        org.apache.log4j.Level level13 = logger11.getPriority();
        category1.setLevel(level13);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.util.ResourceBundle resourceBundle19 = logger16.getResourceBundle();
        java.util.Enumeration enumeration20 = logger16.getAllAppenders();
        java.lang.Throwable throwable21 = null;
        category1.debug((java.lang.Object) logger16, throwable21);
        java.lang.Object obj23 = null;
        category1.fatal(obj23);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.log4j.Level" + "'", str3, "org.apache.log4j.Level");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(priority12);
// flaky:         org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNull(resourceBundle19);
// flaky:         org.junit.Assert.assertNull(enumeration20);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender4 = logger1.getAppender("org.apache.log4j.Level");
        org.apache.log4j.Appender appender5 = null;
        logger1.removeAppender(appender5);
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        logger1.callAppenders(loggingEvent7);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.util.ResourceBundle resourceBundle10 = logger1.getResourceBundle();
        org.apache.log4j.Category category11 = logger1.getParent();
        org.apache.log4j.spi.LoggingEvent loggingEvent12 = null;
        category11.callAppenders(loggingEvent12);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender4);
        org.junit.Assert.assertNull(resourceBundle10);
        org.junit.Assert.assertNotNull(category11);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        java.util.ResourceBundle resourceBundle3 = null;
        logger1.setResourceBundle(resourceBundle3);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.removeAppender("org.apache.log4j.Logger");
        logger1.setAdditivity(true);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(resourceBundle2);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
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
        org.apache.log4j.Category category27 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass25);
        io.cloudslang.lang.api.SlangImpl slangImpl28 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score29 = null;
        slangImpl28.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl28.getAllEventTypes();
        java.util.Set<java.lang.String> strSet32 = slangImpl28.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl28.compiler = slangCompiler33;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl28.score = score35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl28.score = score37;
        java.util.Set<java.lang.String> strSet39 = slangImpl28.getAllEventTypes();
        java.lang.Throwable throwable40 = null;
        category27.debug((java.lang.Object) slangImpl28, throwable40);
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = slangImpl28.compiler;
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
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(slangCompiler42);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
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
        org.apache.log4j.Logger logger24 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass22);
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl26.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl26.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl26.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl26.compiler = slangCompiler31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl26.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl26.compiler = slangCompiler34;
        java.util.Set<java.lang.String> strSet36 = slangImpl26.getAllEventTypes();
        java.util.Set<java.lang.String> strSet37 = slangImpl26.getAllEventTypes();
        java.util.Set<java.lang.String> strSet38 = slangImpl26.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl26.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score41 = null;
        slangImpl26.score = score41;
        io.cloudslang.score.api.Score score43 = null;
        slangImpl26.score = score43;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler45 = null;
        slangImpl26.compiler = slangCompiler45;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler47 = null;
        slangImpl26.compiler = slangCompiler47;
        io.cloudslang.score.events.EventBus eventBus49 = null;
        slangImpl26.eventBus = eventBus49;
        io.cloudslang.score.api.Score score51 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet52 = slangImpl26.getAllEventTypes();
        java.util.Set<java.lang.String> strSet53 = slangImpl26.getAllEventTypes();
        logger25.trace((java.lang.Object) slangImpl26);
        io.cloudslang.score.events.ScoreEventListener scoreEventListener55 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl26.unSubscribeOnEvents(scoreEventListener55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(appender21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(category23);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNull(score51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strSet53);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.lang.Class<?> wildcardClass1 = slangImpl0.getClass();
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass1);
        org.apache.log4j.Appender appender3 = null;
        logger2.addAppender(appender3);
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender7 = null;
        boolean boolean8 = category6.isAttached(appender7);
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = category6.isAttached(appender9);
        java.lang.Class<?> wildcardClass11 = category6.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Level level13 = category12.getLevel();
        logger2.setPriority((org.apache.log4j.Priority) level13);
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = logger2.isAttached(appender15);
        java.util.ResourceBundle resourceBundle17 = logger2.getResourceBundle();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(resourceBundle17);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl0.eventBus = eventBus27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(slangCompiler29);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
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
        org.apache.log4j.Category category15 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass13);
        org.apache.log4j.Appender appender16 = null;
        category15.addAppender(appender16);
        org.apache.log4j.Level level18 = category15.getLevel();
        category15.setAdditivity(false);
        org.apache.log4j.Appender appender21 = null;
        category15.addAppender(appender21);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNotNull(category15);
// flaky:         org.junit.Assert.assertNotNull(level18);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
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
        java.util.Enumeration enumeration12 = logger1.getAllAppenders();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = logger1.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertNull(level9);
// flaky:         org.junit.Assert.assertNull(level10);
        org.junit.Assert.assertNotNull(enumeration11);
        org.junit.Assert.assertNotNull(enumeration12);
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger1.getHierarchy();
        logger1.assertLog(true, "org.apache.log4j.Logger");
        org.apache.log4j.spi.LoggerFactory loggerFactory12 = null;
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger("root", loggerFactory12);
        org.apache.log4j.Appender appender14 = null;
        logger13.removeAppender(appender14);
        org.apache.log4j.Appender appender16 = null;
        logger13.removeAppender(appender16);
        java.util.Enumeration enumeration18 = logger13.getAllAppenders();
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender21 = null;
        category20.addAppender(appender21);
        category20.setAdditivity(true);
        java.lang.String str25 = category20.getName();
        category20.removeAppender("org.apache.log4j.Logger");
        org.apache.log4j.Level level28 = category20.getLevel();
        java.lang.Throwable throwable29 = null;
        logger13.warn((java.lang.Object) level28, throwable29);
        org.apache.log4j.Level level31 = logger13.getEffectiveLevel();
        logger1.setPriority((org.apache.log4j.Priority) level31);
        org.apache.log4j.Appender appender33 = null;
        boolean boolean34 = logger1.isAttached(appender33);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(enumeration18);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(level28);
        org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
        logger1.debug(obj8);
        logger1.assertLog(true, "");
        java.util.ResourceBundle resourceBundle13 = null;
        logger1.setResourceBundle(resourceBundle13);
        logger1.assertLog(false, "");
        org.apache.log4j.spi.LoggerRepository loggerRepository18 = logger1.getHierarchy();
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle21 = null;
        logger20.setResourceBundle(resourceBundle21);
        logger20.removeAllAppenders();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle26 = null;
        logger25.setResourceBundle(resourceBundle26);
        java.lang.Throwable throwable29 = null;
        logger25.fatal((java.lang.Object) 100.0f, throwable29);
        org.apache.log4j.Level level31 = logger25.getEffectiveLevel();
        java.lang.Object[] objArray33 = null;
        java.lang.Throwable throwable34 = null;
        logger20.l7dlog((org.apache.log4j.Priority) level31, "hi!", objArray33, throwable34);
        boolean boolean36 = logger20.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository37 = logger20.getHierarchy();
        org.apache.log4j.Appender appender38 = null;
        logger20.addAppender(appender38);
        java.lang.String str40 = logger20.getName();
        logger1.warn((java.lang.Object) logger20);
        org.apache.log4j.Logger logger43 = org.apache.log4j.Logger.getLogger("");
        logger43.debug((java.lang.Object) (byte) 1);
        boolean boolean46 = logger43.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger43;
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle50 = null;
        logger49.setResourceBundle(resourceBundle50);
        logger49.removeAllAppenders();
        org.apache.log4j.Logger logger54 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle55 = null;
        logger54.setResourceBundle(resourceBundle55);
        java.lang.Throwable throwable58 = null;
        logger54.fatal((java.lang.Object) 100.0f, throwable58);
        org.apache.log4j.Level level60 = logger54.getEffectiveLevel();
        java.lang.Object[] objArray62 = null;
        java.lang.Throwable throwable63 = null;
        logger49.l7dlog((org.apache.log4j.Priority) level60, "hi!", objArray62, throwable63);
        logger43.error((java.lang.Object) objArray62);
        org.apache.log4j.spi.LoggingEvent loggingEvent66 = null;
        logger43.callAppenders(loggingEvent66);
        org.apache.log4j.Level level68 = logger43.getEffectiveLevel();
        logger20.setLevel(level68);
        org.apache.log4j.Logger logger71 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle72 = null;
        logger71.setResourceBundle(resourceBundle72);
        java.lang.Throwable throwable75 = null;
        logger71.fatal((java.lang.Object) 100.0f, throwable75);
        boolean boolean77 = logger71.isDebugEnabled();
        boolean boolean78 = logger71.isDebugEnabled();
        logger71.removeAppender("hi!");
        org.apache.log4j.Level level81 = logger71.getLevel();
        logger71.assertLog(true, "org.apache.log4j.Level");
        java.lang.Object obj85 = null;
        logger71.fatal(obj85);
        logger20.fatal((java.lang.Object) logger71);
        org.apache.log4j.spi.LoggerFactory loggerFactory89 = null;
        org.apache.log4j.Logger logger90 = org.apache.log4j.Logger.getLogger("root", loggerFactory89);
        org.apache.log4j.Appender appender91 = null;
        logger90.removeAppender(appender91);
        org.apache.log4j.Appender appender93 = null;
        logger90.removeAppender(appender93);
        org.apache.log4j.Category category95 = logger90.getParent();
        org.apache.log4j.Level level96 = logger90.getPriority();
        logger20.setLevel(level96);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(loggerRepository18);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(loggerRepository37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(logger54);
        org.junit.Assert.assertNotNull(level60);
        org.junit.Assert.assertNotNull(level68);
        org.junit.Assert.assertNotNull(logger71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(level81);
        org.junit.Assert.assertNotNull(logger90);
        org.junit.Assert.assertNotNull(category95);
        org.junit.Assert.assertNotNull(level96);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Throwable throwable9 = null;
        logger1.fatal((java.lang.Object) (byte) 10, throwable9);
        org.apache.log4j.Appender appender12 = logger1.getAppender("hi!");
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        java.lang.Throwable throwable18 = null;
        logger14.fatal((java.lang.Object) 100.0f, throwable18);
        boolean boolean20 = logger14.isDebugEnabled();
        org.apache.log4j.Appender appender21 = null;
        logger14.addAppender(appender21);
        org.apache.log4j.Appender appender23 = null;
        logger14.addAppender(appender23);
        boolean boolean25 = logger14.isInfoEnabled();
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        logger27.debug((java.lang.Object) (byte) 1);
        boolean boolean30 = logger27.isDebugEnabled();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        logger32.debug((java.lang.Object) (byte) 1);
        boolean boolean35 = logger32.isDebugEnabled();
        java.util.Enumeration enumeration36 = logger32.getAllAppenders();
        java.lang.Throwable throwable37 = null;
        logger27.error((java.lang.Object) logger32, throwable37);
        org.apache.log4j.Level level39 = logger27.getPriority();
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("");
        logger41.debug((java.lang.Object) (byte) 1);
        boolean boolean44 = logger41.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger41;
        org.apache.log4j.Logger logger47 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle48 = null;
        logger47.setResourceBundle(resourceBundle48);
        logger47.removeAllAppenders();
        org.apache.log4j.Logger logger52 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle53 = null;
        logger52.setResourceBundle(resourceBundle53);
        java.lang.Throwable throwable56 = null;
        logger52.fatal((java.lang.Object) 100.0f, throwable56);
        org.apache.log4j.Level level58 = logger52.getEffectiveLevel();
        java.lang.Object[] objArray60 = null;
        java.lang.Throwable throwable61 = null;
        logger47.l7dlog((org.apache.log4j.Priority) level58, "hi!", objArray60, throwable61);
        logger41.error((java.lang.Object) objArray60);
        org.apache.log4j.spi.LoggerRepository loggerRepository64 = logger41.getHierarchy();
        java.lang.Throwable throwable65 = null;
        logger27.warn((java.lang.Object) loggerRepository64, throwable65);
        java.lang.Throwable throwable67 = null;
        logger14.error((java.lang.Object) loggerRepository64, throwable67);
        logger1.fatal((java.lang.Object) loggerRepository64);
        java.lang.Throwable throwable71 = null;
        logger1.error((java.lang.Object) 10L, throwable71);
        org.apache.log4j.spi.LoggerRepository loggerRepository73 = logger1.getHierarchy();
        logger1.removeAppender("org.apache.log4j.spi.RootLogger");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNull(appender12);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(enumeration36);
        org.junit.Assert.assertNotNull(level39);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertNotNull(logger52);
        org.junit.Assert.assertNotNull(level58);
        org.junit.Assert.assertNotNull(loggerRepository64);
        org.junit.Assert.assertNotNull(loggerRepository73);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        org.apache.log4j.Level level24 = logger1.getLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        logger1.error((java.lang.Object) (short) 100);
        logger1.removeAllAppenders();
        boolean boolean29 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(level24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger("");
        logger10.debug((java.lang.Object) (byte) 1);
        boolean boolean13 = logger10.isDebugEnabled();
        logger10.removeAppender("hi!");
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle18 = null;
        logger17.setResourceBundle(resourceBundle18);
        java.lang.Throwable throwable21 = null;
        logger17.fatal((java.lang.Object) 100.0f, throwable21);
        org.apache.log4j.Level level23 = logger17.getEffectiveLevel();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle26 = null;
        logger25.setResourceBundle(resourceBundle26);
        java.lang.Throwable throwable29 = null;
        logger25.fatal((java.lang.Object) 100.0f, throwable29);
        boolean boolean31 = logger25.isDebugEnabled();
        logger10.log((org.apache.log4j.Priority) level23, (java.lang.Object) boolean31);
        org.apache.log4j.Priority priority33 = logger10.getChainedPriority();
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender36 = null;
        logger35.addAppender(appender36);
        org.apache.log4j.spi.LoggerRepository loggerRepository38 = logger35.getHierarchy();
        org.apache.log4j.Logger logger40 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle41 = null;
        logger40.setResourceBundle(resourceBundle41);
        java.lang.Throwable throwable44 = null;
        logger40.fatal((java.lang.Object) 100.0f, throwable44);
        org.apache.log4j.Level level46 = logger40.getEffectiveLevel();
        java.lang.Throwable throwable48 = null;
        logger35.l7dlog((org.apache.log4j.Priority) level46, "hi!", throwable48);
        java.lang.Throwable throwable50 = null;
        logger10.warn((java.lang.Object) level46, throwable50);
        io.cloudslang.lang.api.SlangImpl slangImpl52 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus53 = slangImpl52.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler54 = null;
        slangImpl52.compiler = slangCompiler54;
        io.cloudslang.score.events.EventBus eventBus56 = slangImpl52.eventBus;
        java.lang.Throwable throwable57 = null;
        logger1.log((org.apache.log4j.Priority) level46, (java.lang.Object) slangImpl52, throwable57);
        org.apache.log4j.Logger logger60 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle61 = null;
        logger60.setResourceBundle(resourceBundle61);
        java.lang.Throwable throwable64 = null;
        logger60.fatal((java.lang.Object) 100.0f, throwable64);
        org.apache.log4j.Level level66 = logger60.getEffectiveLevel();
        logger60.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Appender appender69 = null;
        logger60.removeAppender(appender69);
        org.apache.log4j.Category category71 = logger60.getParent();
        logger1.debug((java.lang.Object) category71);
        java.lang.String str73 = category71.getName();
        java.lang.Class<?> wildcardClass74 = category71.getClass();
        org.apache.log4j.Logger logger75 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass74);
        org.apache.log4j.Logger logger76 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass74);
        org.apache.log4j.Category category77 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass74);
        org.apache.log4j.Level level78 = category77.getPriority();
        org.apache.log4j.Category category79 = category77.getParent();
        java.util.ResourceBundle resourceBundle80 = null;
        category77.setResourceBundle(resourceBundle80);
        org.apache.log4j.spi.LoggerRepository loggerRepository82 = category77.getLoggerRepository();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(level23);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(priority33);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(loggerRepository38);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(level46);
        org.junit.Assert.assertNull(eventBus53);
        org.junit.Assert.assertNull(eventBus56);
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertNotNull(level66);
        org.junit.Assert.assertNotNull(category71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "root" + "'", str73, "root");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(logger75);
        org.junit.Assert.assertNotNull(logger76);
        org.junit.Assert.assertNotNull(category77);
// flaky:         org.junit.Assert.assertNotNull(level78);
        org.junit.Assert.assertNotNull(category79);
        org.junit.Assert.assertNotNull(loggerRepository82);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        org.apache.log4j.Level level24 = logger1.getLevel();
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender27 = null;
        logger26.addAppender(appender27);
        org.apache.log4j.Logger logger30 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle31 = null;
        logger30.setResourceBundle(resourceBundle31);
        java.lang.Throwable throwable34 = null;
        logger30.fatal((java.lang.Object) 100.0f, throwable34);
        boolean boolean36 = logger30.isDebugEnabled();
        java.lang.Throwable throwable38 = null;
        logger30.trace((java.lang.Object) 10L, throwable38);
        java.lang.Class<?> wildcardClass40 = logger30.getClass();
        org.apache.log4j.Category category41 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass40);
        org.apache.log4j.Category category42 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass40);
        category42.removeAppender("");
        logger26.error((java.lang.Object) category42);
        logger1.error((java.lang.Object) logger26);
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle49 = null;
        logger48.setResourceBundle(resourceBundle49);
        java.lang.Throwable throwable52 = null;
        logger48.fatal((java.lang.Object) 100.0f, throwable52);
        org.apache.log4j.Level level54 = logger48.getEffectiveLevel();
        logger48.trace((java.lang.Object) (short) 0);
        java.lang.Throwable throwable58 = null;
        logger48.error((java.lang.Object) '4', throwable58);
        org.apache.log4j.Logger logger61 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle62 = null;
        logger61.setResourceBundle(resourceBundle62);
        java.lang.Throwable throwable65 = null;
        logger61.fatal((java.lang.Object) 100.0f, throwable65);
        org.apache.log4j.Level level67 = logger61.getEffectiveLevel();
        boolean boolean68 = logger61.isInfoEnabled();
        org.apache.log4j.Appender appender69 = null;
        boolean boolean70 = logger61.isAttached(appender69);
        logger48.fatal((java.lang.Object) logger61);
        logger26.warn((java.lang.Object) logger48);
        org.apache.log4j.spi.LoggerRepository loggerRepository73 = logger26.getLoggerRepository();
        boolean boolean74 = logger26.isTraceEnabled();
        java.lang.String str75 = logger26.getName();
        org.apache.log4j.Appender appender76 = null;
        logger26.removeAppender(appender76);
        java.lang.Object obj78 = null;
        logger26.warn(obj78);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(level24);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(category41);
        org.junit.Assert.assertNotNull(category42);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertNotNull(level54);
        org.junit.Assert.assertNotNull(logger61);
        org.junit.Assert.assertNotNull(level67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(loggerRepository73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl12.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl12.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = category14.isAttached(appender15);
        org.apache.log4j.Category category17 = category14.getParent();
        org.apache.log4j.Appender appender18 = null;
        category17.removeAppender(appender18);
        category17.assertLog(true, "io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(category17);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
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
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        java.util.Enumeration enumeration4 = category1.getAllAppenders();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
        category1.callAppenders(loggingEvent5);
        boolean boolean7 = category1.getAdditivity();
        java.lang.Class<?> wildcardClass8 = category1.getClass();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass8);
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl10.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl10.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl10.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl10.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl10.compiler = slangCompiler19;
        logger9.debug((java.lang.Object) slangImpl10);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(enumeration4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Logger");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Level level4 = logger1.getPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level4);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent5 = null;
        logger1.callAppenders(loggingEvent5);
        logger1.setAdditivity(true);
        java.util.Enumeration enumeration9 = logger1.getAllAppenders();
        boolean boolean10 = logger1.getAdditivity();
        logger1.removeAppender("java.util.HashSet");
        org.apache.log4j.Appender appender14 = logger1.getAppender("org.apache.log4j.spi.RootLogger");
        java.util.Enumeration enumeration15 = logger1.getAllAppenders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = logger1.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(enumeration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(appender14);
        org.junit.Assert.assertNull(enumeration15);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
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
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Priority priority15 = category14.getChainedPriority();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNotNull(priority15);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
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
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        category16.removeAllAppenders();
        org.apache.log4j.Level level18 = category16.getPriority();
        java.util.ResourceBundle resourceBundle19 = null;
        category16.setResourceBundle(resourceBundle19);
        org.apache.log4j.spi.LoggerRepository loggerRepository21 = category16.getHierarchy();
        org.apache.log4j.Appender appender22 = null;
        boolean boolean23 = category16.isAttached(appender22);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category16);
// flaky:         org.junit.Assert.assertNotNull(level18);
        org.junit.Assert.assertNotNull(loggerRepository21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = logger1.isAttached(appender9);
        org.apache.log4j.Appender appender11 = null;
        logger1.addAppender(appender11);
        boolean boolean13 = logger1.getAdditivity();
        org.apache.log4j.Appender appender15 = logger1.getAppender("org.apache.log4j.Logger");
        org.apache.log4j.Appender appender17 = logger1.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle20 = null;
        logger19.setResourceBundle(resourceBundle20);
        org.apache.log4j.Appender appender23 = logger19.getAppender("hi!");
        org.apache.log4j.Category category24 = logger19.getParent();
        java.util.ResourceBundle resourceBundle25 = category24.getResourceBundle();
        org.apache.log4j.Level level26 = category24.getLevel();
        logger1.setLevel(level26);
        org.apache.log4j.spi.LoggingEvent loggingEvent28 = null;
        logger1.callAppenders(loggingEvent28);
        java.util.ResourceBundle resourceBundle30 = logger1.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(appender15);
        org.junit.Assert.assertNull(appender17);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNull(appender23);
        org.junit.Assert.assertNotNull(category24);
        org.junit.Assert.assertNull(resourceBundle25);
// flaky:         org.junit.Assert.assertNull(level26);
        org.junit.Assert.assertNull(resourceBundle30);
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        category1.setAdditivity(true);
        org.apache.log4j.Appender appender6 = null;
        boolean boolean7 = category1.isAttached(appender6);
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = category1.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
        category1.callAppenders(loggingEvent9);
        org.apache.log4j.Appender appender11 = null;
        category1.addAppender(appender11);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(loggerRepository8);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        logger1.removeAllAppenders();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.apache.log4j.Level level9 = category8.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = category8.isInfoEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category8);
// flaky:         org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        boolean boolean2 = category1.getAdditivity();
        category1.assertLog(false, "org.apache.log4j.Logger");
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl6.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl6.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl6.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl6.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl6.compiler;
        java.lang.Throwable throwable20 = null;
        category1.debug((java.lang.Object) slangCompiler19, throwable20);
        boolean boolean22 = category1.getAdditivity();
        org.apache.log4j.Logger logger24 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle25 = null;
        logger24.setResourceBundle(resourceBundle25);
        org.apache.log4j.Appender appender28 = logger24.getAppender("hi!");
        org.apache.log4j.Category category29 = logger24.getParent();
        java.util.ResourceBundle resourceBundle30 = category29.getResourceBundle();
        org.apache.log4j.Level level31 = category29.getLevel();
        org.apache.log4j.Level level32 = category29.getLevel();
        java.lang.Throwable throwable33 = null;
        category1.info((java.lang.Object) level32, throwable33);
        org.apache.log4j.Level level35 = category1.getPriority();
        org.apache.log4j.Appender appender36 = null;
        category1.removeAppender(appender36);
        java.util.Enumeration enumeration38 = category1.getAllAppenders();
        category1.setAdditivity(true);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNull(appender28);
        org.junit.Assert.assertNotNull(category29);
        org.junit.Assert.assertNull(resourceBundle30);
// flaky:         org.junit.Assert.assertNull(level31);
// flaky:         org.junit.Assert.assertNull(level32);
        org.junit.Assert.assertNotNull(level35);
// flaky:         org.junit.Assert.assertNotNull(enumeration38);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
        category1.callAppenders(loggingEvent2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = category1.getLoggerRepository();
        org.apache.log4j.Appender appender5 = null;
        category1.addAppender(appender5);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(loggerRepository4);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = category1.getLoggerRepository();
        org.apache.log4j.Category category7 = category1.getParent();
        org.apache.log4j.Priority priority8 = category1.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = category1.getHierarchy();
        org.apache.log4j.Appender appender10 = null;
        category1.removeAppender(appender10);
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = category1.getLoggerRepository();
        category1.removeAllAppenders();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNotNull(category7);
// flaky:         org.junit.Assert.assertNull(priority8);
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertNotNull(loggerRepository12);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
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
        org.apache.log4j.spi.LoggingEvent loggingEvent25 = null;
        category24.callAppenders(loggingEvent25);
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
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl23.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl23.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl23.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl23.compiler = slangCompiler28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl23.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl23.compiler = slangCompiler31;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl23.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl23.getAllEventTypes();
        java.util.Set<java.lang.String> strSet36 = slangImpl23.getAllEventTypes();
        io.cloudslang.score.api.Score score37 = slangImpl23.score;
        java.util.Set<java.lang.String> strSet38 = slangImpl23.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl23.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl23.compiler;
        io.cloudslang.score.api.Score score41 = null;
        slangImpl23.score = score41;
        io.cloudslang.score.api.Score score43 = null;
        slangImpl23.score = score43;
        java.util.Set<java.lang.String> strSet45 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet45);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
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
        org.apache.log4j.Level level12 = logger2.getLevel();
        org.apache.log4j.Level level13 = logger2.getLevel();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
// flaky:         org.junit.Assert.assertNull(priority9);
        org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNull(level13);
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
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
        org.apache.log4j.Priority priority16 = logger15.getChainedPriority();
        // The following exception was thrown during execution in test generation
        try {
            logger15.assertLog(false, "hi!");
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
// flaky:         org.junit.Assert.assertNull(priority16);
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
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
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet22 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = slangImpl21.score;
        io.cloudslang.score.api.Score score27 = slangImpl21.score;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl21.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl21.score = score31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl21.compiler;
        java.lang.Throwable throwable34 = null;
        logger15.warn((java.lang.Object) slangImpl21, throwable34);
        org.apache.log4j.spi.LoggerRepository loggerRepository36 = logger15.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl slangImpl37 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score38 = null;
        slangImpl37.score = score38;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl37.score = score40;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = null;
        slangImpl37.compiler = slangCompiler42;
        io.cloudslang.score.events.EventBus eventBus44 = null;
        slangImpl37.eventBus = eventBus44;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler46 = null;
        slangImpl37.compiler = slangCompiler46;
        java.util.Set<java.lang.String> strSet48 = slangImpl37.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler49 = null;
        slangImpl37.compiler = slangCompiler49;
        io.cloudslang.score.api.Score score51 = null;
        slangImpl37.score = score51;
        io.cloudslang.score.events.EventBus eventBus53 = null;
        slangImpl37.eventBus = eventBus53;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler55 = null;
        slangImpl37.compiler = slangCompiler55;
        java.util.Set<java.lang.String> strSet57 = slangImpl37.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus58 = null;
        slangImpl37.eventBus = eventBus58;
        io.cloudslang.score.api.Score score60 = null;
        slangImpl37.score = score60;
        io.cloudslang.score.api.Score score62 = null;
        slangImpl37.score = score62;
        java.lang.Throwable throwable64 = null;
        logger15.info((java.lang.Object) score62, throwable64);
        boolean boolean66 = logger15.getAdditivity();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNull(resourceBundle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(priority19);
        org.junit.Assert.assertNotNull(loggerRepository20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNotNull(loggerRepository36);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("");
        java.util.Enumeration enumeration4 = logger1.getAllAppenders();
        logger1.removeAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl6.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl6.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl6.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl6.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl6.compiler;
        logger1.error((java.lang.Object) slangImpl6);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
// flaky:         org.junit.Assert.assertNull(enumeration4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        logger2.setAdditivity(true);
        org.apache.log4j.Level level5 = logger2.getEffectiveLevel();
        logger2.removeAppender("root");
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(level5);
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        java.util.ResourceBundle resourceBundle12 = null;
        category11.setResourceBundle(resourceBundle12);
        org.apache.log4j.Level level14 = category11.getPriority();
        java.util.ResourceBundle resourceBundle15 = null;
        category11.setResourceBundle(resourceBundle15);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNotNull(category11);
// flaky:         org.junit.Assert.assertNull(level14);
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        java.util.Enumeration enumeration3 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        java.util.ResourceBundle resourceBundle5 = logger1.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertNotNull(enumeration3);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(resourceBundle5);
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
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
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        category20.removeAllAppenders();
        org.apache.log4j.Appender appender22 = null;
        category20.removeAppender(appender22);
        // The following exception was thrown during execution in test generation
        try {
            category20.assertLog(false, "io.cloudslang.lang.api.SlangImpl");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(category20);
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangSource slangSource11 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray12 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet13 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet13, slangSourceArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact15 = slangImpl0.compile(slangSource11, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        java.util.ResourceBundle resourceBundle2 = category1.getResourceBundle();
        category1.removeAllAppenders();
        org.apache.log4j.Appender appender4 = null;
        category1.addAppender(appender4);
        org.apache.log4j.Appender appender6 = null;
        category1.removeAppender(appender6);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNull(resourceBundle2);
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.apache.log4j.Logger logger24 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass23);
        org.apache.log4j.Category category25 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass23);
        org.apache.log4j.Category category26 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass23);
        org.apache.log4j.Category category27 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass23);
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass23);
        org.apache.log4j.Category category29 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass23);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(category25);
        org.junit.Assert.assertNotNull(category26);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(category29);
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        boolean boolean8 = logger2.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger2.getHierarchy();
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = logger2.getLoggerRepository();
        logger2.removeAllAppenders();
        java.lang.Class<?> wildcardClass12 = logger2.getClass();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertNotNull(loggerRepository10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        logger1.removeAllAppenders();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.apache.log4j.Level level9 = logger1.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl10.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl10.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl10.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl10.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl10.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl10.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl10.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl10.compiler = slangCompiler25;
        java.lang.Class<?> wildcardClass27 = slangImpl10.getClass();
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass27);
        org.apache.log4j.Category category29 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass27);
        org.apache.log4j.Logger logger30 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass27);
        io.cloudslang.lang.api.SlangImpl.logger = logger30;
        logger30.removeAppender("org.apache.log4j.Logger");
        java.util.Enumeration enumeration34 = logger30.getAllAppenders();
        org.apache.log4j.Appender appender35 = null;
        logger30.addAppender(appender35);
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.error((java.lang.Object) appender35, throwable37);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNull(level9);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(category29);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertNotNull(enumeration34);
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus25);
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        org.apache.log4j.Appender appender8 = null;
        logger1.removeAppender(appender8);
        org.apache.log4j.Appender appender10 = null;
        logger1.addAppender(appender10);
        org.apache.log4j.Appender appender12 = null;
        boolean boolean13 = logger1.isAttached(appender12);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl6.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl6.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl6.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl6.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl6.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl6.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl6.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl6.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl6.getAllEventTypes();
        java.lang.Throwable throwable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.fatal((java.lang.Object) slangImpl6, throwable27);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
        org.apache.log4j.Logger logger0 = org.apache.log4j.Logger.getRootLogger();
        java.util.ResourceBundle resourceBundle1 = null;
        logger0.setResourceBundle(resourceBundle1);
        logger0.removeAllAppenders();
        logger0.setAdditivity(false);
        org.apache.log4j.Category category6 = logger0.getParent();
        logger0.removeAllAppenders();
        io.cloudslang.lang.api.SlangImpl.logger = logger0;
        java.lang.Class<?> wildcardClass9 = logger0.getClass();
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle13 = null;
        logger12.setResourceBundle(resourceBundle13);
        org.apache.log4j.Appender appender16 = logger12.getAppender("hi!");
        org.apache.log4j.Category category17 = logger12.getParent();
        java.util.Enumeration enumeration18 = logger12.getAllAppenders();
        java.lang.String str19 = logger12.getName();
        org.apache.log4j.Appender appender20 = null;
        boolean boolean21 = logger12.isAttached(appender20);
        logger10.trace((java.lang.Object) appender20);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNull(appender16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNull(enumeration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
        category1.callAppenders(loggingEvent2);
        org.apache.log4j.Level level4 = category1.getEffectiveLevel();
        category1.setAdditivity(false);
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender9 = null;
        logger8.addAppender(appender9);
        logger8.removeAppender("");
        org.apache.log4j.Priority priority13 = logger8.getChainedPriority();
        org.apache.log4j.Appender appender14 = null;
        boolean boolean15 = logger8.isAttached(appender14);
        logger8.setAdditivity(false);
        org.apache.log4j.Level level18 = logger8.getEffectiveLevel();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = category1.isEnabledFor((org.apache.log4j.Priority) level18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(level4);
        org.junit.Assert.assertNotNull(logger8);
// flaky:         org.junit.Assert.assertNull(priority13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertNull(level18);
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
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
        java.util.ResourceBundle resourceBundle18 = category17.getResourceBundle();
        boolean boolean19 = category17.getAdditivity();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNull(resourceBundle18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.ResourceBundle resourceBundle7 = logger2.getResourceBundle();
        org.apache.log4j.Appender appender8 = null;
        logger2.removeAppender(appender8);
        logger2.removeAppender("org.apache.log4j.Level");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = logger2.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(resourceBundle7);
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl slangImpl2 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl2.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl2.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl2.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl2.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl2.score;
        io.cloudslang.score.api.Score score12 = slangImpl2.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl2.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl2.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl2.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl2.score = score17;
        java.lang.Throwable throwable19 = null;
        logger1.fatal((java.lang.Object) score17, throwable19);
        org.apache.log4j.spi.LoggingEvent loggingEvent21 = null;
        logger1.callAppenders(loggingEvent21);
        logger1.removeAppender("root");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
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
        java.util.Enumeration enumeration20 = logger17.getAllAppenders();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNull(enumeration20);
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        org.apache.log4j.Appender appender5 = null;
        logger2.removeAppender(appender5);
        org.apache.log4j.Category category7 = logger2.getParent();
        org.apache.log4j.Level level8 = logger2.getEffectiveLevel();
        org.apache.log4j.Priority priority9 = logger2.getChainedPriority();
        java.util.ResourceBundle resourceBundle10 = logger2.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository11 = logger2.getLoggerRepository();
        java.util.ResourceBundle resourceBundle12 = null;
        logger2.setResourceBundle(resourceBundle12);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertNotNull(priority9);
        org.junit.Assert.assertNull(resourceBundle10);
        org.junit.Assert.assertNotNull(loggerRepository11);
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
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
        org.apache.log4j.Appender appender19 = logger15.getAppender("java.util.HashSet");
        org.apache.log4j.Level level20 = logger15.getLevel();
        java.util.Enumeration enumeration21 = logger15.getAllAppenders();
        logger15.assertLog(true, "org.apache.log4j.spi.RootLogger");
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNull(resourceBundle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(appender19);
// flaky:         org.junit.Assert.assertNotNull(level20);
        org.junit.Assert.assertNotNull(enumeration21);
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangSource slangSource17 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray18 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet19 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet19, slangSourceArray18);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact21 = slangImpl0.compile(slangSource17, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        java.util.ResourceBundle resourceBundle11 = category10.getResourceBundle();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNull(resourceBundle11);
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Category category7 = logger1.getParent();
        category7.setAdditivity(true);
        org.apache.log4j.Level level10 = category7.getLevel();
        java.util.ResourceBundle resourceBundle11 = null;
        category7.setResourceBundle(resourceBundle11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = category7.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category7);
// flaky:         org.junit.Assert.assertNull(level10);
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
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
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
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
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass17);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl20.eventBus;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl20.eventBus;
        java.util.Set<java.lang.String> strSet23 = slangImpl20.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl20.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl20.getAllEventTypes();
        logger19.warn((java.lang.Object) strSet28);
        io.cloudslang.lang.api.SlangImpl slangImpl30 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl30.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl30.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl30.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl30.compiler = slangCompiler35;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl30.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler38 = null;
        slangImpl30.compiler = slangCompiler38;
        io.cloudslang.score.api.Score score40 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet41 = slangImpl30.getAllEventTypes();
        java.util.Set<java.lang.String> strSet42 = slangImpl30.getAllEventTypes();
        java.util.Set<java.lang.String> strSet43 = slangImpl30.getAllEventTypes();
        io.cloudslang.score.api.Score score44 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet45 = slangImpl30.getAllEventTypes();
        java.lang.Throwable throwable46 = null;
        logger19.debug((java.lang.Object) slangImpl30, throwable46);
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler48 = null;
        slangImpl30.compiler = slangCompiler48;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNull(score40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(score44);
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        java.lang.String str13 = category12.getName();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "io.cloudslang.lang.api.SlangImpl" + "'", str13, "io.cloudslang.lang.api.SlangImpl");
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        org.apache.log4j.Appender appender5 = null;
        logger2.removeAppender(appender5);
        java.lang.Throwable throwable8 = null;
        logger2.debug((java.lang.Object) (short) 1, throwable8);
        logger2.assertLog(false, "root");
        org.apache.log4j.Category category13 = logger2.getParent();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category13);
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
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
        org.apache.log4j.Appender appender18 = null;
        boolean boolean19 = logger15.isAttached(appender18);
        org.apache.log4j.spi.LoggerRepository loggerRepository20 = logger15.getLoggerRepository();
        org.apache.log4j.Category category22 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender23 = null;
        category22.addAppender(appender23);
        org.apache.log4j.Appender appender26 = category22.getAppender("root");
        java.util.ResourceBundle resourceBundle27 = null;
        category22.setResourceBundle(resourceBundle27);
        org.apache.log4j.Priority priority29 = category22.getChainedPriority();
        java.lang.Throwable throwable30 = null;
        logger15.warn((java.lang.Object) priority29, throwable30);
        logger15.removeAppender("io.cloudslang.lang.api.SlangImpl");
        org.apache.log4j.Level level34 = logger15.getPriority();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNull(resourceBundle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(loggerRepository20);
        org.junit.Assert.assertNotNull(category22);
        org.junit.Assert.assertNull(appender26);
// flaky:         org.junit.Assert.assertNull(priority29);
// flaky:         org.junit.Assert.assertNotNull(level34);
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test17290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17290");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test17291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17291");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test17292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17292");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangSource slangSource18 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray19 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet20 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet20, slangSourceArray19);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact22 = slangImpl0.compile(slangSource18, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test17293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17293");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        java.util.Enumeration enumeration3 = logger2.getAllAppenders();
        boolean boolean4 = logger2.isInfoEnabled();
        java.lang.Class<?> wildcardClass5 = logger2.getClass();
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(enumeration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(category6);
    }

    @Test
    public void test17294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17294");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Appender appender15 = null;
        boolean boolean16 = category14.isAttached(appender15);
        org.apache.log4j.Category category17 = category14.getParent();
        // The following exception was thrown during execution in test generation
        try {
            category17.assertLog(false, "org.apache.log4j.Logger");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(category17);
    }

    @Test
    public void test17295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17295");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Level", loggerFactory1);
        logger2.removeAppender("");
        java.lang.String str5 = logger2.getName();
        org.apache.log4j.Appender appender7 = logger2.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Level level10 = logger9.getPriority();
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
        java.util.Set<java.lang.String> strSet21 = slangImpl11.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl11.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl11.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl11.compiler;
        java.util.Set<java.lang.String> strSet27 = slangImpl11.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl11.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl11.compiler = slangCompiler29;
        java.util.Set<java.lang.String> strSet31 = slangImpl11.getAllEventTypes();
        java.util.Set<java.lang.String> strSet32 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = null;
        slangImpl11.score = score33;
        java.lang.Throwable throwable35 = null;
// flaky:         logger2.log((org.apache.log4j.Priority) level10, (java.lang.Object) slangImpl11, throwable35);
        org.apache.log4j.Priority priority37 = logger2.getChainedPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl38 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl38.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = null;
        slangImpl38.compiler = slangCompiler40;
        io.cloudslang.score.events.EventBus eventBus42 = slangImpl38.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler43 = null;
        slangImpl38.compiler = slangCompiler43;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler45 = slangImpl38.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler46 = null;
        slangImpl38.compiler = slangCompiler46;
        io.cloudslang.score.events.EventBus eventBus48 = slangImpl38.eventBus;
        java.util.Set<java.lang.String> strSet49 = slangImpl38.getAllEventTypes();
        logger2.debug((java.lang.Object) slangImpl38);
        io.cloudslang.score.events.ScoreEventListener scoreEventListener51 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl38.unSubscribeOnEvents(scoreEventListener51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.log4j.Level" + "'", str5, "org.apache.log4j.Level");
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(logger9);
// flaky:         org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(priority37);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNull(eventBus42);
        org.junit.Assert.assertNull(slangCompiler45);
        org.junit.Assert.assertNull(eventBus48);
        org.junit.Assert.assertNotNull(strSet49);
    }

    @Test
    public void test17296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17296");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Appender appender2 = null;
        logger1.removeAppender(appender2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("root");
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = logger1.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
// flaky:         org.junit.Assert.assertNull(level6);
    }

    @Test
    public void test17297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17297");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17298");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        boolean boolean17 = logger16.getAdditivity();
        java.util.ResourceBundle resourceBundle18 = logger16.getResourceBundle();
        logger16.removeAllAppenders();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(resourceBundle18);
    }

    @Test
    public void test17299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17299");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Priority priority14 = logger13.getChainedPriority();
        java.lang.Class<?> wildcardClass15 = logger13.getClass();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(logger13);
// flaky:         org.junit.Assert.assertNull(priority14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
    }

    @Test
    public void test17300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17300");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender4 = logger1.getAppender("org.apache.log4j.Level");
        org.apache.log4j.Appender appender5 = null;
        logger1.removeAppender(appender5);
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        logger1.callAppenders(loggingEvent7);
        org.apache.log4j.Level level9 = logger1.getLevel();
        org.apache.log4j.Level level10 = logger1.getPriority();
        org.apache.log4j.Appender appender11 = null;
        logger1.removeAppender(appender11);
        logger1.setAdditivity(false);
        org.apache.log4j.spi.LoggerFactory loggerFactory16 = null;
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory16);
        logger17.removeAllAppenders();
        org.apache.log4j.Level level19 = logger17.getPriority();
        java.lang.Throwable throwable20 = null;
        logger1.error((java.lang.Object) level19, throwable20);
        org.apache.log4j.Priority priority22 = logger1.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender4);
// flaky:         org.junit.Assert.assertNotNull(level9);
// flaky:         org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNotNull(logger17);
// flaky:         org.junit.Assert.assertNotNull(level19);
        org.junit.Assert.assertNotNull(priority22);
    }

    @Test
    public void test17301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17301");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
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
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test17302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17302");
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
        org.apache.log4j.Appender appender12 = null;
        logger1.addAppender(appender12);
        java.lang.String str14 = logger1.getName();
        org.apache.log4j.spi.LoggingEvent loggingEvent15 = null;
        logger1.callAppenders(loggingEvent15);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNull(level11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17303");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17304");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.assertLog(true, "");
        org.apache.log4j.Appender appender6 = null;
        category0.addAppender(appender6);
        java.util.ResourceBundle resourceBundle8 = null;
        category0.setResourceBundle(resourceBundle8);
        java.lang.String str10 = category0.getName();
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "root" + "'", str10, "root");
    }

    @Test
    public void test17305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17305");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("root");
        org.apache.log4j.Level level2 = category1.getLevel();
        java.util.ResourceBundle resourceBundle3 = null;
        category1.setResourceBundle(resourceBundle3);
        category1.assertLog(true, "java.util.HashSet");
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = category1.getLoggerRepository();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(level2);
        org.junit.Assert.assertNotNull(loggerRepository8);
    }

    @Test
    public void test17306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17306");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test17307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17307");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test17308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17308");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Category category5 = logger1.getParent();
        org.apache.log4j.Logger logger7 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger7;
        java.lang.Object obj9 = null;
        java.lang.Throwable throwable10 = null;
        logger7.fatal(obj9, throwable10);
        boolean boolean12 = logger7.isInfoEnabled();
        org.apache.log4j.Priority priority13 = logger7.getChainedPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl14.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet17 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl14.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl14.getAllEventTypes();
        java.lang.Class<?> wildcardClass25 = slangImpl14.getClass();
        java.lang.Throwable throwable26 = null;
        logger7.fatal((java.lang.Object) wildcardClass25, throwable26);
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass25);
        java.lang.Throwable throwable30 = null;
        logger1.debug((java.lang.Object) logger29, throwable30);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(priority13);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(logger29);
    }

    @Test
    public void test17309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17309");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        java.lang.String str5 = logger1.getName();
        org.apache.log4j.Category category6 = logger1.getParent();
        org.apache.log4j.Appender appender7 = null;
        category6.addAppender(appender7);
        category6.removeAppender("org.apache.log4j.Level");
        org.apache.log4j.spi.LoggingEvent loggingEvent11 = null;
        category6.callAppenders(loggingEvent11);
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(priority4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(category6);
    }

    @Test
    public void test17310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17310");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17311");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.lang.String str3 = logger1.getName();
        org.apache.log4j.Appender appender5 = logger1.getAppender("");
        org.apache.log4j.Level level6 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = null;
        logger1.removeAppender(appender7);
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
        logger1.callAppenders(loggingEvent9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = logger1.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNull(level6);
    }

    @Test
    public void test17312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17312");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test17313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17313");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test17314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17314");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test17315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17315");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17316");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = logger1.getAppender("root");
        logger1.setAdditivity(true);
        logger1.setAdditivity(false);
        org.apache.log4j.Appender appender12 = null;
        boolean boolean13 = logger1.isAttached(appender12);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority4);
// flaky:         org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17317");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger("");
        logger6.debug((java.lang.Object) (byte) 1);
        boolean boolean9 = logger6.isDebugEnabled();
        java.util.Enumeration enumeration10 = logger6.getAllAppenders();
        java.lang.Throwable throwable11 = null;
        logger1.error((java.lang.Object) logger6, throwable11);
        org.apache.log4j.Level level13 = logger1.getPriority();
        logger1.info((java.lang.Object) (-1.0d));
        org.apache.log4j.Appender appender17 = logger1.getAppender("root");
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle22 = null;
        logger21.setResourceBundle(resourceBundle22);
        java.lang.Throwable throwable25 = null;
        logger21.fatal((java.lang.Object) 100.0f, throwable25);
        org.apache.log4j.Priority priority27 = logger21.getChainedPriority();
        boolean boolean28 = category19.isEnabledFor(priority27);
        org.apache.log4j.Category category29 = category19.getParent();
        java.lang.Throwable throwable30 = null;
        logger1.warn((java.lang.Object) category29, throwable30);
        org.apache.log4j.spi.LoggerRepository loggerRepository32 = category29.getLoggerRepository();
        org.apache.log4j.Appender appender33 = null;
        category29.addAppender(appender33);
        org.apache.log4j.spi.LoggingEvent loggingEvent35 = null;
        category29.callAppenders(loggingEvent35);
        java.util.ResourceBundle resourceBundle37 = category29.getResourceBundle();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(enumeration10);
// flaky:         org.junit.Assert.assertNotNull(level13);
        org.junit.Assert.assertNull(appender17);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(priority27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(category29);
        org.junit.Assert.assertNotNull(loggerRepository32);
        org.junit.Assert.assertNull(resourceBundle37);
    }

    @Test
    public void test17318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17318");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.Level", loggerFactory1);
        java.util.Enumeration enumeration3 = logger2.getAllAppenders();
        org.apache.log4j.Appender appender4 = null;
        logger2.addAppender(appender4);
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl7.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl7.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl7.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl7.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl7.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl7.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl7.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl7.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl7.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl7.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl7.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl7.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl7.eventBus;
        logger2.warn((java.lang.Object) slangImpl7);
        org.apache.log4j.Category category28 = logger2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = category28.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
// flaky:         org.junit.Assert.assertNull(enumeration3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(category28);
    }

    @Test
    public void test17319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17319");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17320");
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
        org.apache.log4j.Category category26 = logger20.getParent();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(enumeration24);
// flaky:         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(category26);
    }

    @Test
    public void test17321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17321");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        boolean boolean5 = logger1.isTraceEnabled();
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level7 = logger1.getPriority();
        org.apache.log4j.Level level8 = logger1.getEffectiveLevel();
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = logger1.isAttached(appender9);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(level6);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17322");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        org.apache.log4j.Priority priority24 = logger1.getChainedPriority();
        logger1.warn((java.lang.Object) (byte) -1);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger28 = org.apache.log4j.Logger.getRootLogger();
        java.lang.Throwable throwable29 = null;
        logger1.trace((java.lang.Object) logger28, throwable29);
        org.apache.log4j.Level level31 = logger1.getLevel();
        org.apache.log4j.Logger logger33 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle34 = null;
        logger33.setResourceBundle(resourceBundle34);
        java.lang.Throwable throwable37 = null;
        logger33.fatal((java.lang.Object) 100.0f, throwable37);
        org.apache.log4j.Level level39 = logger33.getEffectiveLevel();
        java.lang.Object obj40 = null;
        logger33.debug(obj40);
        logger33.assertLog(true, "");
        java.lang.String str45 = logger33.getName();
        java.lang.Throwable throwable46 = null;
        logger1.trace((java.lang.Object) str45, throwable46);
        boolean boolean48 = logger1.getAdditivity();
        org.apache.log4j.Appender appender49 = null;
        logger1.removeAppender(appender49);
        org.apache.log4j.Appender appender51 = null;
        logger1.addAppender(appender51);
        boolean boolean53 = logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(priority24);
        org.junit.Assert.assertNotNull(logger28);
// flaky:         org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertNotNull(logger33);
        org.junit.Assert.assertNotNull(level39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test17323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17323");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        org.apache.log4j.Appender appender8 = null;
        logger1.addAppender(appender8);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle12 = null;
        logger11.setResourceBundle(resourceBundle12);
        logger11.removeAllAppenders();
        org.apache.log4j.Category category15 = logger11.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository16 = logger11.getLoggerRepository();
        org.apache.log4j.Priority priority17 = logger11.getChainedPriority();
        logger1.setPriority(priority17);
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance("root");
        org.apache.log4j.Category category21 = category20.getParent();
        org.apache.log4j.Category category22 = category20.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository23 = category22.getHierarchy();
        java.lang.Throwable throwable24 = null;
        logger1.info((java.lang.Object) category22, throwable24);
        org.apache.log4j.Category category26 = logger1.getParent();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category15);
        org.junit.Assert.assertNotNull(loggerRepository16);
        org.junit.Assert.assertNotNull(priority17);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertNotNull(category21);
        org.junit.Assert.assertNotNull(category22);
        org.junit.Assert.assertNotNull(loggerRepository23);
        org.junit.Assert.assertNotNull(category26);
    }

    @Test
    public void test17324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17324");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test17325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17325");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
        logger1.debug(obj8);
        logger1.assertLog(true, "");
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("");
        logger14.debug((java.lang.Object) (byte) 1);
        boolean boolean17 = logger14.isDebugEnabled();
        logger14.removeAppender("hi!");
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle22 = null;
        logger21.setResourceBundle(resourceBundle22);
        java.lang.Throwable throwable25 = null;
        logger21.fatal((java.lang.Object) 100.0f, throwable25);
        org.apache.log4j.Level level27 = logger21.getEffectiveLevel();
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle30 = null;
        logger29.setResourceBundle(resourceBundle30);
        java.lang.Throwable throwable33 = null;
        logger29.fatal((java.lang.Object) 100.0f, throwable33);
        boolean boolean35 = logger29.isDebugEnabled();
        logger14.log((org.apache.log4j.Priority) level27, (java.lang.Object) boolean35);
        java.lang.Throwable throwable38 = null;
        logger1.l7dlog((org.apache.log4j.Priority) level27, "hi!", throwable38);
        org.apache.log4j.Logger logger41 = org.apache.log4j.Logger.getLogger("");
        logger41.debug((java.lang.Object) (byte) 1);
        boolean boolean44 = logger41.isDebugEnabled();
        logger41.removeAppender("hi!");
        org.apache.log4j.Logger logger48 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle49 = null;
        logger48.setResourceBundle(resourceBundle49);
        java.lang.Throwable throwable52 = null;
        logger48.fatal((java.lang.Object) 100.0f, throwable52);
        org.apache.log4j.Level level54 = logger48.getEffectiveLevel();
        org.apache.log4j.Logger logger56 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle57 = null;
        logger56.setResourceBundle(resourceBundle57);
        java.lang.Throwable throwable60 = null;
        logger56.fatal((java.lang.Object) 100.0f, throwable60);
        boolean boolean62 = logger56.isDebugEnabled();
        logger41.log((org.apache.log4j.Priority) level54, (java.lang.Object) boolean62);
        org.apache.log4j.Priority priority64 = logger41.getChainedPriority();
        java.lang.Throwable throwable66 = null;
        logger1.l7dlog(priority64, "hi!", throwable66);
        java.lang.String str68 = logger1.getName();
        logger1.warn((java.lang.Object) "");
        org.apache.log4j.Logger logger72 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle73 = null;
        logger72.setResourceBundle(resourceBundle73);
        logger72.removeAllAppenders();
        org.apache.log4j.Category category76 = logger72.getParent();
        org.apache.log4j.Logger logger78 = org.apache.log4j.Logger.getLogger("");
        logger78.debug((java.lang.Object) (byte) 1);
        boolean boolean81 = logger78.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger78;
        java.lang.Class<?> wildcardClass83 = logger78.getClass();
        java.lang.Throwable throwable84 = null;
        logger72.debug((java.lang.Object) wildcardClass83, throwable84);
        org.apache.log4j.Logger logger86 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass83);
        org.apache.log4j.Logger logger87 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass83);
        org.apache.log4j.Category category88 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass83);
        org.apache.log4j.Level level89 = category88.getEffectiveLevel();
        logger1.fatal((java.lang.Object) level89);
        logger1.setAdditivity(false);
        org.apache.log4j.Appender appender94 = logger1.getAppender("org.apache.log4j.Level");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(level27);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertNotNull(level54);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(priority64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(logger72);
        org.junit.Assert.assertNotNull(category76);
        org.junit.Assert.assertNotNull(logger78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(logger86);
        org.junit.Assert.assertNotNull(logger87);
        org.junit.Assert.assertNotNull(category88);
// flaky:         org.junit.Assert.assertNull(level89);
        org.junit.Assert.assertNull(appender94);
    }

    @Test
    public void test17326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17326");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getLoggerRepository();
        org.apache.log4j.Category category9 = logger2.getParent();
        org.apache.log4j.Priority priority10 = logger2.getChainedPriority();
        org.apache.log4j.Appender appender11 = null;
        boolean boolean12 = logger2.isAttached(appender11);
        logger2.removeAppender("io.cloudslang.lang.api.SlangImpl");
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
        java.util.ResourceBundle resourceBundle16 = null;
        logger2.setResourceBundle(resourceBundle16);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(priority10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17327");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test17328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17328");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        java.lang.Class<?> wildcardClass24 = level14.getClass();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass24);
        org.apache.log4j.Logger logger26 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass24);
        org.apache.log4j.Category category27 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass24);
        category27.setAdditivity(false);
        org.apache.log4j.Logger logger31 = org.apache.log4j.Logger.getLogger("");
        logger31.debug((java.lang.Object) (byte) 1);
        org.apache.log4j.Category category35 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender36 = null;
        boolean boolean37 = category35.isAttached(appender36);
        org.apache.log4j.Appender appender38 = null;
        boolean boolean39 = category35.isAttached(appender38);
        java.lang.Class<?> wildcardClass40 = category35.getClass();
        logger31.error((java.lang.Object) wildcardClass40);
        java.util.ResourceBundle resourceBundle42 = null;
        logger31.setResourceBundle(resourceBundle42);
        org.apache.log4j.Logger logger45 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender46 = null;
        logger45.addAppender(appender46);
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle50 = null;
        logger49.setResourceBundle(resourceBundle50);
        java.lang.Throwable throwable53 = null;
        logger49.fatal((java.lang.Object) 100.0f, throwable53);
        boolean boolean55 = logger49.isDebugEnabled();
        java.lang.Throwable throwable57 = null;
        logger49.trace((java.lang.Object) 10L, throwable57);
        java.lang.Class<?> wildcardClass59 = logger49.getClass();
        org.apache.log4j.Category category60 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass59);
        org.apache.log4j.Category category61 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass59);
        category61.removeAppender("");
        logger45.error((java.lang.Object) category61);
        java.lang.Class<?> wildcardClass65 = logger45.getClass();
        org.apache.log4j.Category category66 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass65);
        java.lang.Throwable throwable67 = null;
        logger31.error((java.lang.Object) wildcardClass65, throwable67);
        org.apache.log4j.Priority priority69 = logger31.getChainedPriority();
        boolean boolean70 = category27.isEnabledFor(priority69);
        org.apache.log4j.Appender appender71 = null;
        category27.removeAppender(appender71);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(category35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(category60);
        org.junit.Assert.assertNotNull(category61);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(category66);
        org.junit.Assert.assertNotNull(priority69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test17329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17329");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        org.apache.log4j.Level level5 = logger1.getPriority();
        org.apache.log4j.Appender appender7 = logger1.getAppender("root");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender12 = null;
        logger11.addAppender(appender12);
        org.apache.log4j.spi.LoggerRepository loggerRepository14 = logger11.getHierarchy();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        org.apache.log4j.Level level22 = logger16.getEffectiveLevel();
        boolean boolean23 = logger16.isInfoEnabled();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("");
        logger25.debug((java.lang.Object) (byte) 1);
        boolean boolean28 = logger25.isDebugEnabled();
        logger25.removeAppender("hi!");
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle33 = null;
        logger32.setResourceBundle(resourceBundle33);
        java.lang.Throwable throwable36 = null;
        logger32.fatal((java.lang.Object) 100.0f, throwable36);
        org.apache.log4j.Level level38 = logger32.getEffectiveLevel();
        org.apache.log4j.Logger logger40 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle41 = null;
        logger40.setResourceBundle(resourceBundle41);
        java.lang.Throwable throwable44 = null;
        logger40.fatal((java.lang.Object) 100.0f, throwable44);
        boolean boolean46 = logger40.isDebugEnabled();
        logger25.log((org.apache.log4j.Priority) level38, (java.lang.Object) boolean46);
        org.apache.log4j.Priority priority48 = logger25.getChainedPriority();
        org.apache.log4j.Logger logger50 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender51 = null;
        logger50.addAppender(appender51);
        org.apache.log4j.spi.LoggerRepository loggerRepository53 = logger50.getHierarchy();
        org.apache.log4j.Logger logger55 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle56 = null;
        logger55.setResourceBundle(resourceBundle56);
        java.lang.Throwable throwable59 = null;
        logger55.fatal((java.lang.Object) 100.0f, throwable59);
        org.apache.log4j.Level level61 = logger55.getEffectiveLevel();
        java.lang.Throwable throwable63 = null;
        logger50.l7dlog((org.apache.log4j.Priority) level61, "hi!", throwable63);
        java.lang.Throwable throwable65 = null;
        logger25.warn((java.lang.Object) level61, throwable65);
        io.cloudslang.lang.api.SlangImpl slangImpl67 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus68 = slangImpl67.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler69 = null;
        slangImpl67.compiler = slangCompiler69;
        io.cloudslang.score.events.EventBus eventBus71 = slangImpl67.eventBus;
        java.lang.Throwable throwable72 = null;
        logger16.log((org.apache.log4j.Priority) level61, (java.lang.Object) slangImpl67, throwable72);
        logger11.debug((java.lang.Object) logger16);
        io.cloudslang.lang.api.SlangImpl slangImpl75 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus76 = slangImpl75.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler77 = null;
        slangImpl75.compiler = slangCompiler77;
        io.cloudslang.score.events.EventBus eventBus79 = slangImpl75.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler80 = null;
        slangImpl75.compiler = slangCompiler80;
        io.cloudslang.score.api.Score score82 = null;
        slangImpl75.score = score82;
        logger16.trace((java.lang.Object) score82);
        org.apache.log4j.spi.LoggerRepository loggerRepository85 = logger16.getLoggerRepository();
        java.lang.Object obj86 = null;
        java.lang.Throwable throwable87 = null;
        logger16.info(obj86, throwable87);
        java.lang.Throwable throwable89 = null;
        logger1.fatal(obj86, throwable89);
        org.apache.log4j.spi.LoggerRepository loggerRepository91 = logger1.getLoggerRepository();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority4);
        org.junit.Assert.assertNotNull(level5);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(loggerRepository14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(level22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(level38);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(priority48);
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertNotNull(loggerRepository53);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertNotNull(level61);
        org.junit.Assert.assertNull(eventBus68);
        org.junit.Assert.assertNull(eventBus71);
        org.junit.Assert.assertNull(eventBus76);
        org.junit.Assert.assertNull(eventBus79);
        org.junit.Assert.assertNotNull(loggerRepository85);
        org.junit.Assert.assertNotNull(loggerRepository91);
    }

    @Test
    public void test17330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17330");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.lang.Class<?> wildcardClass6 = logger1.getClass();
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Level level8 = logger7.getLevel();
        logger7.removeAllAppenders();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(logger7);
// flaky:         org.junit.Assert.assertNull(level8);
    }

    @Test
    public void test17331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17331");
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
        logger1.setAdditivity(false);
        logger1.removeAllAppenders();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(level11);
        org.junit.Assert.assertNotNull(loggerRepository12);
        org.junit.Assert.assertNotNull(priority13);
    }

    @Test
    public void test17332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17332");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender4 = logger1.getAppender("org.apache.log4j.Level");
        org.apache.log4j.Appender appender5 = null;
        logger1.removeAppender(appender5);
        org.apache.log4j.spi.LoggingEvent loggingEvent7 = null;
        logger1.callAppenders(loggingEvent7);
        org.apache.log4j.Level level9 = logger1.getEffectiveLevel();
        org.apache.log4j.Priority priority10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = logger1.isEnabledFor(priority10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender4);
// flaky:         org.junit.Assert.assertNull(level9);
    }

    @Test
    public void test17333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17333");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl18.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl18.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl18.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl18.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl18.compiler = slangCompiler28;
        io.cloudslang.score.api.Score score30 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl18.score = score32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl18.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl18.compiler = slangCompiler35;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score38 = slangImpl18.score;
        io.cloudslang.score.api.Score score39 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet40 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet41 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet42 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNull(score39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test17334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17334");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        logger8.debug((java.lang.Object) (byte) 1);
        boolean boolean11 = logger8.isDebugEnabled();
        logger8.removeAppender("hi!");
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle16 = null;
        logger15.setResourceBundle(resourceBundle16);
        java.lang.Throwable throwable19 = null;
        logger15.fatal((java.lang.Object) 100.0f, throwable19);
        org.apache.log4j.Level level21 = logger15.getEffectiveLevel();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
        logger23.fatal((java.lang.Object) 100.0f, throwable27);
        boolean boolean29 = logger23.isDebugEnabled();
        logger8.log((org.apache.log4j.Priority) level21, (java.lang.Object) boolean29);
        org.apache.log4j.Priority priority31 = logger8.getChainedPriority();
        logger8.warn((java.lang.Object) (byte) -1);
        java.lang.Throwable throwable34 = null;
        logger1.trace((java.lang.Object) (byte) -1, throwable34);
        org.apache.log4j.Logger logger37 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender38 = null;
        logger37.addAppender(appender38);
        org.apache.log4j.spi.LoggerRepository loggerRepository40 = logger37.getHierarchy();
        boolean boolean41 = logger37.isTraceEnabled();
        org.apache.log4j.Level level42 = logger37.getLevel();
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getLogger("");
        logger44.debug((java.lang.Object) (byte) 1);
        boolean boolean47 = logger44.isDebugEnabled();
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle50 = null;
        logger49.setResourceBundle(resourceBundle50);
        java.lang.Throwable throwable53 = null;
        logger49.fatal((java.lang.Object) 100.0f, throwable53);
        org.apache.log4j.Level level55 = logger49.getEffectiveLevel();
        logger49.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Logger logger59 = org.apache.log4j.Logger.getLogger("");
        logger59.debug((java.lang.Object) (byte) 1);
        boolean boolean62 = logger59.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger59;
        java.lang.Class<?> wildcardClass64 = logger59.getClass();
        java.lang.Throwable throwable65 = null;
        logger49.debug((java.lang.Object) logger59, throwable65);
        boolean boolean67 = logger49.isTraceEnabled();
        java.lang.Throwable throwable68 = null;
        logger44.debug((java.lang.Object) boolean67, throwable68);
        java.lang.Throwable throwable70 = null;
        logger1.log((org.apache.log4j.Priority) level42, (java.lang.Object) logger44, throwable70);
        org.apache.log4j.Appender appender73 = logger44.getAppender("hi!");
        io.cloudslang.lang.api.SlangImpl slangImpl74 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score75 = null;
        slangImpl74.score = score75;
        java.util.Set<java.lang.String> strSet77 = slangImpl74.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler78 = slangImpl74.compiler;
        java.util.Set<java.lang.String> strSet79 = slangImpl74.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler80 = null;
        slangImpl74.compiler = slangCompiler80;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler82 = null;
        slangImpl74.compiler = slangCompiler82;
        java.util.Set<java.lang.String> strSet84 = slangImpl74.getAllEventTypes();
        java.util.Set<java.lang.String> strSet85 = slangImpl74.getAllEventTypes();
        io.cloudslang.score.api.Score score86 = null;
        slangImpl74.score = score86;
        java.util.Set<java.lang.String> strSet88 = slangImpl74.getAllEventTypes();
        logger44.debug((java.lang.Object) slangImpl74);
        io.cloudslang.lang.api.SlangImpl slangImpl90 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score91 = null;
        slangImpl90.score = score91;
        io.cloudslang.score.api.Score score93 = null;
        slangImpl90.score = score93;
        java.util.Set<java.lang.String> strSet95 = slangImpl90.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler96 = null;
        slangImpl90.compiler = slangCompiler96;
        java.lang.Throwable throwable98 = null;
        logger44.trace((java.lang.Object) slangCompiler96, throwable98);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(level21);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(priority31);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(loggerRepository40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(level42);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(level55);
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(appender73);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNull(slangCompiler78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(strSet95);
    }

    @Test
    public void test17335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17335");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        java.util.Enumeration enumeration5 = logger1.getAllAppenders();
        java.lang.Throwable throwable7 = null;
        logger1.error((java.lang.Object) 100, throwable7);
        org.apache.log4j.Priority priority9 = logger1.getChainedPriority();
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = logger1.getLoggerRepository();
        org.apache.log4j.Level level11 = logger1.getLevel();
        org.apache.log4j.Appender appender12 = null;
        boolean boolean13 = logger1.isAttached(appender12);
        boolean boolean14 = logger1.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(enumeration5);
        org.junit.Assert.assertNotNull(priority9);
        org.junit.Assert.assertNotNull(loggerRepository10);
        org.junit.Assert.assertNotNull(level11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17336");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
        logger1.debug(obj8);
        logger1.assertLog(true, "");
        java.util.ResourceBundle resourceBundle13 = null;
        logger1.setResourceBundle(resourceBundle13);
        logger1.assertLog(false, "");
        org.apache.log4j.spi.LoggerRepository loggerRepository18 = logger1.getHierarchy();
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle21 = null;
        logger20.setResourceBundle(resourceBundle21);
        logger20.removeAllAppenders();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle26 = null;
        logger25.setResourceBundle(resourceBundle26);
        java.lang.Throwable throwable29 = null;
        logger25.fatal((java.lang.Object) 100.0f, throwable29);
        org.apache.log4j.Level level31 = logger25.getEffectiveLevel();
        java.lang.Object[] objArray33 = null;
        java.lang.Throwable throwable34 = null;
        logger20.l7dlog((org.apache.log4j.Priority) level31, "hi!", objArray33, throwable34);
        boolean boolean36 = logger20.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository37 = logger20.getHierarchy();
        org.apache.log4j.Appender appender38 = null;
        logger20.addAppender(appender38);
        java.lang.String str40 = logger20.getName();
        logger1.warn((java.lang.Object) logger20);
        org.apache.log4j.Appender appender42 = null;
        logger20.removeAppender(appender42);
        logger20.setAdditivity(true);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(loggerRepository18);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(level31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(loggerRepository37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test17337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17337");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle9 = null;
        logger8.setResourceBundle(resourceBundle9);
        java.lang.Throwable throwable12 = null;
        logger8.fatal((java.lang.Object) 100.0f, throwable12);
        org.apache.log4j.Level level14 = logger8.getEffectiveLevel();
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        boolean boolean22 = logger16.isDebugEnabled();
        logger1.log((org.apache.log4j.Priority) level14, (java.lang.Object) boolean22);
        org.apache.log4j.Priority priority24 = logger1.getChainedPriority();
        logger1.warn((java.lang.Object) (byte) -1);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository28 = logger1.getLoggerRepository();
        boolean boolean29 = logger1.isTraceEnabled();
        java.util.Enumeration enumeration30 = logger1.getAllAppenders();
        java.util.Enumeration enumeration31 = logger1.getAllAppenders();
        logger1.assertLog(false, "hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(level14);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(priority24);
        org.junit.Assert.assertNotNull(loggerRepository28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(enumeration30);
        org.junit.Assert.assertNull(enumeration31);
    }

    @Test
    public void test17338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17338");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test17339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17339");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl0.score = score27;
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17340");
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
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        category20.assertLog(true, "org.apache.log4j.Level");
        org.apache.log4j.Category category24 = category20.getParent();
        org.apache.log4j.Appender appender25 = null;
        category24.addAppender(appender25);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertNotNull(category24);
    }

    @Test
    public void test17341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17341");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        java.lang.Object obj8 = null;
        logger1.debug(obj8);
        logger1.assertLog(true, "");
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle17 = null;
        logger16.setResourceBundle(resourceBundle17);
        java.lang.Throwable throwable20 = null;
        logger16.fatal((java.lang.Object) 100.0f, throwable20);
        org.apache.log4j.Level level22 = logger16.getEffectiveLevel();
        boolean boolean23 = logger16.isInfoEnabled();
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl24.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl24.compiler = slangCompiler26;
        java.lang.Throwable throwable28 = null;
        logger16.info((java.lang.Object) slangImpl24, throwable28);
        java.lang.String str30 = logger16.getName();
        org.apache.log4j.Logger logger32 = org.apache.log4j.Logger.getLogger("");
        logger32.debug((java.lang.Object) (byte) 1);
        boolean boolean35 = logger32.isDebugEnabled();
        logger32.removeAppender("hi!");
        org.apache.log4j.Logger logger39 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle40 = null;
        logger39.setResourceBundle(resourceBundle40);
        java.lang.Throwable throwable43 = null;
        logger39.fatal((java.lang.Object) 100.0f, throwable43);
        org.apache.log4j.Level level45 = logger39.getEffectiveLevel();
        org.apache.log4j.Logger logger47 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle48 = null;
        logger47.setResourceBundle(resourceBundle48);
        java.lang.Throwable throwable51 = null;
        logger47.fatal((java.lang.Object) 100.0f, throwable51);
        boolean boolean53 = logger47.isDebugEnabled();
        logger32.log((org.apache.log4j.Priority) level45, (java.lang.Object) boolean53);
        boolean boolean55 = logger16.isEnabledFor((org.apache.log4j.Priority) level45);
        org.apache.log4j.Logger logger57 = org.apache.log4j.Logger.getLogger("");
        logger57.debug((java.lang.Object) (byte) 1);
        boolean boolean60 = logger57.isDebugEnabled();
        logger57.removeAppender("hi!");
        org.apache.log4j.Level level63 = logger57.getEffectiveLevel();
        java.lang.Throwable throwable64 = null;
        logger16.warn((java.lang.Object) logger57, throwable64);
        org.apache.log4j.Logger logger67 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle68 = null;
        logger67.setResourceBundle(resourceBundle68);
        java.lang.Throwable throwable71 = null;
        logger67.fatal((java.lang.Object) 100.0f, throwable71);
        boolean boolean73 = logger67.isDebugEnabled();
        java.lang.Throwable throwable75 = null;
        logger67.trace((java.lang.Object) 10L, throwable75);
        java.lang.Class<?> wildcardClass77 = logger67.getClass();
        org.apache.log4j.Category category78 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass77);
        org.apache.log4j.Category category79 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass77);
        org.apache.log4j.spi.LoggerRepository loggerRepository80 = category79.getHierarchy();
        logger16.info((java.lang.Object) loggerRepository80);
        org.apache.log4j.Level level82 = logger16.getEffectiveLevel();
        org.apache.log4j.Logger logger84 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle85 = null;
        logger84.setResourceBundle(resourceBundle85);
        java.lang.Throwable throwable88 = null;
        logger84.fatal((java.lang.Object) 100.0f, throwable88);
        org.apache.log4j.Level level90 = logger84.getEffectiveLevel();
        java.lang.Throwable throwable91 = null;
        logger16.fatal((java.lang.Object) logger84, throwable91);
        java.lang.Throwable throwable93 = null;
        logger1.trace((java.lang.Object) logger84, throwable93);
        org.apache.log4j.spi.LoggerRepository loggerRepository95 = logger84.getHierarchy();
        boolean boolean96 = logger84.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(level22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertNotNull(level45);
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(logger57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(level63);
        org.junit.Assert.assertNotNull(logger67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(category78);
        org.junit.Assert.assertNotNull(category79);
        org.junit.Assert.assertNotNull(loggerRepository80);
        org.junit.Assert.assertNotNull(level82);
        org.junit.Assert.assertNotNull(logger84);
        org.junit.Assert.assertNotNull(level90);
        org.junit.Assert.assertNotNull(loggerRepository95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test17342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17342");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Category category7 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Category category8 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass6);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(logger14);
    }

    @Test
    public void test17343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17343");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger("");
        logger8.debug((java.lang.Object) (byte) 1);
        boolean boolean11 = logger8.isDebugEnabled();
        logger8.removeAppender("hi!");
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle16 = null;
        logger15.setResourceBundle(resourceBundle16);
        java.lang.Throwable throwable19 = null;
        logger15.fatal((java.lang.Object) 100.0f, throwable19);
        org.apache.log4j.Level level21 = logger15.getEffectiveLevel();
        org.apache.log4j.Logger logger23 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle24 = null;
        logger23.setResourceBundle(resourceBundle24);
        java.lang.Throwable throwable27 = null;
        logger23.fatal((java.lang.Object) 100.0f, throwable27);
        boolean boolean29 = logger23.isDebugEnabled();
        logger8.log((org.apache.log4j.Priority) level21, (java.lang.Object) boolean29);
        org.apache.log4j.Priority priority31 = logger8.getChainedPriority();
        logger8.warn((java.lang.Object) (byte) -1);
        java.lang.Throwable throwable34 = null;
        logger1.trace((java.lang.Object) (byte) -1, throwable34);
        org.apache.log4j.Logger logger37 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender38 = null;
        logger37.addAppender(appender38);
        org.apache.log4j.spi.LoggerRepository loggerRepository40 = logger37.getHierarchy();
        boolean boolean41 = logger37.isTraceEnabled();
        org.apache.log4j.Level level42 = logger37.getLevel();
        org.apache.log4j.Logger logger44 = org.apache.log4j.Logger.getLogger("");
        logger44.debug((java.lang.Object) (byte) 1);
        boolean boolean47 = logger44.isDebugEnabled();
        org.apache.log4j.Logger logger49 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle50 = null;
        logger49.setResourceBundle(resourceBundle50);
        java.lang.Throwable throwable53 = null;
        logger49.fatal((java.lang.Object) 100.0f, throwable53);
        org.apache.log4j.Level level55 = logger49.getEffectiveLevel();
        logger49.trace((java.lang.Object) (short) 0);
        org.apache.log4j.Logger logger59 = org.apache.log4j.Logger.getLogger("");
        logger59.debug((java.lang.Object) (byte) 1);
        boolean boolean62 = logger59.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger59;
        java.lang.Class<?> wildcardClass64 = logger59.getClass();
        java.lang.Throwable throwable65 = null;
        logger49.debug((java.lang.Object) logger59, throwable65);
        boolean boolean67 = logger49.isTraceEnabled();
        java.lang.Throwable throwable68 = null;
        logger44.debug((java.lang.Object) boolean67, throwable68);
        java.lang.Throwable throwable70 = null;
        logger1.log((org.apache.log4j.Priority) level42, (java.lang.Object) logger44, throwable70);
        org.apache.log4j.Logger logger73 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle74 = null;
        logger73.setResourceBundle(resourceBundle74);
        java.lang.Throwable throwable77 = null;
        logger73.fatal((java.lang.Object) 100.0f, throwable77);
        boolean boolean79 = logger73.isDebugEnabled();
        boolean boolean80 = logger73.isDebugEnabled();
        logger73.removeAppender("hi!");
        org.apache.log4j.Logger logger84 = org.apache.log4j.Logger.getLogger("hi!");
        logger73.info((java.lang.Object) "hi!");
        logger73.assertLog(true, "org.apache.log4j.Level");
        logger73.assertLog(true, "hi!");
        org.apache.log4j.spi.LoggerRepository loggerRepository92 = logger73.getHierarchy();
        logger44.trace((java.lang.Object) logger73);
        org.apache.log4j.Level level94 = logger73.getEffectiveLevel();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(level21);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(priority31);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(loggerRepository40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(level42);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(level55);
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(logger73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(logger84);
        org.junit.Assert.assertNotNull(loggerRepository92);
        org.junit.Assert.assertNotNull(level94);
    }

    @Test
    public void test17344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17344");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        logger1.debug((java.lang.Object) (byte) 1);
        boolean boolean4 = logger1.isDebugEnabled();
        logger1.removeAppender("hi!");
        boolean boolean7 = logger1.isInfoEnabled();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle10 = null;
        logger9.setResourceBundle(resourceBundle10);
        logger9.removeAllAppenders();
        logger1.fatal((java.lang.Object) logger9);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender16 = logger1.getAppender("");
        org.apache.log4j.Appender appender17 = null;
        logger1.removeAppender(appender17);
        org.apache.log4j.spi.LoggerRepository loggerRepository19 = logger1.getHierarchy();
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle22 = null;
        logger21.setResourceBundle(resourceBundle22);
        logger21.removeAllAppenders();
        org.apache.log4j.Category category25 = logger21.getParent();
        org.apache.log4j.Logger logger27 = org.apache.log4j.Logger.getLogger("");
        logger27.debug((java.lang.Object) (byte) 1);
        boolean boolean30 = logger27.isDebugEnabled();
        io.cloudslang.lang.api.SlangImpl.logger = logger27;
        java.lang.Class<?> wildcardClass32 = logger27.getClass();
        java.lang.Throwable throwable33 = null;
        logger21.debug((java.lang.Object) wildcardClass32, throwable33);
        org.apache.log4j.Logger logger35 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass32);
        org.apache.log4j.Category category36 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass32);
        logger1.info((java.lang.Object) wildcardClass32);
        org.apache.log4j.Logger logger38 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass32);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNull(appender16);
        org.junit.Assert.assertNotNull(loggerRepository19);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(category25);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(category36);
        org.junit.Assert.assertNotNull(logger38);
    }

    @Test
    public void test17345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17345");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        java.lang.Throwable throwable5 = null;
        logger1.fatal((java.lang.Object) 100.0f, throwable5);
        boolean boolean7 = logger1.isDebugEnabled();
        java.lang.Throwable throwable9 = null;
        logger1.trace((java.lang.Object) 10L, throwable9);
        org.apache.log4j.Logger logger12 = org.apache.log4j.Logger.getLogger("");
        logger12.debug((java.lang.Object) (byte) 1);
        boolean boolean15 = logger12.isDebugEnabled();
        logger12.removeAppender("hi!");
        boolean boolean18 = logger12.isInfoEnabled();
        java.lang.Throwable throwable19 = null;
        logger1.info((java.lang.Object) boolean18, throwable19);
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle23 = null;
        logger22.setResourceBundle(resourceBundle23);
        org.apache.log4j.Appender appender26 = logger22.getAppender("hi!");
        org.apache.log4j.Category category27 = logger22.getParent();
        java.util.Enumeration enumeration28 = logger22.getAllAppenders();
        java.lang.String str29 = logger22.getName();
        boolean boolean30 = logger22.isDebugEnabled();
        java.lang.Throwable throwable31 = null;
        logger1.fatal((java.lang.Object) boolean30, throwable31);
        io.cloudslang.lang.api.SlangImpl slangImpl33 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score34 = null;
        slangImpl33.score = score34;
        java.util.Set<java.lang.String> strSet36 = slangImpl33.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus37 = slangImpl33.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler38 = slangImpl33.compiler;
        java.lang.Class<?> wildcardClass39 = slangImpl33.getClass();
        java.lang.Throwable throwable40 = null;
        logger1.trace((java.lang.Object) wildcardClass39, throwable40);
        org.apache.log4j.spi.LoggingEvent loggingEvent42 = null;
        logger1.callAppenders(loggingEvent42);
        logger1.removeAllAppenders();
        org.apache.log4j.Level level45 = logger1.getEffectiveLevel();
        java.lang.Object obj46 = null;
        java.lang.Throwable throwable47 = null;
        logger1.fatal(obj46, throwable47);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNull(appender26);
        org.junit.Assert.assertNotNull(category27);
        org.junit.Assert.assertNotNull(enumeration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(eventBus37);
        org.junit.Assert.assertNull(slangCompiler38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(level45);
    }

    @Test
    public void test17346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17346");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test17347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17347");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        io.cloudslang.lang.api.SlangImpl.logger = logger7;
        java.util.ResourceBundle resourceBundle9 = null;
        logger7.setResourceBundle(resourceBundle9);
        org.apache.log4j.Appender appender11 = null;
        logger7.addAppender(appender11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = logger7.isInfoEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test17348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17348");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        java.lang.Class<?> wildcardClass5 = priority4.getClass();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass5);
        org.apache.log4j.Level level7 = logger6.getPriority();
        boolean boolean8 = logger6.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(logger6);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17349");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.apache.log4j.Category category19 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass18);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass18);
        org.apache.log4j.Appender appender21 = null;
        boolean boolean22 = logger20.isAttached(appender21);
        boolean boolean23 = logger20.getAdditivity();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17350");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("hi!");
        org.apache.log4j.Category category6 = logger1.getParent();
        java.util.Enumeration enumeration7 = logger1.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        org.apache.log4j.Appender appender9 = null;
        logger1.removeAppender(appender9);
        org.apache.log4j.Level level11 = null;
        logger1.setLevel(level11);
        logger1.removeAppender("org.apache.log4j.Logger");
        java.util.ResourceBundle resourceBundle15 = null;
        logger1.setResourceBundle(resourceBundle15);
        java.lang.Class<?> wildcardClass17 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17351");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = logger1.getParent();
        java.util.Enumeration enumeration7 = logger1.getAllAppenders();
        org.apache.log4j.Priority priority8 = logger1.getChainedPriority();
        org.apache.log4j.Level level9 = logger1.getLevel();
        org.apache.log4j.spi.LoggingEvent loggingEvent10 = null;
        logger1.callAppenders(loggingEvent10);
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger1.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(priority8);
// flaky:         org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNotNull(loggerRepository12);
    }

    @Test
    public void test17352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17352");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl9.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl9.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl9.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17353");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        java.util.Enumeration enumeration5 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggingEvent loggingEvent6 = null;
        logger2.callAppenders(loggingEvent6);
        java.util.ResourceBundle resourceBundle8 = logger2.getResourceBundle();
        org.apache.log4j.Level level9 = logger2.getLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl10.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl10.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl10.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl10.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl10.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl10.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl10.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = slangImpl10.getClass();
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass21);
        logger2.trace((java.lang.Object) logger22);
        org.junit.Assert.assertNotNull(logger2);
// flaky:         org.junit.Assert.assertNull(enumeration5);
        org.junit.Assert.assertNull(resourceBundle8);
        org.junit.Assert.assertNotNull(level9);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(logger22);
    }

    @Test
    public void test17354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17354");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test17355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17355");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource17 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray18 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet19 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet19, slangSourceArray18);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact21 = slangImpl0.compile(slangSource17, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17356");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test17357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17357");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test17358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17358");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test17359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17359");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangSource slangSource14 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray15 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet16 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet16, slangSourceArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact18 = slangImpl0.compile(slangSource14, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17360");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        org.apache.log4j.Level level3 = category1.getLevel();
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        boolean boolean6 = category1.isInfoEnabled();
        org.junit.Assert.assertNotNull(category1);
// flaky:         org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test17361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17361");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level7 = logger1.getLevel();
        org.apache.log4j.Appender appender8 = null;
        logger1.removeAppender(appender8);
        org.apache.log4j.Category category10 = logger1.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository11 = category10.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(level6);
// flaky:         org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNotNull(loggerRepository11);
    }

    @Test
    public void test17362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17362");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.lang.Class<?> wildcardClass7 = slangImpl0.getClass();
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        boolean boolean9 = logger8.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = logger8.getLoggerRepository();
        org.apache.log4j.spi.LoggerRepository loggerRepository11 = logger8.getHierarchy();
        org.apache.log4j.Appender appender13 = logger8.getAppender("");
        boolean boolean14 = logger8.getAdditivity();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(logger8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(loggerRepository10);
        org.junit.Assert.assertNotNull(loggerRepository11);
        org.junit.Assert.assertNull(appender13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17363");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        org.apache.log4j.Appender appender5 = logger1.getAppender("hi!");
        boolean boolean6 = logger1.getAdditivity();
        org.apache.log4j.Logger logger8 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger8;
        org.apache.log4j.spi.LoggerRepository loggerRepository10 = logger8.getLoggerRepository();
        org.apache.log4j.Level level11 = logger8.getLevel();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            logger1.trace((java.lang.Object) logger8, throwable12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(loggerRepository10);
        org.junit.Assert.assertNull(level11);
    }

    @Test
    public void test17364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17364");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17365");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender22 = logger20.getAppender("hi!");
        org.apache.log4j.Appender appender23 = null;
        logger20.addAppender(appender23);
        org.apache.log4j.Level level25 = logger20.getEffectiveLevel();
        org.apache.log4j.Level level26 = logger20.getLevel();
        org.apache.log4j.Category category28 = org.apache.log4j.Category.getInstance("root");
        org.apache.log4j.Level level29 = category28.getLevel();
        org.apache.log4j.Category category30 = category28.getParent();
        org.apache.log4j.Priority priority31 = category30.getChainedPriority();
        org.apache.log4j.Level level32 = category30.getPriority();
        java.lang.Throwable throwable33 = null;
        logger20.error((java.lang.Object) level32, throwable33);
        // The following exception was thrown during execution in test generation
        try {
            logger18.warn((java.lang.Object) logger20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNull(appender22);
        org.junit.Assert.assertNotNull(level25);
// flaky:         org.junit.Assert.assertNotNull(level26);
        org.junit.Assert.assertNotNull(category28);
        org.junit.Assert.assertNotNull(level29);
        org.junit.Assert.assertNotNull(category30);
// flaky:         org.junit.Assert.assertNull(priority31);
// flaky:         org.junit.Assert.assertNull(level32);
    }

    @Test
    public void test17366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17366");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        org.apache.log4j.Appender appender5 = null;
        logger2.removeAppender(appender5);
        org.apache.log4j.Category category7 = logger2.getParent();
        org.apache.log4j.Level level8 = logger2.getEffectiveLevel();
        boolean boolean9 = logger2.isInfoEnabled();
        org.apache.log4j.Level level10 = logger2.getLevel();
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl11.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl11.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl11.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl11.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl11.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl11.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl11.score = score24;
        io.cloudslang.score.api.Score score26 = slangImpl11.score;
        logger2.trace((java.lang.Object) score26);
        boolean boolean28 = logger2.isDebugEnabled();
        boolean boolean29 = logger2.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category7);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(level10);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test17367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17367");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17368");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test17369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17369");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Level level6 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level7 = logger1.getLevel();
        org.apache.log4j.Level level8 = logger1.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl9.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl9.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl9.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl9.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = slangImpl9.getClass();
        org.apache.log4j.Category category22 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass21);
        java.lang.Throwable throwable23 = null;
        logger1.warn((java.lang.Object) wildcardClass21, throwable23);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(level6);
// flaky:         org.junit.Assert.assertNotNull(level7);
// flaky:         org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(category22);
    }

    @Test
    public void test17370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17370");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17371");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.apache.log4j.Category category10 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass9);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass9);
        io.cloudslang.lang.api.SlangImpl.logger = logger11;
        java.util.ResourceBundle resourceBundle13 = null;
        logger11.setResourceBundle(resourceBundle13);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(category10);
        org.junit.Assert.assertNotNull(logger11);
    }

    @Test
    public void test17372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17372");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        java.lang.String str7 = logger1.getName();
        org.apache.log4j.Category category8 = logger1.getParent();
        org.apache.log4j.Level level9 = category8.getLevel();
        java.lang.Class<?> wildcardClass10 = category8.getClass();
        org.apache.log4j.Category category11 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass10);
        org.apache.log4j.Appender appender13 = category11.getAppender("hi!");
        org.apache.log4j.Priority priority14 = category11.getChainedPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(category8);
// flaky:         org.junit.Assert.assertNull(level9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNull(appender13);
// flaky:         org.junit.Assert.assertNull(priority14);
    }

    @Test
    public void test17373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17373");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17374");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test17375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17375");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl27 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl27.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl27.compiler = slangCompiler29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl27.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl27.compiler = slangCompiler32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl27.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl27.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = slangImpl27.score;
        java.util.Set<java.lang.String> strSet38 = slangImpl27.getAllEventTypes();
        java.util.Set<java.lang.String> strSet39 = slangImpl27.getAllEventTypes();
        java.util.Set<java.lang.String> strSet40 = slangImpl27.getAllEventTypes();
        io.cloudslang.score.api.Score score41 = slangImpl27.score;
        java.util.Set<java.lang.String> strSet42 = slangImpl27.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus43 = slangImpl27.eventBus;
        io.cloudslang.score.api.Score score44 = null;
        slangImpl27.score = score44;
        io.cloudslang.score.api.Score score46 = null;
        slangImpl27.score = score46;
        java.util.Set<java.lang.String> strSet48 = slangImpl27.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener26, strSet48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(score41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(eventBus43);
        org.junit.Assert.assertNotNull(strSet48);
    }

    @Test
    public void test17376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17376");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getLoggerRepository();
        org.apache.log4j.Category category9 = logger2.getParent();
        org.apache.log4j.Priority priority10 = logger2.getChainedPriority();
        org.apache.log4j.Appender appender11 = null;
        boolean boolean12 = logger2.isAttached(appender11);
        org.apache.log4j.Priority priority13 = logger2.getChainedPriority();
        org.apache.log4j.Priority priority14 = logger2.getChainedPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl15.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl15.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl15.compiler;
        java.lang.Class<?> wildcardClass28 = slangImpl15.getClass();
        org.apache.log4j.Logger logger29 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass28);
        // The following exception was thrown during execution in test generation
        try {
            logger2.trace((java.lang.Object) wildcardClass28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(category9);
// flaky:         org.junit.Assert.assertNull(priority10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNull(priority13);
// flaky:         org.junit.Assert.assertNull(priority14);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(logger29);
    }

    @Test
    public void test17377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17377");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        java.lang.Class<?> wildcardClass5 = logger1.getClass();
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = logger6.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17378");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test17379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17379");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        logger2.assertLog(true, "hi!");
        boolean boolean6 = logger2.getAdditivity();
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl7.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl7.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl7.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl7.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl7.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl7.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl7.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl7.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl7.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl7.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl7.score = score24;
        io.cloudslang.score.api.Score score26 = slangImpl7.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl7.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl7.getAllEventTypes();
        logger2.error((java.lang.Object) slangImpl7);
        io.cloudslang.score.events.ScoreEventListener scoreEventListener30 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl7.unSubscribeOnEvents(scoreEventListener30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test17380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17380");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test17381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17381");
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
    public void test17382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17382");
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
        org.apache.log4j.Level level12 = logger2.getLevel();
        java.util.ResourceBundle resourceBundle13 = null;
        logger2.setResourceBundle(resourceBundle13);
        org.apache.log4j.Level level15 = logger2.getPriority();
        logger2.removeAllAppenders();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
// flaky:         org.junit.Assert.assertNull(priority9);
        org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNull(level15);
    }

    @Test
    public void test17383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17383");
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
    public void test17384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17384");
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
    public void test17385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17385");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggingEvent loggingEvent2 = null;
        logger1.callAppenders(loggingEvent2);
        java.lang.Class<?> wildcardClass4 = logger1.getClass();
        org.apache.log4j.Category category5 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Appender appender8 = logger6.getAppender("root");
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger6.getHierarchy();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNull(appender8);
        org.junit.Assert.assertNotNull(loggerRepository9);
    }

    @Test
    public void test17386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17386");
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
    public void test17387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17387");
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
    public void test17388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17388");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Appender appender3 = logger1.getAppender("hi!");
        org.apache.log4j.Appender appender4 = null;
        logger1.addAppender(appender4);
        org.apache.log4j.Category category6 = logger1.getParent();
        boolean boolean7 = logger1.isTraceEnabled();
        java.util.Enumeration enumeration8 = logger1.getAllAppenders();
        org.apache.log4j.Category category9 = logger1.getParent();
        org.apache.log4j.Level level10 = logger1.getLevel();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender3);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(enumeration8);
        org.junit.Assert.assertNotNull(category9);
// flaky:         org.junit.Assert.assertNotNull(level10);
    }

    @Test
    public void test17389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17389");
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
    public void test17390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17390");
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
    public void test17391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17391");
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
    public void test17392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17392");
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
    public void test17393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17393");
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
    public void test17394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17394");
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
    public void test17395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17395");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getLoggerRepository();
        org.apache.log4j.Priority priority9 = logger2.getChainedPriority();
        logger2.setAdditivity(false);
        org.apache.log4j.spi.LoggerFactory loggerFactory13 = null;
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger("", loggerFactory13);
        java.util.ResourceBundle resourceBundle15 = null;
        logger14.setResourceBundle(resourceBundle15);
        org.apache.log4j.Appender appender17 = null;
        boolean boolean18 = logger14.isAttached(appender17);
        java.util.Enumeration enumeration19 = logger14.getAllAppenders();
        org.apache.log4j.spi.LoggerRepository loggerRepository20 = logger14.getLoggerRepository();
        org.apache.log4j.Level level21 = logger14.getLevel();
        java.lang.String str22 = logger14.getName();
        // The following exception was thrown during execution in test generation
        try {
            logger2.trace((java.lang.Object) logger14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
// flaky:         org.junit.Assert.assertNull(priority9);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertNull(enumeration19);
        org.junit.Assert.assertNotNull(loggerRepository20);
        org.junit.Assert.assertNull(level21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test17396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17396");
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
    public void test17397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17397");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        org.apache.log4j.Category category3 = logger2.getParent();
        org.apache.log4j.Level level4 = logger2.getEffectiveLevel();
        org.apache.log4j.Level level5 = null;
        logger2.setLevel(level5);
        boolean boolean7 = logger2.getAdditivity();
        io.cloudslang.lang.api.SlangImpl.logger = logger2;
        org.apache.log4j.Appender appender9 = null;
        logger2.removeAppender(appender9);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category3);
// flaky:         org.junit.Assert.assertNull(level4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17398");
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
    public void test17399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17399");
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
    public void test17400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17400");
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
    public void test17401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17401");
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
    public void test17402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17402");
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

    @Test
    public void test17403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17403");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource8 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray9 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet10 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet10, slangSourceArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact12 = slangImpl0.compile(slangSource8, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17404");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17405");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        boolean boolean3 = category1.getAdditivity();
        java.util.Enumeration enumeration4 = category1.getAllAppenders();
        org.apache.log4j.Category category6 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender7 = null;
        boolean boolean8 = category6.isAttached(appender7);
        org.apache.log4j.Appender appender9 = null;
        boolean boolean10 = category6.isAttached(appender9);
        java.lang.Class<?> wildcardClass11 = category6.getClass();
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger14 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category15 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass11);
        category1.fatal((java.lang.Object) wildcardClass11);
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass11);
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(enumeration4);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(category15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger20);
    }

    @Test
    public void test17406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17406");
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
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet22 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = slangImpl21.score;
        io.cloudslang.score.api.Score score27 = slangImpl21.score;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl21.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl21.score = score31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl21.compiler;
        java.lang.Throwable throwable34 = null;
        logger15.warn((java.lang.Object) slangImpl21, throwable34);
        boolean boolean36 = logger15.isInfoEnabled();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNull(resourceBundle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(priority19);
        org.junit.Assert.assertNotNull(loggerRepository20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test17407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17407");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        boolean boolean3 = category1.isAttached(appender2);
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = category1.isAttached(appender4);
        java.lang.Class<?> wildcardClass6 = category1.getClass();
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass6);
        org.apache.log4j.Appender appender8 = null;
        logger7.removeAppender(appender8);
        java.util.Enumeration enumeration10 = logger7.getAllAppenders();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(logger7);
// flaky:         org.junit.Assert.assertNotNull(enumeration10);
    }

    @Test
    public void test17408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17408");
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
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17409");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        org.apache.log4j.Appender appender5 = null;
        logger2.removeAppender(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        org.apache.log4j.Category category9 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender10 = null;
        category9.addAppender(appender10);
        category9.setAdditivity(true);
        java.lang.String str14 = category9.getName();
        category9.removeAppender("org.apache.log4j.Logger");
        org.apache.log4j.Level level17 = category9.getLevel();
        java.lang.Throwable throwable18 = null;
        logger2.warn((java.lang.Object) level17, throwable18);
        org.apache.log4j.Appender appender20 = null;
        logger2.addAppender(appender20);
        boolean boolean22 = logger2.getAdditivity();
        java.util.ResourceBundle resourceBundle23 = logger2.getResourceBundle();
        org.apache.log4j.Logger logger25 = org.apache.log4j.Logger.getLogger("root");
        org.apache.log4j.Priority priority26 = logger25.getChainedPriority();
        boolean boolean27 = logger25.isInfoEnabled();
        org.apache.log4j.Appender appender28 = null;
        boolean boolean29 = logger25.isAttached(appender28);
        org.apache.log4j.Level level30 = logger25.getLevel();
        logger2.fatal((java.lang.Object) level30);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(level17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(resourceBundle23);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(priority26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(level30);
    }

    @Test
    public void test17410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17410");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = null;
        logger1.setLevel(level2);
        logger1.removeAllAppenders();
        java.util.Enumeration enumeration5 = logger1.getAllAppenders();
        java.util.Enumeration enumeration6 = logger1.getAllAppenders();
        org.apache.log4j.Appender appender7 = null;
        logger1.addAppender(appender7);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(enumeration5);
        org.junit.Assert.assertNotNull(enumeration6);
    }

    @Test
    public void test17411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17411");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        java.util.Enumeration enumeration3 = logger1.getAllAppenders();
        java.lang.Object obj4 = null;
        logger1.trace(obj4);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertNotNull(enumeration3);
    }

    @Test
    public void test17412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17412");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.setAdditivity(true);
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository9 = logger1.getLoggerRepository();
        java.lang.String str10 = logger1.getName();
        org.apache.log4j.Level level11 = logger1.getPriority();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = logger1.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(loggerRepository9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(level11);
    }

    @Test
    public void test17413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17413");
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
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.apache.log4j.Category category21 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = null;
        slangImpl22.score = score23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl22.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl22.compiler = slangCompiler27;
        java.util.Set<java.lang.String> strSet29 = slangImpl22.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl22.compiler = slangCompiler30;
        java.util.Set<java.lang.String> strSet32 = slangImpl22.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl22.compiler;
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl22.eventBus;
        java.lang.Throwable throwable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            category21.error((java.lang.Object) eventBus34, throwable35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(category21);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNull(eventBus34);
    }

    @Test
    public void test17414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17414");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17415");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17416");
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
        org.apache.log4j.Appender appender13 = category11.getAppender("");
        org.apache.log4j.spi.LoggingEvent loggingEvent14 = null;
        category11.callAppenders(loggingEvent14);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(appender5);
        org.junit.Assert.assertNotNull(category6);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(category11);
        org.junit.Assert.assertNull(appender13);
    }

    @Test
    public void test17417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17417");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger2.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent4 = null;
        logger2.callAppenders(loggingEvent4);
        org.apache.log4j.Level level6 = logger2.getLevel();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger2.getLoggerRepository();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger2.getHierarchy();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNull(level6);
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNotNull(loggerRepository8);
    }

    @Test
    public void test17418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17418");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory1);
        org.apache.log4j.Category category3 = logger2.getParent();
        java.util.ResourceBundle resourceBundle4 = null;
        category3.setResourceBundle(resourceBundle4);
        org.apache.log4j.Appender appender6 = null;
        category3.addAppender(appender6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = category3.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(category3);
    }

    @Test
    public void test17419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17419");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.Appender appender3 = null;
        logger2.removeAppender(appender3);
        org.apache.log4j.Appender appender5 = null;
        logger2.removeAppender(appender5);
        java.util.ResourceBundle resourceBundle7 = logger2.getResourceBundle();
        boolean boolean8 = logger2.isTraceEnabled();
        org.apache.log4j.Category category9 = logger2.getParent();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(resourceBundle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(category9);
    }

    @Test
    public void test17420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17420");
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test17421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17421");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        logger2.removeAppender("io.cloudslang.lang.api.SlangImpl");
        java.lang.String str10 = logger2.getName();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(enumeration7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test17422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17422");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test17423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17423");
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
        org.apache.log4j.Logger logger16 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass14);
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass14);
        java.util.ResourceBundle resourceBundle18 = null;
        category17.setResourceBundle(resourceBundle18);
        java.util.Enumeration enumeration20 = category17.getAllAppenders();
        java.util.Enumeration enumeration21 = category17.getAllAppenders();
        org.apache.log4j.Appender appender22 = null;
        category17.addAppender(appender22);
        org.apache.log4j.Level level24 = category17.getLevel();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(enumeration20);
        org.junit.Assert.assertNotNull(enumeration21);
// flaky:         org.junit.Assert.assertNull(level24);
    }

    @Test
    public void test17424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17424");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository6 = logger1.getLoggerRepository();
        org.apache.log4j.Level level7 = logger1.getLevel();
        org.apache.log4j.spi.LoggerRepository loggerRepository8 = logger1.getLoggerRepository();
        org.apache.log4j.spi.LoggingEvent loggingEvent9 = null;
        logger1.callAppenders(loggingEvent9);
        java.util.Enumeration enumeration11 = logger1.getAllAppenders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = logger1.isDebugEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(loggerRepository6);
        org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertNotNull(loggerRepository8);
        org.junit.Assert.assertNotNull(enumeration11);
    }

    @Test
    public void test17425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17425");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.util.ResourceBundle resourceBundle4 = null;
        logger1.setResourceBundle(resourceBundle4);
        org.apache.log4j.Appender appender7 = logger1.getAppender("io.cloudslang.lang.api.SlangImpl");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNull(appender7);
    }

    @Test
    public void test17426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17426");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        boolean boolean8 = logger1.getAdditivity();
        org.apache.log4j.Logger logger9 = org.apache.log4j.Logger.getRootLogger();
        boolean boolean10 = logger9.getAdditivity();
        org.apache.log4j.spi.LoggerRepository loggerRepository11 = logger9.getHierarchy();
        org.apache.log4j.Level level12 = logger9.getPriority();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = logger1.isEnabledFor((org.apache.log4j.Priority) level12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(loggerRepository11);
// flaky:         org.junit.Assert.assertNull(level12);
    }

    @Test
    public void test17427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17427");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.apache.log4j.Category category17 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass16);
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass16);
        org.apache.log4j.Logger logger19 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(logger19);
    }

    @Test
    public void test17428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17428");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17429");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Appender appender2 = null;
        logger1.addAppender(appender2);
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getHierarchy();
        logger1.setAdditivity(false);
        logger1.assertLog(true, "hi!");
        logger1.removeAllAppenders();
        logger1.assertLog(true, "");
        org.apache.log4j.Level level14 = logger1.getPriority();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository4);
        org.junit.Assert.assertNull(level14);
    }

    @Test
    public void test17430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17430");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17431");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test17432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17432");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17433");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        category1.setAdditivity(true);
        java.lang.String str6 = category1.getName();
        org.apache.log4j.Level level7 = category1.getEffectiveLevel();
        org.apache.log4j.Category category8 = category1.getParent();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNull(level7);
        org.junit.Assert.assertNotNull(category8);
    }

    @Test
    public void test17434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17434");
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
        org.apache.log4j.spi.LoggingEvent loggingEvent10 = null;
        logger9.callAppenders(loggingEvent10);
        org.apache.log4j.Level level12 = logger9.getPriority();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
// flaky:         org.junit.Assert.assertNull(level12);
    }

    @Test
    public void test17435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17435");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.lang.String str4 = logger1.getName();
        org.apache.log4j.Level level5 = logger1.getLevel();
        java.util.Enumeration enumeration6 = logger1.getAllAppenders();
        org.apache.log4j.Appender appender7 = null;
        logger1.addAppender(appender7);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNull(resourceBundle2);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(level5);
        org.junit.Assert.assertNull(enumeration6);
    }

    @Test
    public void test17436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17436");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        category0.removeAllAppenders();
        category0.removeAppender("org.apache.log4j.Logger");
        org.apache.log4j.Appender appender9 = category0.getAppender("root");
        org.apache.log4j.Appender appender11 = category0.getAppender("java.util.HashSet");
        org.apache.log4j.Level level12 = category0.getPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl13.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl13.eventBus = eventBus20;
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            category0.error((java.lang.Object) eventBus20, throwable22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertNull(appender9);
        org.junit.Assert.assertNull(appender11);
// flaky:         org.junit.Assert.assertNull(level12);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test17437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17437");
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
        org.apache.log4j.Category category18 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass16);
        org.apache.log4j.Category category19 = category18.getParent();
        org.apache.log4j.spi.LoggerFactory loggerFactory21 = null;
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger("", loggerFactory21);
        org.apache.log4j.spi.LoggerRepository loggerRepository23 = logger22.getHierarchy();
        org.apache.log4j.spi.LoggingEvent loggingEvent24 = null;
        logger22.callAppenders(loggingEvent24);
        org.apache.log4j.spi.LoggingEvent loggingEvent26 = null;
        logger22.callAppenders(loggingEvent26);
        logger22.removeAllAppenders();
        // The following exception was thrown during execution in test generation
        try {
            category19.warn((java.lang.Object) logger22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertNotNull(category19);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(loggerRepository23);
    }

    @Test
    public void test17438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17438");
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
        org.apache.log4j.spi.LoggerRepository loggerRepository22 = logger21.getHierarchy();
        org.apache.log4j.Level level23 = logger21.getPriority();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(loggerRepository22);
// flaky:         org.junit.Assert.assertNull(level23);
    }

    @Test
    public void test17439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17439");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("root");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        java.util.Enumeration enumeration3 = logger1.getAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl4 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl4.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl4.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl4.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl4.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl4.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl4.getAllEventTypes();
        java.lang.Throwable throwable14 = null;
        logger1.warn((java.lang.Object) strSet13, throwable14);
        logger1.setAdditivity(false);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertNull(enumeration3);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17440");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = category0.isAttached(appender5);
        category0.removeAllAppenders();
        org.apache.log4j.Appender appender8 = null;
        boolean boolean9 = category0.isAttached(appender8);
        category0.removeAllAppenders();
        org.junit.Assert.assertNotNull(category0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17441");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.lang.String str3 = logger2.getName();
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger2.getHierarchy();
        org.apache.log4j.Priority priority5 = logger2.getChainedPriority();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(loggerRepository4);
// flaky:         org.junit.Assert.assertNull(priority5);
    }

    @Test
    public void test17442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17442");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.lang.String str3 = logger1.getName();
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        boolean boolean5 = logger1.getAdditivity();
        java.lang.String str6 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNull(priority4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17443");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17444");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test17445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17445");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17446");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        org.apache.log4j.Category category3 = logger1.getParent();
        boolean boolean4 = logger1.getAdditivity();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(priority2);
        org.junit.Assert.assertNotNull(category3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test17447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17447");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Category category2 = category1.getParent();
        java.util.Enumeration enumeration3 = category2.getAllAppenders();
        io.cloudslang.lang.api.SlangImpl slangImpl4 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl4.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl4.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl4.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl4.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl4.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl4.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl4.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl4.score = score17;
        java.lang.Class<?> wildcardClass19 = slangImpl4.getClass();
        org.apache.log4j.Logger logger20 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass19);
        org.apache.log4j.Logger logger21 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass19);
        org.apache.log4j.Logger logger22 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass19);
        org.apache.log4j.Category category23 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass19);
        org.apache.log4j.Category category24 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass19);
        category24.assertLog(true, "org.apache.log4j.Level");
        org.apache.log4j.Appender appender28 = null;
        category24.addAppender(appender28);
        org.apache.log4j.Priority priority30 = category24.getChainedPriority();
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            category2.l7dlog(priority30, "hi!", throwable32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertNotNull(category2);
        org.junit.Assert.assertNotNull(enumeration3);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(category23);
        org.junit.Assert.assertNotNull(category24);
// flaky:         org.junit.Assert.assertNull(priority30);
    }

    @Test
    public void test17448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17448");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("root", loggerFactory1);
        org.apache.log4j.spi.LoggerFactory loggerFactory4 = null;
        org.apache.log4j.Logger logger5 = org.apache.log4j.Logger.getLogger("org.apache.log4j.spi.RootLogger", loggerFactory4);
        org.apache.log4j.Category category6 = logger5.getParent();
        org.apache.log4j.spi.LoggerRepository loggerRepository7 = logger5.getHierarchy();
        org.apache.log4j.Level level8 = logger5.getLevel();
        logger2.setLevel(level8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = logger2.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(category6);
        org.junit.Assert.assertNotNull(loggerRepository7);
        org.junit.Assert.assertNull(level8);
    }

    @Test
    public void test17449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17449");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl9.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl9.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17450");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test17451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17451");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test17452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17452");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.Appender appender3 = null;
        boolean boolean4 = logger1.isAttached(appender3);
        java.util.Enumeration enumeration5 = logger1.getAllAppenders();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNull(enumeration5);
    }

    @Test
    public void test17453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17453");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.apache.log4j.Category category21 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass20);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(category21);
    }

    @Test
    public void test17454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17454");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("", loggerFactory1);
        java.util.ResourceBundle resourceBundle3 = null;
        logger2.setResourceBundle(resourceBundle3);
        org.apache.log4j.Appender appender5 = null;
        boolean boolean6 = logger2.isAttached(appender5);
        java.util.Enumeration enumeration7 = logger2.getAllAppenders();
        logger2.removeAppender("io.cloudslang.lang.api.SlangImpl");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = logger2.isTraceEnabled();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(enumeration7);
    }

    @Test
    public void test17455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17455");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl12.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl12.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl12.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl12.score;
        io.cloudslang.score.api.Score score22 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = null;
        slangImpl12.score = score26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl12.score = score28;
        io.cloudslang.score.api.Score score30 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet31 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test17456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17456");
        org.apache.log4j.spi.LoggerFactory loggerFactory1 = null;
        org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger("java.util.HashSet", loggerFactory1);
        org.apache.log4j.Level level3 = logger2.getLevel();
        java.util.ResourceBundle resourceBundle4 = logger2.getResourceBundle();
        logger2.removeAllAppenders();
        org.junit.Assert.assertNotNull(logger2);
// flaky:         org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNull(resourceBundle4);
    }

    @Test
    public void test17457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17457");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test17458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17458");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17459");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.apache.log4j.Category category13 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Category category14 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass12);
        org.apache.log4j.Logger logger15 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass12);
        org.apache.log4j.Appender appender16 = null;
        logger15.addAppender(appender16);
        org.apache.log4j.Category category18 = logger15.getParent();
        org.apache.log4j.Appender appender19 = null;
        boolean boolean20 = logger15.isAttached(appender19);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(category13);
        org.junit.Assert.assertNotNull(category14);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(category18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17460");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl19.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl19.compiler = slangCompiler27;
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test17461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17461");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test17462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17462");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test17463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17463");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.apache.log4j.Category category20 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass19);
        java.util.Enumeration enumeration21 = category20.getAllAppenders();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(category20);
        org.junit.Assert.assertNull(enumeration21);
    }

    @Test
    public void test17464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17464");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test17465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17465");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle2 = null;
        logger1.setResourceBundle(resourceBundle2);
        logger1.removeAllAppenders();
        org.apache.log4j.Category category5 = logger1.getParent();
        java.lang.String str6 = logger1.getName();
        org.apache.log4j.Level level7 = logger1.getEffectiveLevel();
        org.apache.log4j.Appender appender8 = null;
        logger1.removeAppender(appender8);
        org.apache.log4j.Level level10 = logger1.getEffectiveLevel();
        org.apache.log4j.Level level11 = logger1.getLevel();
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNull(level7);
// flaky:         org.junit.Assert.assertNull(level10);
        org.junit.Assert.assertNull(level11);
    }

    @Test
    public void test17466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17466");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17467");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test17468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17468");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("hi!");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.lang.Class<?> wildcardClass4 = logger1.getClass();
        org.apache.log4j.Category category5 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(loggerRepository3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(category5);
    }

    @Test
    public void test17469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17469");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test17470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17470");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass4 = strSet3.getClass();
        org.apache.log4j.Category category5 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger6 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger7 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        org.apache.log4j.Logger logger8 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass4);
        logger8.removeAppender("org.apache.log4j.spi.RootLogger");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(category5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test17471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17471");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score26);
    }

    @Test
    public void test17472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17472");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        org.apache.log4j.Appender appender2 = null;
        category1.addAppender(appender2);
        category1.setAdditivity(true);
        java.lang.String str6 = category1.getName();
        category1.removeAppender("org.apache.log4j.Logger");
        org.apache.log4j.Level level9 = category1.getLevel();
        org.apache.log4j.spi.LoggingEvent loggingEvent10 = null;
        category1.callAppenders(loggingEvent10);
        org.apache.log4j.Appender appender13 = category1.getAppender("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.spi.LoggerRepository loggerRepository14 = category1.getLoggerRepository();
        org.junit.Assert.assertNotNull(category1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(level9);
        org.junit.Assert.assertNull(appender13);
        org.junit.Assert.assertNotNull(loggerRepository14);
    }

    @Test
    public void test17473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17473");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17474");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17475");
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
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl14.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            logger1.info((java.lang.Object) slangImpl14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertNull(resourceBundle3);
        org.junit.Assert.assertNull(appender7);
        org.junit.Assert.assertNull(appender11);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test17476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17476");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.apache.log4j.Logger logger18 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass17);
        boolean boolean19 = logger18.isTraceEnabled();
        org.apache.log4j.Appender appender20 = null;
        logger18.removeAppender(appender20);
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17477");
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
        org.apache.log4j.Logger logger10 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        org.apache.log4j.Logger logger11 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        org.apache.log4j.Category category12 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass7);
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass7);
        org.apache.log4j.Appender appender14 = null;
        boolean boolean15 = logger13.isAttached(appender14);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(category8);
        org.junit.Assert.assertNotNull(category9);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(category12);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17478");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17479");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test17480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17480");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test17481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17481");
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
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17482");
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
        org.apache.log4j.spi.LoggerRepository loggerRepository12 = logger9.getLoggerRepository();
        io.cloudslang.lang.api.SlangImpl.logger = logger9;
        io.cloudslang.lang.api.SlangImpl.logger = logger9;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(loggerRepository12);
    }

    @Test
    public void test17483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17483");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17484");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test17485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17485");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17486");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test17487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17487");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test17488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17488");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl12.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl12.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl12.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet24 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test17489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17489");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17490");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test17491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17491");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test17492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17492");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangSource slangSource23 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray24 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet25 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet25, slangSourceArray24);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact27 = slangImpl0.compile(slangSource23, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test17493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17493");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.lang.String str3 = logger1.getName();
        org.apache.log4j.Appender appender4 = null;
        boolean boolean5 = logger1.isAttached(appender4);
        logger1.setAdditivity(false);
        org.apache.log4j.Appender appender9 = logger1.getAppender("root");
        org.apache.log4j.Appender appender10 = null;
        boolean boolean11 = logger1.isAttached(appender10);
        org.apache.log4j.Logger logger13 = org.apache.log4j.Logger.getLogger("");
        java.util.ResourceBundle resourceBundle14 = null;
        logger13.setResourceBundle(resourceBundle14);
        logger13.removeAllAppenders();
        org.apache.log4j.Category category17 = logger13.getParent();
        category17.removeAppender("");
        org.apache.log4j.spi.LoggingEvent loggingEvent20 = null;
        category17.callAppenders(loggingEvent20);
        org.apache.log4j.spi.LoggerRepository loggerRepository22 = category17.getHierarchy();
        // The following exception was thrown during execution in test generation
        try {
            logger1.warn((java.lang.Object) loggerRepository22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger1);
// flaky:         org.junit.Assert.assertNull(level2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(appender9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(category17);
        org.junit.Assert.assertNotNull(loggerRepository22);
    }

    @Test
    public void test17494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17494");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.apache.log4j.Category category16 = org.apache.log4j.Category.getInstance((java.lang.Class) wildcardClass15);
        org.apache.log4j.Logger logger17 = org.apache.log4j.Logger.getLogger((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(category16);
        org.junit.Assert.assertNotNull(logger17);
    }

    @Test
    public void test17495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17495");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17496");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test17497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17497");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17498");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17499");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17500");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler23);
    }
}
