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
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        java.util.Enumeration enumeration1 = category0.getAllAppenders();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        category0.assertLog(false, "org.apache.log4j.spi.RootLogger");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getLoggerRepository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        logger1.assertLog(false, "org.apache.log4j.Logger");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = logger1.isDebugEnabled();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        java.util.Enumeration enumeration3 = logger1.getAllAppenders();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = logger1.isTraceEnabled();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = logger1.isTraceEnabled();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Level");
        category1.removeAllAppenders();
        java.lang.String str3 = category1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = category1.isInfoEnabled();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.lang.String str3 = logger1.getName();
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        boolean boolean5 = logger1.getAdditivity();
        java.util.ResourceBundle resourceBundle6 = logger1.getResourceBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = logger1.isInfoEnabled();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = logger1.isDebugEnabled();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        java.util.ResourceBundle resourceBundle3 = logger1.getResourceBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = logger1.isInfoEnabled();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("io.cloudslang.lang.api.SlangImpl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = logger1.isDebugEnabled();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        java.util.ResourceBundle resourceBundle3 = logger1.getResourceBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = logger1.isInfoEnabled();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        org.apache.log4j.spi.LoggerRepository loggerRepository4 = logger1.getLoggerRepository();
        logger1.assertLog(true, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = logger1.isDebugEnabled();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.log4j.Logger logger0 = org.apache.log4j.Logger.getRootLogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = logger0.isTraceEnabled();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("root");
        org.apache.log4j.Category category2 = category1.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        category2.assertLog(false, "org.apache.log4j.Logger");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("hi!");
        org.apache.log4j.Level level2 = category1.getLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = category1.isDebugEnabled();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = category1.isInfoEnabled();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Logger");
        java.util.Enumeration enumeration2 = logger1.getAllAppenders();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = logger1.isTraceEnabled();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("root");
        org.apache.log4j.Level level2 = category1.getLevel();
        org.apache.log4j.Category category3 = category1.getParent();
        org.apache.log4j.Priority priority4 = category3.getChainedPriority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = category3.isDebugEnabled();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.Level");
        org.apache.log4j.Priority priority2 = logger1.getChainedPriority();
        io.cloudslang.lang.api.SlangImpl slangImpl3 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl3.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl3.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl3.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl3.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl3.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl3.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl3.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl3.getAllEventTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        logger1.warn((java.lang.Object) slangImpl3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("root");
        logger1.setAdditivity(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = logger1.isTraceEnabled();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("");
        org.apache.log4j.Level level2 = logger1.getEffectiveLevel();
        java.lang.String str3 = logger1.getName();
        org.apache.log4j.Priority priority4 = logger1.getChainedPriority();
        boolean boolean5 = logger1.getAdditivity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = logger1.isInfoEnabled();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.spi.RootLogger");
        org.apache.log4j.Appender appender3 = category1.getAppender("org.apache.log4j.Level");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        category1.assertLog(false, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.log4j.Category category1 = org.apache.log4j.Category.getInstance("org.apache.log4j.Logger");
        boolean boolean2 = category1.getAdditivity();
        category1.removeAppender("hi!");
        io.cloudslang.lang.api.SlangImpl slangImpl5 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl5.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl5.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl5.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl5.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl5.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl5.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl5.getAllEventTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        category1.debug((java.lang.Object) strSet12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        java.util.ResourceBundle resourceBundle2 = logger1.getResourceBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = logger1.isInfoEnabled();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("");
        org.apache.log4j.Level level2 = logger1.getPriority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = logger1.isTraceEnabled();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Category.exists("org.apache.log4j.spi.RootLogger");
        io.cloudslang.lang.api.SlangImpl.logger = logger1;
        org.apache.log4j.spi.LoggerRepository loggerRepository3 = logger1.getLoggerRepository();
        java.util.Enumeration enumeration4 = logger1.getAllAppenders();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = logger1.isTraceEnabled();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.log4j.Category category0 = org.apache.log4j.Category.getRoot();
        category0.removeAppender("hi!");
        category0.removeAppender("hi!");
        category0.removeAllAppenders();
        category0.removeAppender("org.apache.log4j.Logger");
        boolean boolean8 = category0.getAdditivity();
        org.apache.log4j.Level level9 = category0.getPriority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = category0.isInfoEnabled();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("hi!");
        logger1.removeAppender("root");
        java.util.ResourceBundle resourceBundle4 = logger1.getResourceBundle();
        logger1.removeAllAppenders();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = logger1.isDebugEnabled();
    }
}

