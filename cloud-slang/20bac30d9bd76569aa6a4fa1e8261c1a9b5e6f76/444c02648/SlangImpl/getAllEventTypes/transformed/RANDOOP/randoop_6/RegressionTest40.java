import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = score16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl0.score = score27;
        io.cloudslang.score.api.Score score29 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score29);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = eventBus13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = slangImpl22.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl22.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl22.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl22.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet33 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet34 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet35 = slangImpl22.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl22.compiler = slangCompiler36;
        java.util.Set<java.lang.String> strSet38 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = score15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(eventBus24);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        java.util.Set<java.lang.String> strSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet7 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl6.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl6.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl6.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl6.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl6.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl6.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener5, strSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = slangCompiler9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = strSet18.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        java.util.Set<java.lang.String> strSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl18.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl18.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl18.score = score25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl18.score = score28;
        io.cloudslang.score.api.Score score30 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl18.eventBus = eventBus33;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score36 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet37 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource22 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray23 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet24 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet24, slangSourceArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact26 = slangImpl0.compile(slangSource22, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl13.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl13.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl13.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl13.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl13.compiler = slangCompiler26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl13.compiler = slangCompiler29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl13.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl12.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl12.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl12.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = null;
        slangImpl12.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl19.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet30 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet31 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl12.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl12.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl12.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl12.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl12.compiler = slangCompiler25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl12.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl12.score = score30;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet33 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl0.score = score27;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score26);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl13.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl13.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl13.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score28 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet29 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl13.score = score30;
        io.cloudslang.score.api.Score score32 = slangImpl13.score;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl13.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl0.score = score27;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener29 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl30 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score31 = slangImpl30.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl30.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl30.eventBus = eventBus34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl30.compiler;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl30.score = score37;
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl30.eventBus;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl30.score = score40;
        io.cloudslang.score.api.Score score42 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet43 = slangImpl30.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = slangImpl30.compiler;
        io.cloudslang.score.api.Score score45 = null;
        slangImpl30.score = score45;
        java.util.Set<java.lang.String> strSet47 = slangImpl30.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener29, strSet47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNull(score42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(slangCompiler44);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score25 = slangImpl24.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl24.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = null;
        slangImpl24.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl24.eventBus = eventBus32;
        io.cloudslang.score.api.Score score34 = slangImpl24.score;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl24.eventBus;
        io.cloudslang.score.events.EventBus eventBus36 = null;
        slangImpl24.eventBus = eventBus36;
        io.cloudslang.score.events.EventBus eventBus38 = slangImpl24.eventBus;
        io.cloudslang.score.events.EventBus eventBus39 = slangImpl24.eventBus;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl24.score = score40;
        java.util.Set<java.lang.String> strSet42 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNull(eventBus38);
        org.junit.Assert.assertNull(eventBus39);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource9 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray10 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet11 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11, slangSourceArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact13 = slangImpl0.compile(slangSource9, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl9.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl9.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl9.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl9.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl9.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl9.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl9.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl9.eventBus = eventBus31;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl9.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl14.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl14.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource9 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray10 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet11 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11, slangSourceArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact13 = slangImpl0.compile(slangSource9, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        java.lang.Class<?> wildcardClass25 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl21.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl21.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl21.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet27 = slangImpl21.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl21.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, (java.util.Set<java.lang.String>) strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl20.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl20.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl20.compiler;
        java.util.Set<java.lang.String> strSet29 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet30 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = eventBus15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl19.eventBus = eventBus23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl19.score = score26;
        java.util.Set<java.lang.String> strSet28 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl0.compiler = slangCompiler28;
        io.cloudslang.score.api.Score score30 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(score30);
    }

    @Test
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl16.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl16.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl16.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl16.score = score24;
        io.cloudslang.score.api.Score score26 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl16.compiler;
        java.util.Set<java.lang.String> strSet28 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score24 = slangImpl23.score;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl23.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl23.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl23.eventBus;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl23.eventBus;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl23.eventBus = eventBus31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl23.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl23.compiler;
        java.util.Set<java.lang.String> strSet36 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20206");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20207");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20208");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus26);
    }

    @Test
    public void test20209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20209");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20210");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20211");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test20212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20212");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = strSet14.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20213");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test20214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20214");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test20215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20215");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20216");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20217");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl15.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl15.eventBus;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl15.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score24 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test20218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20218");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20219");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test20220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20220");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test20221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20221");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20222");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20223");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20224");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl10.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl10.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl10.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl10.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl10.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = slangImpl10.score;
        io.cloudslang.score.api.Score score24 = slangImpl10.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test20225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20225");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test20226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20226");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20227");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(slangCompiler1);
    }

    @Test
    public void test20228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20228");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20229");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20230");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20231");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl9.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl9.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl9.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test20232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20232");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test20233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20233");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20234");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20235");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20236");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20237");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20238");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test20239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20239");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20240");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test20241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20241");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20242");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20243");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test20244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20244");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test20245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20245");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20246");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test20247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20247");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20248");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20249");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test20250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20250");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20251");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test20252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20252");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl23.compiler;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl23.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl23.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl23.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl23.compiler = slangCompiler30;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl23.score = score32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl23.compiler = slangCompiler34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl23.compiler = slangCompiler36;
        java.util.Set<java.lang.String> strSet38 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test20253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20253");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20254");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20255");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test20256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20256");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score7 = slangImpl6.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl6.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl6.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl6.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl6.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl6.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl6.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl6.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl6.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl6.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener5, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test20257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20257");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test20258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20258");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl16.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl16.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl16.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl16.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl16.eventBus = eventBus26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl16.eventBus;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl16.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test20259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20259");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score7 = slangImpl6.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl6.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl6.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl6.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl6.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl6.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl6.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl6.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl6.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl6.score = score23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl6.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl6.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener5, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test20260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20260");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.score.api.Score score14 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl12.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl12.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test20261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20261");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20262");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20263");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
    }

    @Test
    public void test20264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20264");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test20265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20265");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test20266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20266");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test20267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20267");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20268");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl0.score = score26;
        java.util.Set<java.lang.String> strSet28 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener29 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl30 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score31 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet32 = slangImpl30.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet34 = slangImpl30.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl30.compiler = slangCompiler35;
        io.cloudslang.score.events.EventBus eventBus37 = null;
        slangImpl30.eventBus = eventBus37;
        io.cloudslang.score.api.Score score39 = null;
        slangImpl30.score = score39;
        io.cloudslang.score.events.EventBus eventBus41 = slangImpl30.eventBus;
        io.cloudslang.score.events.EventBus eventBus42 = slangImpl30.eventBus;
        io.cloudslang.score.api.Score score43 = null;
        slangImpl30.score = score43;
        io.cloudslang.score.api.Score score45 = slangImpl30.score;
        java.util.Set<java.lang.String> strSet46 = slangImpl30.getAllEventTypes();
        java.util.Set<java.lang.String> strSet47 = slangImpl30.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener29, strSet47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(eventBus41);
        org.junit.Assert.assertNull(eventBus42);
        org.junit.Assert.assertNull(score45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test20269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20269");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20270");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20271");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20272");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20273");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangSource slangSource24 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray25 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet26 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet26, slangSourceArray25);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact28 = slangImpl0.compile(slangSource24, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20274");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test20275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20275");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20276");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(slangSourceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20277");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20278");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test20279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20279");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20280");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test20281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20281");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20282");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20283");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20284");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl14.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl14.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score24 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl14.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl14.eventBus = eventBus27;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl14.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet32 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test20285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20285");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test20286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20286");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test20287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20287");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test20288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20288");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20289");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet26 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(eventBus28);
    }

    @Test
    public void test20290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20290");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20291");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20292");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20293");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangSource slangSource9 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray10 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet11 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11, slangSourceArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact13 = slangImpl0.compile(slangSource9, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20294");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test20295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20295");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl21.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl21.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl21.eventBus = eventBus27;
        java.util.Set<java.lang.String> strSet29 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test20296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20296");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20297");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test20298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20298");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20299");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20300");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl9.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl9.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl9.score;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl9.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl9.eventBus;
        io.cloudslang.score.api.Score score24 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test20301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20301");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20302");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20303");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test20304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20304");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl21.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl21.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl21.compiler;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl21.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl21.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl21.eventBus = eventBus32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl21.compiler = slangCompiler34;
        java.util.Set<java.lang.String> strSet36 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet37 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test20305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20305");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20306");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl0.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = slangImpl0.score;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl0.score = score29;
        io.cloudslang.lang.compiler.SlangSource slangSource31 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray32 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet33 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet33, slangSourceArray32);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact35 = slangImpl0.compile(slangSource31, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(slangSourceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test20307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20307");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl18.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl18.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl18.score = score29;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl18.eventBus = eventBus31;
        io.cloudslang.score.api.Score score33 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet34 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test20308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20308");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test20309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20309");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20310");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20311");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20312");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20313");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20314");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet17 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl16.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl16.eventBus;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl16.score = score23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl16.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.api.Score score28 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl16.compiler = slangCompiler29;
        java.util.Set<java.lang.String> strSet31 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test20315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20315");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test20316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20316");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl14.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl14.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl14.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl14.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test20317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20317");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20318");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20319");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20320");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test20321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20321");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20322");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource5 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray6 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet7 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet7, slangSourceArray6);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact9 = slangImpl0.compile(slangSource5, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(slangSourceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20323");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = score12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20324");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20325");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass6 = strSet5.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20326");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test20327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20327");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test20328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20328");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20329");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test20330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20330");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20331");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20332");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20333");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test20334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20334");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20335");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test20336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20336");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20337");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20338");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20339");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20340");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass22 = strSet21.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20341");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = eventBus21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20342");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20343");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test20344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20344");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test20345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20345");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20346");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet15 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20347");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20348");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20349");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test20350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20350");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test20351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20351");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test20352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20352");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20353");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test20354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20354");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20355");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20356");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20357");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test20358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20358");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20359");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test20360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20360");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20361");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test20362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20362");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20363");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl15.score;
        io.cloudslang.score.api.Score score20 = slangImpl15.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl15.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl15.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl15.compiler = slangCompiler26;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl15.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test20364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20364");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test20365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20365");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test20366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20366");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20367");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20368");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet12 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl11.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl11.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl11.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl11.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl11.compiler = slangCompiler22;
        java.util.Set<java.lang.String> strSet24 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test20369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20369");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test20370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20370");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20371");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20372");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test20373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20373");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test20374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20374");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test20375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20375");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test20376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20376");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20377");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20378");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test20379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20379");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score25 = slangImpl24.score;
        java.util.Set<java.lang.String> strSet26 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.api.Score score27 = slangImpl24.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl24.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl24.compiler = slangCompiler29;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl24.eventBus = eventBus31;
        java.util.Set<java.lang.String> strSet33 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.api.Score score34 = slangImpl24.score;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl24.score = score35;
        java.util.Set<java.lang.String> strSet37 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test20380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20380");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl17.eventBus;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl17.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl17.eventBus;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl17.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score27 = null;
        slangImpl17.score = score27;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl17.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test20381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20381");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        java.util.Set<java.lang.String> strSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test20382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20382");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20383");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test20384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20384");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20385");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.lang.compiler.SlangSource slangSource27 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray28 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet29 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet29, slangSourceArray28);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact31 = slangImpl0.compile(slangSource27, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(slangSourceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test20386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20386");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20387");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test20388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20388");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test20389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20389");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource18 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource18, slangSourceSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20390");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20391");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20392");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20393");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20394");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20395");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test20396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20396");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20397");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20398");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test20399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20399");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test20400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20400");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score27 = slangImpl26.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl26.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl26.eventBus = eventBus30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl26.score = score33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl26.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl26.score = score37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus40 = slangImpl26.eventBus;
        io.cloudslang.score.events.EventBus eventBus41 = slangImpl26.eventBus;
        io.cloudslang.score.api.Score score42 = null;
        slangImpl26.score = score42;
        io.cloudslang.score.api.Score score44 = slangImpl26.score;
        io.cloudslang.score.api.Score score45 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet46 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNull(eventBus40);
        org.junit.Assert.assertNull(eventBus41);
        org.junit.Assert.assertNull(score44);
        org.junit.Assert.assertNull(score45);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test20401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20401");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test20402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20402");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test20403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20403");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test20404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20404");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20405");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test20406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20406");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20407");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test20408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20408");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20409");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl13.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl13.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl13.score;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl13.compiler = slangCompiler24;
        java.util.Set<java.lang.String> strSet26 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test20410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20410");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test20411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20411");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test20412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20412");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = slangCompiler14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test20413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20413");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test20414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20414");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet10 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl9.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl9.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl9.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl9.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl9.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl9.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl9.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl9.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl9.eventBus = eventBus24;
        java.util.Set<java.lang.String> strSet26 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet27 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test20415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20415");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20416");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20417");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
    }

    @Test
    public void test20418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20418");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet13 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl12.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl12.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl12.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl12.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test20419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20419");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl21.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl21.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl21.eventBus;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl21.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test20420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20420");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test20421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20421");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test20422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20422");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test20423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20423");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20424");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test20425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20425");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test20426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20426");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20427");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20428");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20429");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangSource slangSource14 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact16 = slangImpl0.compile(slangSource14, slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20430");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20431");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl14.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl14.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score25 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl14.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test20432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20432");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test20433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20433");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20434");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test20435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20435");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl18.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl18.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl18.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl18.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl18.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl18.compiler = slangCompiler34;
        java.util.Set<java.lang.String> strSet36 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test20436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20436");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20437");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test20438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20438");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test20439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20439");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl16.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl16.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl16.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl16.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl16.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test20440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20440");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test20441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20441");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl17.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl17.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl17.score = score23;
        io.cloudslang.score.api.Score score25 = slangImpl17.score;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl17.score = score26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet30 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test20442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20442");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl9.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl9.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl9.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl9.score;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl9.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl9.compiler;
        java.util.Set<java.lang.String> strSet23 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl9.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test20443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20443");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test20444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20444");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20445");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test20446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20446");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test20447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20447");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource22 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray23 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet24 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet24, slangSourceArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact26 = slangImpl0.compile(slangSource22, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20448");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20449");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test20450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20450");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20451");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20452");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test20453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20453");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test20454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20454");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test20455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20455");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20456");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20457");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test20458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20458");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test20459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20459");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test20460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20460");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test20461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20461");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20462");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20463");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test20464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20464");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20465");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20466");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test20467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20467");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl20.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl20.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl20.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = slangImpl20.score;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl20.score = score29;
        io.cloudslang.score.api.Score score31 = slangImpl20.score;
        io.cloudslang.score.api.Score score32 = slangImpl20.score;
        io.cloudslang.score.api.Score score33 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl20.compiler;
        io.cloudslang.score.api.Score score35 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet36 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test20468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20468");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test20469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20469");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test20470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20470");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl14.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl14.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl14.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl14.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = slangImpl14.score;
        java.util.Set<java.lang.String> strSet32 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test20471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20471");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test20472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20472");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20473");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test20474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20474");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20475");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray17 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet18 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18, slangSourceArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact20 = slangImpl0.compile(slangSource16, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20476");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl12.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl12.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl12.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl12.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test20477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20477");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl20.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl20.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl20.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl20.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl20.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus33 = slangImpl20.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl20.compiler = slangCompiler34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl20.compiler = slangCompiler36;
        java.util.Set<java.lang.String> strSet38 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(eventBus33);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test20478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20478");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test20479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20479");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test20480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20480");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test20481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20481");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test20482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20482");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test20483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20483");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20484");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = eventBus13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test20485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20485");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test20486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20486");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20487");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test20488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20488");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test20489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20489");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score28 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl0.compiler = slangCompiler31;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNull(slangCompiler30);
    }

    @Test
    public void test20490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20490");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test20491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20491");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test20492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20492");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl19.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl19.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl19.compiler;
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl19.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl19.compiler = slangCompiler32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl19.score = score34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl19.compiler = slangCompiler36;
        io.cloudslang.score.events.EventBus eventBus38 = null;
        slangImpl19.eventBus = eventBus38;
        java.util.Set<java.lang.String> strSet40 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test20493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20493");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20494");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test20495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20495");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score25 = slangImpl24.score;
        io.cloudslang.score.api.Score score26 = slangImpl24.score;
        io.cloudslang.score.api.Score score27 = slangImpl24.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl24.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl24.eventBus = eventBus30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl24.eventBus = eventBus32;
        java.util.Set<java.lang.String> strSet34 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test20496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20496");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangSource slangSource13 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray14 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet15 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15, slangSourceArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource13, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20497");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20498");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test20499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20499");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20500");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
    }
}

